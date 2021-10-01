package com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ValueAddedTaxPage extends TestBase {



    //tax declaration lable
    @FindBy(xpath="//span[@id='crponb__MenuListData__i__Menu6__Header_txtcnt']")
    WebElement TaxDeclareLable;
//value added taxx

    @FindBy(id="appdtl__TaxDetails__isVAT_option_Yes_span_")
    WebElement VATYes;
    @FindBy(id="appdtl__TaxDetails__i__taxVat__vatTrnNo")
    WebElement VATNunmber;
    @FindBy(id="appdtl__TaxDetails__isVAT_option_No_span_")
    WebElement VATNo;



    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public ValueAddedTaxPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);

    }


    //Application continue Btn

    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;


    public TaxResidencyPage corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(5);
        commonElements.click(CrpContinueBtn);
        return new TaxResidencyPage();
    }

    public void selectionOfDropdown (String itemType, List < WebElement > type){
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }

    public void  VATregister(String vatNum) throws Exception {
//        commonElements.click(TaxDeclareLable);
        Thread.sleep(20000);
        waitUtility.waitTillElementVisible(driver,VATYes,47);
        commonElements.click(VATYes);
        textBoxControls.setText(VATNunmber,vatNum);
        corpuserContinue();
    }


}

