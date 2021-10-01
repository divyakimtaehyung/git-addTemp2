package com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SourceOfWealth extends TestBase {



    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;


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


    public SourceOfWealth(){
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


    public void corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(4);
        commonElements.click(CrpContinueBtn);

            }


    public void sourcewealth(String SrcWealth,String SrcWealthDesc) throws Exception {
        waitUtility.waitTillElementVisible(driver,addSourceWealth,55);
        javaScriptControls.executeJavaScript("arguments[0].click();", addSourceWealth);
        commonElements.click(sourceWealthDD);
        selectionOfDropdown(SrcWealth,sourceWealthList);
        textBoxControls.setText(sourceWealthDesc,SrcWealthDesc);
        commonElements.click(SOWConfirmBtn);
        waitUtility.waitForSeconds(4);
        corpuserContinue();
    }

}

