package com.gfam.step_definitions;

import com.gfam.utilities.BrowserUtils;
import com.gfam.utilities.Driver;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class EditSteps {


    @When("User clicks on the eye icon")
    public void user_clicks_on_the_eye_icon() {
        Driver.getDriver().findElement(By.xpath("(//*[@shape='eye'])[1]")).click();
        BrowserUtils.waitFor(3);
    }

    @When("User clicks on the eye icon of anlagen {string}")
    public void user_clicks_on_the_eye_icon_of_anlagen(String string) {
        String path = "(//*[@shape='eye'])[" + string + "]";
        Driver.getDriver().findElement(By.xpath(path)).click();
        BrowserUtils.waitFor(3);
    }
    @Then("Verify forms are editable by default")
    public void verify_forms_are_editable_by_default() {
        Driver.getDriver().findElement(By.id("quelleBezeichnung")).sendKeys("testing");
        Assert.assertTrue("Save button is not clickable", Driver.getDriver().findElement(By.xpath("//button[contains(text(),' Speichern ')]")).isEnabled());
        Driver.getDriver().findElement(By.xpath("//button[contains(text(),' Speichern ')]")).click();
        Driver.getDriver().findElement(By.xpath("//button[text()='Ok']")).click();
        Assert.assertTrue("Success message is not displayed", Driver.getDriver().findElement(By.xpath("//*[@class='alert-icon-wrapper']")).isDisplayed());
    }


}
