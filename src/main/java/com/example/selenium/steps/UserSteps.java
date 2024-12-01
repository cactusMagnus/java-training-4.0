package com.example.selenium.steps;

import org.openqa.selenium.WebDriver;

public class UserSteps {
    private WebDriver driver;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public com.example.selenium.steps.UserSteps login(String username, String password) {
        // TODO initialize LoginPage, call setUsername, setPassword, and click login methods

        //  TODO assert title
        return this;
    }

    public UserSteps logout() {
        // TODO call logout method
        return this;
    }
}
