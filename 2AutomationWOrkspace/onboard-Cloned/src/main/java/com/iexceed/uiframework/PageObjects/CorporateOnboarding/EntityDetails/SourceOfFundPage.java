package com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SourceOfFundPage extends TestBase {


    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;


    //source of fund
    @FindBy(id="appdtl__EntityDetails__el_txt_83_txtcnt")
    WebElement addSourceFund;
    @FindBy(xpath="//span[@id='select2-appdtl__EntityDetails__SOF-container']")
    WebElement sourceFundDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__SOF-results']/li")
    List<WebElement> sourceFundList;
    @FindBy(xpath="//span[@id='select2-appdtl__EntityDetails__SOFCountry-container']")
    WebElement sourceCountryDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__SOFCountry-results']/li")
    List<WebElement> sourceCountryList;
    @FindBy(id="appdtl__EntityDetails__SOFDesc")
    WebElement sourceFundDesc;
    @FindBy(id="appdtl__EntityDetails__SOFConfirmBtn_txtcnt")
    WebElement SOFConfirmBtn;
    @FindBy(id="appdtl__EntityDetails__SOFCancelBtn_txtcnt")
    WebElement SOFCancelBtn;

    //source of wealth
    @FindBy(id="appdtl__EntityDetails__el_txt_87_txtcnt")
    WebElement addSourceWealth;
    @FindBy(xpath="//span[@id='select2-appdtl__EntityDetails__SOW-container']")
    WebElement sourceWealthDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__SOW-results']/li")
    List<WebElement> sourceWealthList;
    @FindBy(id="appdtl__EntityDetails__SOWDesc")
    WebElement sourceWealthDesc;
    @FindBy(id="appdtl__EntityDetails__SOWConfirmBtn_txtcnt")
    WebElement SOWConfirmBtn;
    @FindBy(id="appdtl__EntityDetails__SOWCancelBtn_txtcnt")
    WebElement SOWCancelBtn;






    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public SourceOfFundPage(){
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



    public SourceOfWealth corpuserContinue() throws Exception {

        commonElements.click(CrpContinueBtn);
        return new SourceOfWealth();
    }


    public void sourceFund(String srcFund,String CountrySrcFund,String fundDesc) throws Exception {
        waitUtility.waitTillElementVisible(driver,addSourceFund,40);
        javaScriptControls.executeJavaScript("arguments[0].click();", addSourceFund);
        commonElements.click(sourceFundDD);
        selectionOfDropdown(srcFund,sourceFundList);
        commonElements.click(sourceCountryDD);
        selectionOfDropdown(CountrySrcFund,sourceCountryList);
        textBoxControls.setText(sourceFundDesc,fundDesc);
        commonElements.click(SOFConfirmBtn);
         corpuserContinue();


    }


}

