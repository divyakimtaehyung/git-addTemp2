package com.iexceed.uiframework.PageObjects.CorporateOnboarding.AssociatedPartyDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InduvidualDetailsPage extends TestBase {

    //individuals
    @FindBy(id="appdtl__PartyDetails__el_txt_9_txtcnt")
    WebElement addnewIndividuals;
    @FindBy(id="appdtl__PartyDetails__AuthSign_lbl")
    WebElement authSingChkBx;
    @FindBy(id="appdtl__PartyDetails__director_lbl")
    WebElement directorChkBx;
    @FindBy(id="appdtl__PartyDetails__seniorMngr_lbl")
    WebElement seniorMngrChkBx;
    @FindBy(id="appdtl__PartyDetails__UBO_lbl")
    WebElement UBOCkhBx;
    @FindBy(xpath="//span[@id='select2-appdtl__PartyDetails__indvTitle-container']")
    WebElement titleDD;
    @FindBy(xpath="//*[@id='select2-appdtl__PartyDetails__indvTitle-results']/li")
    List<WebElement> titleList;
    @FindBy(id="appdtl__PartyDetails__indvFirstName")
    WebElement indFirstName;
    @FindBy(id="appdtl__PartyDetails__indvMiddleName")
    WebElement indMidName;
    @FindBy(id="appdtl__PartyDetails__indvLastName")
    WebElement indLAstName;
    @FindBy(id="appdtl__PartyDetails__indvDOB")
    WebElement indDOB;
    @FindBy(xpath="//label[normalize-space()='Date of birth']")
    WebElement indDOBLable;
    @FindBy(id="appdtl__PartyDetails__indvRole")
    WebElement indRole;
    @FindBy(xpath="//span[@id='select2-appdtl__PartyDetails__indvOfficeCode-container']")
    WebElement OffNumDD;
    @FindBy(xpath="//*[@id='select2-appdtl__PartyDetails__indvOfficeCode-results']/li")
    List<WebElement> OffNumerList;
    @FindBy(id="appdtl__PartyDetails__indvOfficeNo")
    WebElement OfficeNum;
    @FindBy(id="select2-appdtl__PartyDetails__indvMobCode-container")
    WebElement MobNumDD;
    @FindBy(xpath="//*[@id='select2-appdtl__PartyDetails__indvMobCode-results']/li")
    List<WebElement> MobNumerList;
    @FindBy(id="appdtl__PartyDetails__indvMobileNo")
    WebElement mobileNum;
    @FindBy(id="appdtl__PartyDetails__indvEmail")
    WebElement indEmail;
    @FindBy(xpath="//span[@id='select2-appdtl__PartyDetails__idvCountry-container']")
    WebElement indCountryDD;
    @FindBy(xpath="//*[@id='select2-appdtl__PartyDetails__idvCountry-results']/li")
    List<WebElement> indCountryList;
    @FindBy(id="appdtl__PartyDetails__indvNationality")
    WebElement indNationDD;
    @FindBy(xpath="//*[@id='appdtl__PartyDetails__indvNationality_div']/ul/li")
    List<WebElement> indNationList;
    @FindBy(id="appdtl__PartyDetails__isPEP_option_Yes_span_")
    WebElement PepYES;
    @FindBy(id="appdtl__PartyDetails__PEPDesc")
    WebElement PepYESDesc;
    @FindBy(id="appdtl__PartyDetails__isPEP_option_No_span_")
    WebElement PepNO;
    @FindBy(id="appdtl__PartyDetails__isPO_option_Yes_span_")
    WebElement PubOfficeYES;
    @FindBy(id="appdtl__PartyDetails__isPO_option_No_span_")
    WebElement PubOficeNO;
    @FindBy(id="appdtl__PartyDetails__isPO2_option_Yes_span_")
    WebElement PubOffice2YES;
    @FindBy(id="appdtl__PartyDetails__isPO2_option_No_span_")
    WebElement PubOfice2NO;
    @FindBy(id="appdtl__PartyDetails__POPosition")
    WebElement PoPositionDes;
    @FindBy(id="appdtl__PartyDetails__indvDtlsConfitmBtn_txtcnt")
    WebElement indConfirmBtn;
    @FindBy(id="appdtl__PartyDetails__indvDtlsCancelBtn_txtcnt")
    WebElement indCancelBtn;
    @FindBy(id="appdtl__PartyDetails__confirmIndvCB_lbl")
    WebElement indConfirmChkBX;






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


    public InduvidualDetailsPage(){
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


    public void addNewIndivdual() throws Exception {


        Thread.sleep(8000);
        try {
            waitUtility.waitTillElementVisible(driver, addnewIndividuals, 45);
            javaScriptControls.executeJavaScript("arguments[0].click();", addnewIndividuals);
        }
        catch(Exception e){

            waitUtility.waitTillElementVisible(driver, addnewIndividuals, 5);
            commonElements.click(addnewIndividuals);

        }
    }
    public void selectMemeber() throws Exception {
        waitUtility.waitTillElementVisible(driver,seniorMngrChkBx,30);
        javaScriptControls.executeJavaScript("arguments[0].click();",seniorMngrChkBx);
    }

    public void fillMemebersDetails(String title,String firstname,String MidName,String LastName,String DOB,String role) throws Exception {
        waitUtility.waitTillElementVisible(driver,titleDD,30);
        commonElements.click(titleDD);
        selectionOfDropdown(title,titleList);
        textBoxControls.setText(indFirstName,firstname);
        textBoxControls.setText(indMidName,MidName);
        textBoxControls.setText(indLAstName,LastName);
        textBoxControls.setText(indDOB,DOB);
//    commonElements.click(indDOBLable);
        textBoxControls.setText(indRole,role);
    }

    public EntityDetailsPage corpuserContinue() throws Exception {
         commonElements.click(CrpContinueBtn);
        Thread.sleep(10000);
        return new EntityDetailsPage();
    }


    public void fillContactDetails(String OffCode,String OffNum,String mbcode,String MobNum,String email,
                                   String country,String nationlity,String PepDescr) throws Exception {

        commonElements.click(indCountryDD);
        selectionOfDropdown(country,indCountryList);
        commonElements.click(indNationDD);
        selectionOfDropdown(nationlity,indNationList);
        commonElements.click(PepYES);
        textBoxControls.setText(PepYESDesc,PepDescr);
        commonElements.click(PubOficeNO);


        commonElements.click(OffNumDD);
        String mcode = "+"+OffCode;
        selectionOfDropdown(mcode,OffNumerList);
        textBoxControls.setText(OfficeNum,OffNum);
        commonElements.click(MobNumDD);
        String mcode1 = "+"+mbcode;
        waitUtility.waitForSeconds(2);
        selectionOfDropdown(mcode1,MobNumerList);
        textBoxControls.setText(mobileNum,MobNum);
        textBoxControls.setText(indEmail,email);
        waitUtility.waitForSeconds(4);
        commonElements.click(indConfirmBtn);


    }

    public void ClickInduvidualCheckBox() throws Exception {

        waitUtility.waitTillElementVisible(driver,indConfirmChkBX,7);
        commonElements.click(indConfirmChkBX);
    }









}
