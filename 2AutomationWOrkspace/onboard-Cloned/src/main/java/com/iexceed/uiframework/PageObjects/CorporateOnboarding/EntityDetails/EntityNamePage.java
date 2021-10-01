package com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EntityNamePage extends TestBase {

    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;

    //entityname
    @FindBy(id="appdtl__EntityDetails__i__entityInfo__legalName")
    WebElement legalName;
    @FindBy(id="appdtl__EntityDetails__i__entityInfo__tradeName")
    WebElement tradeName;
    @FindBy(id="select2-appdtl__EntityDetails__i__entityInfo__legalEntityTypeCode-container")
    WebElement legalentityType;
    @FindBy(xpath="//ul[@id='select2-appdtl__EntityDetails__i__entityInfo__legalEntityTypeCode-results']/li")
    List<WebElement> legalentityTypeDD;
    @FindBy(id="appdtl__EntityDetails__i__entityInfo__previousKnownAs")
    WebElement previousCompanyKnow;
    @FindBy(id="appdtl__EntityDetails__i__entityInfo__previousTradingAs")
    WebElement previousTradeAs;





    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;



    public EntityNamePage(){
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


    public void entityNameaAndType(String LgName,String TrdName,String legalType,String previousComName,String previousTrdName) throws Exception {
        waitUtility.waitTillElementVisible(driver,legalName,50);
        textBoxControls.setText(legalName,LgName);
        waitUtility.waitTillElementVisible(driver,tradeName,5);
        textBoxControls.setText(tradeName,TrdName);
        commonElements.click(legalentityType);
        selectionOfDropdown(legalType,legalentityTypeDD);
        waitUtility.waitTillElementVisible(driver,previousCompanyKnow,6);
        textBoxControls.setText(previousCompanyKnow,previousComName);
        waitUtility.waitTillElementVisible(driver,previousTradeAs,5);
        textBoxControls.setText(previousTradeAs,previousTrdName);
        corpuserContinue();

    }


    public EntityContactPage corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(4);
        commonElements.click(CrpContinueBtn);
        return new EntityContactPage();

    }




}
