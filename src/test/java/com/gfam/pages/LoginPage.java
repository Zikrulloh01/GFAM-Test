package com.gfam.pages;

import com.gfam.utilities.BrowserUtils;
import com.gfam.utilities.ConfigurationsReader;
import com.gfam.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {



    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "kc-login")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Betriebsstätten']")
    public WebElement headerBetriebsstätten;




    public void loginBetreiber(){
        Driver.getDriver().get(ConfigurationsReader.get("test-url"));
        BrowserUtils.waitFor(4);
        usernameInput.sendKeys(ConfigurationsReader.get("username"));
        passwordInput.sendKeys(ConfigurationsReader.get("password"));
        loginButton.click();
        BrowserUtils.waitFor(8);
    }


    public void loginBehoerde(){
        Driver.getDriver().get(ConfigurationsReader.get("test-url"));
        BrowserUtils.waitFor(4);
        usernameInput.sendKeys(ConfigurationsReader.get("behoerde-username"));
        passwordInput.sendKeys(ConfigurationsReader.get("password"));
        loginButton.click();
        BrowserUtils.waitFor(8);
    }


}
