package com.gfam.step_definitions;
import com.gfam.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxMultiSelection {


    @When("User clicks on select all checkbox")
    public void user_clicks_on_select_all_checkbox() {
        Driver.getDriver().findElement(By.xpath("//div[@class='clr-checkbox-wrapper']")).click();
    }

    @Then("Verify all checkboxes are selected")
    public void verify_all_checkboxes_are_selected() {
        for (WebElement element : Driver.getDriver().findElements(By.xpath("//input[contains(@id,'clr-dg')]"))) {
            Assert.assertTrue("Checkbox is not selected", element.isSelected());
            System.out.println("PASSED");
        }

    }



}
