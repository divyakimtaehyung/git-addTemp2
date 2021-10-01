package com.iexceed.uiframework.PageObjects.CorporateOnboarding.OwnerShipDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OwnershipPage extends TestBase {

    //Application continue Btn

    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;
//owner

    @FindBy(id="appdtl__Ownership__parentEntity_option_Yes_span_")
    WebElement ownershipPrntYes;
    @FindBy(id="appdtl__Ownership__parentEntity_option_No_span_")
    WebElement ownershipPrntNO;
    @FindBy(id="appdtl__Ownership__parentEntityReg_option_Yes_span_")
    WebElement ownershipPrntRegYes;
    @FindBy(id="appdtl__Ownership__parentEntityReg_option_No_span_")
    WebElement ownershipPrntRegNO;
    @FindBy(id="appdtl__Ownership__i__ownershipDetail__parentEntityDetails")
    WebElement ownershipPrntDetails;
    @FindBy(id="appdtl__Ownership__i__ownershipDetail__nameOfParentRegulated")
    WebElement ownershipRegDetails;
    @FindBy(id="appdtl__Ownership__subsidary_option_Yes_span_")
    WebElement ownershipSubYes;
    @FindBy(id="appdtl__Ownership__subsidary_option_No_span_")
    WebElement ownershipSubNo;
    @FindBy(id="appdtl__Ownership__el_txt_14_txtcnt")
    WebElement addSubidary;
    @FindBy(id="appdtl__Ownership__subsidaryLegalEntName")
    WebElement subLegalName;
    @FindBy(id="select2-appdtl__Ownership__subsidaryCountry-container")
    WebElement subCountryDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__Ownership__subsidaryCountry-results\"]/li")
    WebElement subCountryList;
    @FindBy(xpath="//button[@id='appdtl__Ownership__el_btn_5']")
    WebElement subConfirmBtn;
    @FindBy(xpath="//button[@id='appdtl__Ownership__el_btn_6']")
    WebElement subCancelBtn;


    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;
    public MouseControls mouseControls;


    public OwnershipPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);
        mouseControls=new MouseControls(driver);

    }




    public void corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(5);
        commonElements.click(CrpContinueBtn);

    }


    public void setOwnership(String ownerParentDetails) throws Exception {

        waitUtility.waitTillElementVisible(driver,ownershipPrntYes,50);
        javaScriptControls.executeJavaScript("arguments[0].click();",ownershipPrntYes);
        javaScriptControls.executeJavaScript("arguments[0].click();",ownershipPrntRegYes);
        textBoxControls.setText(ownershipPrntDetails,ownerParentDetails);

        try{
            if(ownershipRegDetails.isDisplayed()){

                textBoxControls.setText(ownershipRegDetails,ownerParentDetails);
            }
        }catch(Exception e){}

        javaScriptControls.executeJavaScript("arguments[0].click();",ownershipSubNo);


    }


}


