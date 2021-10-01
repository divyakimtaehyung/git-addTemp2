package com.iexceed.uiframework.PageObjects.CorporateOnboarding.ReviewSubmissionDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewSubmissionPage extends TestBase {
    @FindBy(id="crponb__BasePage__submitBtn")
    WebElement SubmitBtn;
    @FindBy(id="crponb__BasePage__el_btn_9")
    WebElement CancelBtn;

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


    public ReviewSubmissionPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);

    }



    public void ClickSubmitAppBtn() throws Exception {
        waitUtility.waitTillElementVisible(driver,SubmitBtn,5);
        javaScriptControls.executeJavaScript("arguments[0].click();",SubmitBtn);
    }



}
