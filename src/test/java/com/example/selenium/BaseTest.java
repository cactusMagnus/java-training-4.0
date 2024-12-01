package com.example.selenium;

import com.example.selenium.steps.UserSteps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;

    @BeforeClass
    public void setUp() {
        // TODO initialize a driver, open login URL, resize windows, and initialize steps
    }

    @AfterClass
    public void tearDown() {
        // TODO driver close and quit
    }
}
