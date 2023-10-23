package com.gfam.step_definitions;

import com.gfam.pages.LoginPage;
import com.gfam.utilities.BrowserUtils;
import com.gfam.utilities.Driver;
import org.openqa.selenium.By;

public class Sample {


    public static void main(String[] args) {


        LoginPage loginPage = new LoginPage();
        loginPage.loginBetreiber();

        Driver.getDriver().findElement(By.xpath("(//*[@shape='eye'])[1]")).click();
        BrowserUtils.waitFor(3);
        Driver.getDriver().findElement(By.xpath("//*[@for='clr-dg-select-all-clr-id-78']")).click();
        BrowserUtils.waitFor(5);


    }


}
