package com.iexceed.uiframework.PageObjects.Android;

import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.iexceed.uiframework.PageObjects.Android.AndroidCabilities.driver;


public class VerifyIdentityPage {

    By passportId           =By.xpath("//*[@text='Passport Id*']");
    By dateOfIssue          =By.xpath("//*[@text='Date Of Issue *']");
    By cancelBtn            =By.xpath("//*[@text='CANCEL']");
    By dateOfExpiry         =By.xpath("//*[@text='Date Of Expiry *']");
    By issueAuthority       =By.xpath("//*[@text='Issuing Authority *']");
    By issueCountry         =By.xpath("//*[@text='Issuing Country *']");
    By searchBox            =By.xpath("//*[@text='Search']");
    By issueCountryDDList   =By.xpath("//android.widget.TextView[@resource-id='com.iexceed.retailonboarding:id/list_textview']");
    By continueBtn          =By.xpath("//*[@text='Continue']");

    private WaitUtility waitUtility;
    public VerifyIdentityPage(){
        waitUtility= new WaitUtility();
    }

    public void enterPassportIdentity(String passportid) throws Exception {
        waitUtility.waitForSeconds(3);
       driver.findElement(passportId).click();
       driver.findElement(passportId).sendKeys(passportid);
    }

    public void DateOfissuePassport_Expiry(String issuedate,String expiryDate) throws Exception {
        driver.findElement(dateOfIssue).click();
        driver.findElement(cancelBtn).click();
        driver.findElement(dateOfIssue).sendKeys(issuedate);
        waitUtility.waitForSeconds(2);
        driver.findElement(dateOfExpiry).click();
        driver.findElement(cancelBtn).click();
        driver.findElement(dateOfExpiry).sendKeys(expiryDate);
    }

    public void enterIssueAuthorityDetails(String authority){
        driver.findElement(issueAuthority).click();
        driver.findElement(issueAuthority).sendKeys(authority);
    }


    public void selectPassportIssueCountry(String issuecountry) throws Exception {
        driver.findElement(issueCountry).click();
        waitUtility.waitForSeconds(3);
        driver.findElement(searchBox).click();
        driver.findElement(searchBox).sendKeys(issuecountry);
        int size=driver.findElements(issueCountryDDList).size();
        System.out.println(driver.findElements(issueCountryDDList).size());
        List<WebElement> tempList= (List<WebElement>) driver.findElements(issueCountryDDList);
        selectionOfDropdown(issuecountry,tempList);
        ClickContinue();
    }

    public void ClickContinue(){
       driver.findElement(continueBtn).click();
   }


    public void selectionOfDropdown (String itemType, List<WebElement> type){
        for (WebElement name : type) {
            if ((name.getText()).equalsIgnoreCase(itemType)) {
                name.click();
                break;
            }
        }
    }


}
