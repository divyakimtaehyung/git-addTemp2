package com.iexceed.uiframework.PageObjects.CorporateOnboarding.AssociatedPartyDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EntityDetailsPage extends TestBase {


    //EntityDetails
    @FindBy(id="appdtl__PartyDetails__el_txt_52_txtcnt")
    WebElement addnewEntity;
    @FindBy(id="appdtl__PartyDetails__entDirBtn")
    WebElement DirectorBtn;
    @FindBy(id="appdtl__PartyDetails__entUBOBtn_txtcnt")
    WebElement UBOBtn;
    @FindBy(id="appdtl__PartyDetails__entLegalName")
    WebElement entLegalName;
    @FindBy(id="appdtl__PartyDetails__entDOI")
    WebElement DOFInCorp;
    @FindBy(xpath="//span[@id='select2-appdtl__PartyDetails__entCOI-container']")
    WebElement IncorpCountryDD;
    @FindBy(xpath="//*[@id='select2-appdtl__PartyDetails__entCOI-results']/li")
    List<WebElement> IncorpCountryList;
    @FindBy(xpath="//span[@id='select2-appdtl__PartyDetails__entCOD-container']")
    WebElement countryDomicileDD;
    @FindBy(xpath="//*[@id='select2-appdtl__PartyDetails__entCOD-results']/li")
    List<WebElement> countryDomiileList;
    @FindBy(xpath="//span[@id='select2-appdtl__PartyDetails__entLegalType-container']")
    WebElement legalEntityType;
    @FindBy(id="//li[text()='UBO - Fund']")
    WebElement legalEntitytyprListFund;
    @FindBy(xpath="//*[@id='select2-appdtl__PartyDetails__entLegalType-results']/li")
    List<WebElement> legalEntitytyprList;
    @FindBy(xpath="//input[@role='searchbox']")
    WebElement legalEntitytypeRoleSearch;

    @FindBy(xpath="//span[@id='select2-appdtl__PartyDetails__entOfficeCode-container']")
    WebElement EntityOffNumDD;
    @FindBy(xpath="//ul[@id='select2-appdtl__PartyDetails__entOfficeCode-results']/li")
    List<WebElement> EntityOffNumList;
    @FindBy(id="appdtl__PartyDetails__entOfficeNo")
    WebElement EntityOfficeNumer;
    @FindBy(xpath="//span[@id='select2-appdtl__PartyDetails__entMobileCode-container']")
    WebElement EntityMobNumDD;
    @FindBy(xpath="//*[@id='select2-appdtl__PartyDetails__entMobileCode-results']/li")
    List<WebElement> EntityMobNumList;
    @FindBy(id="appdtl__PartyDetails__entMobileNo")
    WebElement EntityMobileNum;
    @FindBy(id="appdtl__PartyDetails__entEmail")
    WebElement entityEmail;
    @FindBy(id="appdtl__PartyDetails__PEP_option_Yes_span_")
    WebElement EntityPepYES;
    @FindBy(id="appdtl__PartyDetails__isPEP")
    WebElement EntityPepYESDesc;
    @FindBy(id="appdtl__PartyDetails__PEP_option_No_span_")
    WebElement EntityPepNO;
    @FindBy(id="appdtl__PartyDetails__PO_option_Yes_span_")
    WebElement EntityPubOfficeYES;
    @FindBy(id="appdtl__PartyDetails__PO_option_No_span_")
    WebElement EntityPubOficeNO;
    @FindBy(id="appdtl__PartyDetails__POHolder_option_Yes_span_")
    WebElement EntityPOHoldrYES;
    @FindBy(id="appdtl__PartyDetails__isPOHolder")
    WebElement EntityPOHoldrYESDesc;
    @FindBy(id="appdtl__PartyDetails__POHolder_option_No_span_")
    WebElement EntityPOHoldrNO;
    @FindBy(id="appdtl__PartyDetails__stateOwnedEntp_option_Yes_span_")
    WebElement stateOwnEntYES;
    @FindBy(id="appdtl__PartyDetails__stateOwnEntpName")
    WebElement stateEntityName;
    @FindBy(id="select2-appdtl__PartyDetails__stateOwnEntpCountry-container")
    WebElement entityOwnCountryDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__PartyDetails__stateOwnEntpCountry-results\"]/li")
    List<WebElement> entityOwnCountryList;
    @FindBy(id="appdtl__PartyDetails__stateOwnEntpDesc")
    WebElement entityOwnDesc;
    @FindBy(id="appdtl__PartyDetails__stateOwnEntpFund")
    WebElement entityOwnFund;
    @FindBy(id="appdtl__PartyDetails__stateOwnedEntp_option_No_span_")
    WebElement stateOwnEntNO;
    @FindBy(id="appdtl__PartyDetails__entDtlsConfirmBtn")
    WebElement EntityConfirmBtn;
    @FindBy(id="appdtl__PartyDetails__entDtlsCancelBtn_txtcnt")
    WebElement EntityCancelBtn;
    @FindBy(id="appdtl__PartyDetails__noEntyDtlsCB_lbl")
    WebElement EntityConfirmCkBx;


    //Application continue Btn

    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;


    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public EntityDetailsPage(){
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
        waitUtility.waitForSeconds(2);
        commonElements.click(CrpContinueBtn);
        Thread.sleep(10000);
    }


    public void addNeWEntity() throws Exception {

        waitUtility.waitTillElementVisible(driver,addnewEntity,15);
        javaScriptControls.executeJavaScript("arguments[0].click();",addnewEntity);

    }


    public void enterEntityDetails(String entityName,String DOBIn,String country,String domicineCountry,String LegalEntity) throws Exception {
        commonElements.click(UBOBtn);
        commonElements.click(IncorpCountryDD);
        selectionOfDropdown(country,IncorpCountryList);
        commonElements.click(countryDomicileDD);
        selectionOfDropdown(domicineCountry,countryDomiileList);

        try {
            commonElements.click(legalEntityType);
            driver.findElement(By.xpath("//li[text()='UBO - Fund']")).click();
//        String LegalEntityTemp=LegalEntity;
//        selectionOfDropdown(LegalEntity,legalEntitytyprList);

        }catch(Exception e){
            javaScriptControls.executeJavaScript("arguments[0].click();",legalEntityType);
            javaScriptControls.executeJavaScript("arguments[0].click();",legalEntitytyprListFund);
        }


        textBoxControls.setText(DOFInCorp,DOBIn);
        textBoxControls.setText(entLegalName,entityName);



    }

    public void EntityContactDetails(String OffCode,String OffNum,String mbcode,String MobNum,String email,String entityDesc,String LegalEntity) throws Exception {
        commonElements.click(EntityOffNumDD);
        String mcode = "+"+OffCode;
        selectionOfDropdown(mcode,EntityOffNumList);
        textBoxControls.setText(EntityOfficeNumer,OffNum);

        commonElements.click(EntityMobNumDD);
        String mcode1 = "+"+mbcode;
        waitUtility.waitForSeconds(2);
        selectionOfDropdown(mcode1,EntityMobNumList);
        textBoxControls.setText(EntityMobileNum,MobNum);
        textBoxControls.setText(entityEmail,email);
        commonElements.click(EntityPepYES);
        textBoxControls.setText(EntityPepYESDesc,entityDesc);
        commonElements.click(EntityPubOficeNO);
        commonElements.click(stateOwnEntNO);

        try {
            commonElements.click(EntityConfirmBtn);
        }catch(Exception e){
            commonElements.click(EntityCancelBtn);

        }

    }

    public void ClickEntityCheckBox() throws Exception {
        waitUtility.waitTillElementVisible(driver,EntityConfirmCkBx,46);
        commonElements.click(EntityConfirmCkBx);
    }

}
