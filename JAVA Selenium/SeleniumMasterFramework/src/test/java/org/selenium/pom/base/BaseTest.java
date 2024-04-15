package org.selenium.pom.base;

import org.openqa.selenium.WebDriver;
import org.selenium.pom.factory.DriverManager;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;

    public BaseTest(WebDriver driver) {
    }

    public WebDriver BaseTest(WebDriver driver) {
        return driver;
    }

    @BeforeMethod
    public void startDriver(){
        driver = new DriverManager().initializeDriver();
    }

    @AfterMethod
    public void quitDriver(ITestResult result){
    }

}
