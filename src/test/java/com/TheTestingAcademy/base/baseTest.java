package com.TheTestingAcademy.base;



import com.TheTestingAcademy.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {

    @BeforeMethod
    public void setUp() {
        DriverManager.init();                                //  Initializes browser (chrome/edge/firefox)
        DriverManager.setDriver(DriverManager.getDriver());  //  Sets the driver globally
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.down();  //  Closes and quits browser after test
    }
}
