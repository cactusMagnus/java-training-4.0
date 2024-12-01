package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends com.example.selenium.pages.BasePage {

    // TODO define title and logout WebElements using @FindBy

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        // TODO return title text
        return null;
    }

    public MainPage clickLogout() {
        // TODO click logout and return MainPage
        return this;
    }
}
