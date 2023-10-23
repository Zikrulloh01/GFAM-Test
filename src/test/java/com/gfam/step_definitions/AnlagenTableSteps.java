package com.gfam.step_definitions;

import com.gfam.utilities.BrowserUtils;
import com.gfam.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AnlagenTableSteps {
    @When("User clicks on the eye icon {string}")
    public void user_clicks_on_the_eye_icon(String string) {
        String path = "(//*[@shape='eye'])[" + string + "]";
        Driver.getDriver().findElement(By.xpath(path)).click();
        BrowserUtils.waitFor(5);
    }


    @Then("Verify the table column sequence")
    public void verify_the_table_column_sequence() {
        List<String> expectedSequence = new ArrayList<>();
        List<String> actualSequence = new ArrayList<>();
        expectedSequence.add("Local-ID + Anlage-Nr.");
        expectedSequence.add("Bericht gemäß");
        expectedSequence.add("Name");
        expectedSequence.add("Betriebsort");
        expectedSequence.add("Anlage-Nr./AN-Nr.");
        expectedSequence.add("Bezeichnung");
        expectedSequence.add("Bearbeitungsstatus");
        expectedSequence.add("Aktionen");
        for (WebElement element : Driver.getDriver().findElements(By.cssSelector(".datagrid-column-title.ng-star-inserted"))) {
            actualSequence.add(element.getText());
        }
        Assert.assertEquals("Column Names Sequence Did Not Match",expectedSequence, actualSequence);
        System.out.println("expectedSequence = " + expectedSequence);
        System.out.println("actualSequence = " + actualSequence);
    }
}
