package com.Vytrack.pages;

import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dynamicallyLoadedPage {
    public dynamicallyLoadedPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "button[class='btn btn-primary']")
    public WebElement startButton;

    @FindBy(css = "input[type='username']")
    public WebElement usernameBox;

    @FindBy(css = "input[type='password']")
    public WebElement passwordBox;

    @FindBy(css = "button[type='submit']")
    public WebElement submitBox;

    @FindBy(css = "div[class='flash success']")
    public WebElement successMessage;

    @FindBy(css = "div[class='flash error']")
    public WebElement loginFailedMessage;

    @FindBy(css = "a[class='button secondary radius']")
    public WebElement logoutButton;

    @FindBy(css = "div[class='flash success']")
    public WebElement logoutSuccessMessage;

    @FindBy(css = "div[id='finish']")
    public WebElement HelloWorld;

    public void loginDynamic(String username, String password){

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitBox.click();

    }
}
