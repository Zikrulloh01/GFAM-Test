package com.gfam.step_definitions;

import com.gfam.utilities.BrowserUtils;
import com.gfam.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DeleteButton {

    WebElement deleteButton = Driver.getDriver().findElement(By.xpath("//button[.=' Löschen ']"));

    @Then("Verify there is a delete button on top of the anlage table")
    public void verify_there_is_a_delete_button_on_top_of_the_anlage_table() {
        Assert.assertTrue("Delete button is not displayed", deleteButton.isDisplayed());
    }

    @Then("Verify delete button is disabled")
    public void verify_delete_button_is_disabled() {
        Assert.assertFalse("Delete button is Enabled",deleteButton.isEnabled());
    }

    @Then("Verify Delete button is enabled")
    public void verify_Delete_button_is_enabled() {
        Assert.assertTrue("Delete button is Disabled",deleteButton.isEnabled());
    }


    @When("User clicks delete button and confirms deletion")
    public void user_clicks_delete_button_and_confirms_deletion() {
        deleteButton.click();
        BrowserUtils.waitFor(2);
        Driver.getDriver().findElement(By.xpath("//button[.=' OK ']")).click();
        BrowserUtils.waitFor(2);
    }


    @Then("Verify there is a success message and Bearbeitungsstatus of anlage should be unbearbeitet")
    public void verify_there_is_a_success_message_and_Bearbeitungsstatus_of_anlage_should_be_unbearbeitet() {
        String text = Driver.getDriver().findElement(By.xpath("//span[@class='alert-text']")).getText();
        Assert.assertTrue("Success message is not Displayed", Driver.getDriver().findElement(By.xpath("//span[@class='alert-text']")).isDisplayed());
        System.out.println("Success Message: " + text);
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//*[@style='width: 176px;']"));
        for (int i = 1; i < elements.size() ; i++) {
            Assert.assertEquals("Status did not match","unbearbeitet", elements.get(i).getText());
            System.out.println(elements.get(i).getText());
        }
        BrowserUtils.waitFor(2);

    }

}
