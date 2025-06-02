package com.TheTestingAcademy.pages.pageObjectModel.normal_POM;

import org.openqa.selenium.By;

import static com.TheTestingAcademy.driver.DriverManager.driver;

public class LoginPage {

    public String loginToVWOLoginInvalidCreds(String username, String password) {
        // Perform login with invalid credentials
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        // Return error message text
        return driver.findElement(By.id("error-msg")).getText(); // Adjust locator as needed
    }

    public void loginToVWOLoginValidCreds(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click(); // Adjust locator if needed
    }

}
