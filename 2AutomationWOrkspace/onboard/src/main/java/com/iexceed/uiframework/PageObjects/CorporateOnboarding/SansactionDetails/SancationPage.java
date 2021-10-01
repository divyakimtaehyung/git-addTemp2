package com.iexceed.uiframework.PageObjects.CorporateOnboarding.SansactionDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SancationPage extends TestBase {

    @FindBy(id="appdtl__SanctionsDetails__sanctionVal_0_option_Yes_span_0")
    WebElement sancDetail0Yes;
    @FindBy(id="appdtl__SanctionsDetails__sanctionVal_0_option_No_span_0")
    WebElement sancDetail0NO;
    @FindBy(id="appdtl__SanctionsDetails__sanctionVal_1_option_Yes_span_1")
    WebElement sancDetail1Yes;
    @FindBy(id="appdtl__SanctionsDetails__sanctionVal_1_option_No_span_1")
    WebElement sancDetail1NO;
    @FindBy(id="appdtl__SanctionsDetails__sanctionVal_2_option_Yes_span_2")
    WebElement sancDetail2Yes;
    @FindBy(xpath="//label[@id='appdtl__SanctionsDetails__sanctionVal_2_option_No_span_2']")
    WebElement sancDetail2NO;
    @FindBy(id="appdtl__SanctionsDetails__sanctionVal_3_option_Yes_span_3")
    WebElement sancDetail3Yes;
    @FindBy(xpath="//label[@id='appdtl__SanctionsDetails__sanctionVal_3_option_No_span_3']")
    WebElement sancDetail3NO;
    @FindBy(id="appdtl__SanctionsDetails__sanctionVal_4_option_Yes_span_4")
    WebElement sancDetail4Yes;
    @FindBy(xpath="//label[@id='appdtl__SanctionsDetails__sanctionVal_4_option_No_span_4']")
    WebElement sancDetail4NO;



    //Application continue Btn

    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;

    //application number
    @FindBy(id="appdtl__Common__applnNum_txtcnt")
    WebElement appNumber;
    String APPName;

    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public SancationPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);

    }

    public void corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(2);
        commonElements.click(CrpContinueBtn);

    }



    public String getAppName() throws Exception {
        String TempApp=commonElements.getText(appNumber);
        APPName=TempApp.split(":")[1];
        return APPName;

    }




    public void sensitiveSanctionDetails() throws Exception {
        waitUtility.waitTillElementVisible(driver,sancDetail0NO,57);

        commonElements.click(sancDetail0NO);
        commonElements.click(sancDetail1NO);
        javaScriptControls.executeJavaScript("arguments[0].click();", sancDetail2NO);
        javaScriptControls.executeJavaScript("arguments[0].click();", sancDetail3NO);
        javaScriptControls.executeJavaScript("arguments[0].click();", sancDetail4NO);
        corpuserContinue();
    }


}
