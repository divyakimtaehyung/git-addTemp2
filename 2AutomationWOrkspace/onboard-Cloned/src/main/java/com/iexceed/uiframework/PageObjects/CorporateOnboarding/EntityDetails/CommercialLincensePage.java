package com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommercialLincensePage extends TestBase {


    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;




    //Commercial linence
    @FindBy(id="appdtl__EntityDetails__i__entCommercialLicense__commLicenseNumber")
    WebElement commLicenseNum;
    @FindBy(id="appdtl__EntityDetails__i__entCommercialLicense__commLicenseIssuedBy")
    WebElement commIssuedBY;
    @FindBy(id="appdtl__EntityDetails__i__entCommercialLicense__businessActivities")
    WebElement commLicenseActivity;
    @FindBy(id="appdtl__EntityDetails__i__entCommercialLicense__commLicenseIssueDate")
    WebElement commIssuedDate;
    @FindBy(id="appdtl__EntityDetails__i__entCommercialLicense__commLicenseExpiryDate")
    WebElement commExpireddDate;
    @FindBy(xpath="//span[@id='appdtl__EntityDetails__el_txt_73_txtcnt']")
    WebElement commercilaLicenseLAble;








    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public CommercialLincensePage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);

    }


    public void selectionOfDropdown (String itemType, List < WebElement > type){
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }



    public SourceOfFundPage corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(3);
        commonElements.click(CrpContinueBtn);
        return new SourceOfFundPage();
    }



    public void LicenseIssueDate(String licenseNum,String licenseIssuedBy,String businesActivity,String IssueDate,String expiraryDate) throws Exception {
        waitUtility.waitTillElementVisible(driver,commLicenseNum,47);
        textBoxControls.setText(commLicenseNum,licenseNum);
        textBoxControls.setText(commIssuedBY,licenseIssuedBy);
        textBoxControls.setText(commLicenseActivity,businesActivity);
        javaScriptControls.executeJavaScript("arguments[0].click();", commIssuedDate);
        textBoxControls.setText(commIssuedDate,IssueDate);
        javaScriptControls.executeJavaScript("arguments[0].click();", commExpireddDate);
        textBoxControls.setText(commExpireddDate,expiraryDate);
        commonElements.click(commercilaLicenseLAble);
        corpuserContinue();

    }


}

