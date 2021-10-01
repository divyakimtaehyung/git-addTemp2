package com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TaxResidencyPage extends TestBase {


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

    //Tax residency
    @FindBy(id="appdtl__TaxDetails__el_txt_10_txtcnt")
    WebElement addNewTaxBtn;
    @FindBy(xpath="//span[@id='select2-appdtl__TaxDetails__taxCountry-container']")
    WebElement taxCountryDD;
    @FindBy(xpath="//*[@id='select2-appdtl__TaxDetails__taxCountry-results']/li")
    List<WebElement> taxCountryList;
    @FindBy(id="appdtl__TaxDetails__TIN")
    WebElement TIN;
    @FindBy(id="appdtl__TaxDetails__TINCB_lbl")
    WebElement TINCkBx;
    @FindBy(id="select2-appdtl__TaxDetails__reason-container")
    WebElement taxReasonDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__TaxDetails__reason-results\"]/li")
    WebElement taxReasonList;
    @FindBy(id="appdtl__TaxDetails__noTINReason")
    WebElement taxTinNOReasonDesc;
    @FindBy(id="appdtl__TaxDetails__taxConfirmBtn")
    WebElement taxConfirmBtn;
    @FindBy(id="appdtl__TaxDetails__taxCancelBtn_txtcnt")
    WebElement taxCancelBtn;

    //foreign account tax
    @FindBy(id="appdtl__TaxDetails__isUSPerson_option_Yes_span_")
    WebElement UsPersoYES;
    @FindBy(id="appdtl__TaxDetails__isUSPerson_option_No_span_")
    WebElement UsPersonNO;
    @FindBy(id="appdtl__TaxDetails__isBeneOwner_option_Yes_span_")
    WebElement benOwnerYes;
    @FindBy(id="appdtl__TaxDetails__isBeneOwner_option_No_span_")
    WebElement benOwnerNo;
    @FindBy(id="select2-appdtl__TaxDetails__i__taxFatca__exmApplCatgCode-container")
    WebElement UsPersonYEsCatDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__TaxDetails__i__taxFatca__exmApplCatgCode-results\"]/li")
    List<WebElement> UsPersonYesCatList;

    //common reporting standard
    @FindBy(id="select2-appdtl__TaxDetails__i__taxCrs__entityCode-container")
    WebElement CrsDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__TaxDetails__i__taxCrs__entityCode-results\"]/li")
    List<WebElement> CrsList;
    @FindBy(id="appdtl__TaxDetails__i__taxCrs__giinNo")
    WebElement GinNum;
    @FindBy(id="appdtl__TaxDetails__el_txt_32_txtcnt")
    WebElement addNewControlPersonBtn;
    @FindBy(id="select2-appdtl__TaxDetails__title-container")
    WebElement cntlTitleDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__TaxDetails__title-results\"]")
    List<WebElement> cntrlTitleList;
    @FindBy(id="appdtl__TaxDetails__Fname")
    WebElement personFName;
    @FindBy(id="appdtl__TaxDetails__Mname")
    WebElement personMName;
    @FindBy(id="appdtl__TaxDetails__Lname")
    WebElement personLname;
    @FindBy(id="appdtl__TaxDetails__DOB")
    WebElement prsnDOB;
    @FindBy(id="appdtl__TaxDetails__COB")
    WebElement prsCOB;
    @FindBy(id="select2-appdtl__TaxDetails__CountryofBirth-container")
    WebElement cutryOBirthDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__TaxDetails__CountryofBirth-results\"]/li")
    List<WebElement> cuntryoBirthList;
    @FindBy(id="select3-appdtl__TaxDetails__typeOfCP-container")
    WebElement typeOfCPersonDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__TaxDetails__typeOfCP-results\"]/li")
    List<WebElement> typeOfCPersonList;
    @FindBy(id="appdtl__TaxDetails__CPTIN")
    WebElement TINinputBx;
    @FindBy(id="appdtl__TaxDetails__noCPTINCB_lbl")
    WebElement TINinputCkBx;
    @FindBy(id="select2-appdtl__TaxDetails__CPSCnoTINReason-container")
    WebElement TInPinReasonDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__TaxDetails__CPSCnoTINReason-results\"]/li")
    List<WebElement> TinPinReasonList;
    @FindBy(id="appdtl__TaxDetails__CPSCConfirmBtn_txtcnt")
    WebElement CPSConfirmBtn;
    @FindBy(id="appdtl__TaxDetails__CPSCCancelBtn_txtcnt")
    WebElement CPSCancelBtn;



    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public TaxResidencyPage(){
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


    public ForeignAccountTaxPage corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(5);
        commonElements.click(CrpContinueBtn);
        return new ForeignAccountTaxPage();
    }

    public void selectionOfDropdown (String itemType, List < WebElement > type){
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }



    public void addNewCountryTax(String country,String TInNum) throws Exception {
        waitUtility.waitForSeconds(34);
        javaScriptControls.executeJavaScript("arguments[0].click();",addNewTaxBtn);
        javaScriptControls.executeJavaScript("arguments[0].click();",taxCountryDD);
         selectionOfDropdown(country,taxCountryList);
        textBoxControls.setText(TIN,TInNum);
        javaScriptControls.executeJavaScript("arguments[0].click();",taxConfirmBtn);
        //commonElements.click(taxConfirmBtn);
        corpuserContinue();

    }



}


