package com.TheTestingAcademy.tests.pageObjectModelTest;

import com.TheTestingAcademy.base.CommonToAllTest;
import com.TheTestingAcademy.listerners.RetryAnalyzer;
import com.TheTestingAcademy.listerners.ScreenshotListener;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.TheTestingAcademy.base.CommonToAllTest;
import com.TheTestingAcademy.listerners.RetryAnalyzer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;

import static com.TheTestingAcademy.driver.DriverManager.getDriver;

@Listeners(ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyzer.class)
public class TestVWOLogin_03_Retry extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_03_Retry.class);

    @Owner("Reena")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testFail() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        Allure.addAttachment("Log output", "text/plain", "This is some log text");
        Assert.assertTrue(false);
    }

    @Owner("Reena")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testPass() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        Assert.assertTrue(true);
    }


}