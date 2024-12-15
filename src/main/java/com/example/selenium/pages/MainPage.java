package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(how = How.CSS, using = "h2")
    private WebElement title;

    @FindBy(how = How.CSS, using = ".icon-2x")
    private WebElement logoutButton;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return title.getText();
    }

    public MainPage clickLogout() {
        logoutButton.click();
        return this;
    }
}
