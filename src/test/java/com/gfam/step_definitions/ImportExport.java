package com.gfam.step_definitions;

import com.gfam.pages.LoginPage;
import com.gfam.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ImportExport {


    LoginPage loginPage = new LoginPage();


    @Given("User logged in as a behoerde")
    public void user_logged_in_as_a_behoerde() {
        loginPage.loginBehoerde();
    }

    @Then("Verify Import icon is displayed and clickable")
    public void verify_Import_icon_is_displayed_and_clickable() {
        Assert.assertTrue("Import icon is not displayed", Driver.getDriver().findElement(By.xpath("//*[@shape='import']")).isDisplayed());
        Assert.assertTrue("Import icon is not clickable", Driver.getDriver().findElement(By.xpath("//*[@shape='import']")).isEnabled());
    }


    @Then("Verify Export icon is displayed and clickable")
    public void verify_Export_icon_is_displayed_and_clickable() {
        Assert.assertTrue("Export icon is not displayed", Driver.getDriver().findElement(By.xpath("//*[@shape='export']")).isDisplayed());
        Assert.assertTrue("EXport icon is not clickable", Driver.getDriver().findElement(By.xpath("//*[@shape='export']")).isEnabled());
    }


}
