package com.TheTestingAcademy.tests.pageObjectModelTest;

import com.TheTestingAcademy.base.CommonToAllPage;
import com.TheTestingAcademy.base.baseTest;
import com.TheTestingAcademy.pages.pageObjectModel.normal_POM.DashBoardPage;
import com.TheTestingAcademy.pages.pageObjectModel.improved_POM.LoginPage;

import com.TheTestingAcademy.base.baseTest;
import com.TheTestingAcademy.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import static com.TheTestingAcademy.driver.DriverManager.driver;
import static com.TheTestingAcademy.driver.DriverManager.getDriver;
import static org.assertj.core.api.Assertions.*;
import org.testng.Assert;

public class TestVWOLogin_01_NormalScript_POM extends baseTest {

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() {

        //  Use getDriver() here
        LoginPage loginPage = new LoginPage(getDriver());
        String error_msg = loginPage.loginToVWOLoginInvalidCreds(
                PropertiesReader.readKey("invalid_username"),
                PropertiesReader.readKey("invalid_password")
        );

        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));
    }

    @Owner("Reena")
    @Description("TC#2-Verify that valid creds dashboard page is loaded")
    @Test
    public void testLoginPositiveVWO() {

        //  Use getDriver() here too
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToVWOLoginValidCreds(PropertiesReader.readKey("username"),
                PropertiesReader.readKey("password")
        );

        DashBoardPage dashBoardPage  = new DashBoardPage(getDriver());
        String usernameLoggedIn = dashBoardPage.loggedInUserName();

        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(usernameLoggedIn, PropertiesReader.readKey("expected_username"));
    }
}
