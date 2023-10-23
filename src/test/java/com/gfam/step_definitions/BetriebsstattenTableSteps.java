package com.gfam.step_definitions;

import com.gfam.pages.LoginPage;
import com.gfam.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BetriebsstattenTableSteps {

    LoginPage loginPage = new LoginPage();

    @Given("User logged in as a betreiber")
    public void user_logged_in_as_a_betreiber() {
        loginPage.loginBetreiber();
    }

    @When("User closes the sidebar")
    public void user_closes_the_sidebar() {
        Driver.getDriver().findElement(By.xpath("(//div[@class='content-container']//button)[3]")).click();
    }
    @Then("Verify year dropdown is visible")
    public void verify_year_dropdown_is_visible() {
        Assert.assertTrue(Driver.getDriver().findElement(By.id("clr-form-control-24")).isDisplayed());

        if (Driver.getDriver().findElement(By.id("clr-form-control-24")).isDisplayed())
        {
            Select select = new Select(Driver.getDriver().findElement(By.id("clr-form-control-24")));
            for (WebElement option : select.getOptions()) {
                System.out.println(option.getText());
            }

        }
    }
}
