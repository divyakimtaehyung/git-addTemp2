package com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IncorporationPage extends TestBase {


    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;




    //incorporation
    @FindBy(id="appdtl__EntityDetails__i__entityInfo__dateOfIncorporation")
    WebElement DateofInCorp;
    @FindBy(xpath="//span[@id='appdtl__EntityDetails__el_txt_71_txtcnt']")
    WebElement IncorpLable;







    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public IncorporationPage(){
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



    public CommercialLincensePage corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(3);
        commonElements.click(CrpContinueBtn);
        return new CommercialLincensePage();
    }



    public void incorpDate(String date) throws Exception {
        waitUtility.waitTillElementVisible(driver,DateofInCorp,50);
//        Thread.sleep(8000);

        try {
            javaScriptControls.executeJavaScript("arguments[0].click();", DateofInCorp);
            textBoxControls.setText(DateofInCorp,date);
            commonElements.click(IncorpLable);
        }catch(Exception e) {
            commonElements.click(DateofInCorp);
            textBoxControls.setText(DateofInCorp, date);
            commonElements.click(IncorpLable);

        }
        corpuserContinue();
    }


}

