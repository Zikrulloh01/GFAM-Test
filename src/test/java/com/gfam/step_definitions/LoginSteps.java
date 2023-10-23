package com.gfam.step_definitions;

import com.gfam.pages.LoginPage;
import com.gfam.utilities.BrowserUtils;
import com.gfam.utilities.ConfigurationsReader;
import com.gfam.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("User goes to the url")
    public void user_goes_to_the_url() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationsReader.get("test-url"));
        BrowserUtils.waitFor(2);
    }


    @When("User enters username")
    public void user_enters_username() {
        loginPage.usernameInput.sendKeys(ConfigurationsReader.get("username"));
    }
    @When("User enters password")
    public void user_enters_password() {
        loginPage.passwordInput.sendKeys(ConfigurationsReader.get("password"));
    }
    @When("User clicks sign in button")
    public void user_clicks_sign_in_button() {
        loginPage.loginButton.click();
        BrowserUtils.waitFor(8);
    }
    @Then("Verify user is on GFA page")
    public void verify_user_is_on_GFA_page() {
        Assert.assertTrue(loginPage.headerBetriebsstätten.isDisplayed());
    }

}
