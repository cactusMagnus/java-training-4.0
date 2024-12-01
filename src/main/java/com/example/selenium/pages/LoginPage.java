package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // TODO define username, password, and login WebElements using @FindBy

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String text) {
        // TODO set username
        return this;
    }

    public LoginPage setPassword(String text) {
        // TODO set password
        return this;
    }

    public MainPage clickLogin() {
        // TODO click logout return instance of MainPage
        return null;
    }
}
