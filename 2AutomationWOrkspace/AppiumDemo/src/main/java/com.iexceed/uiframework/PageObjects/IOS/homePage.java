package com.iexceed.uiframework.PageObjects.IOS;

import static com.iexceed.uiframework.PageObjects.IOS.IOSCabilities.driver;

import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class homePage {

    By language_English = By.xpath("//*[@name='English']");
    By application_Btn = By.xpath("//*[@name='Show Personal & Contact Detail']");


    private WaitUtility waitUtility;

    public homePage() {
        waitUtility = new WaitUtility();
    }

    public void selectLanguage() throws Exception {
        waitUtility.waitForSeconds(8);

        try {
            if (driver.findElement(language_English).isDisplayed()) {
                driver.findElement(language_English).click();
                driver.findElement(application_Btn).click();
            }
        }
        catch(Exception e){

        }
    }
}
