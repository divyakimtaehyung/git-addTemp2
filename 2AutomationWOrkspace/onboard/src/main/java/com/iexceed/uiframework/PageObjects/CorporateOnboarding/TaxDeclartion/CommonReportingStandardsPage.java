package com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.SansactionDetails.SancationPage;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommonReportingStandardsPage extends TestBase {


    //common reporting standard
    @FindBy(xpath="//span[@id='select2-appdtl__TaxDetails__i__taxCrs__entityCode-container']")
    WebElement CrsDD;
    @FindBy(xpath="//*[@id='select2-appdtl__TaxDetails__i__taxCrs__entityCode-results']/li")
    List<WebElement> CrsList;
    @FindBy(id="appdtl__TaxDetails__i__taxCrs__giinNo")
    WebElement GinNum;

    //DropDownList 1
    @FindBy(id="appdtl__TaxDetails__el_txt_32_txtcnt")
    WebElement addNewControlPersonBtn;
    @FindBy(id="select2-appdtl__TaxDetails__title-container")
    WebElement cntlTitleDD;
    @FindBy(xpath="//*[@id='select2-appdtl__TaxDetails__title-results']")
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
    @FindBy(xpath="//*[@id='select2-appdtl__TaxDetails__CountryofBirth-results']/li")
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


    //


    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public CommonReportingStandardsPage(){
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


    public SancationPage corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(10);
        commonElements.click(CrpContinueBtn);
        return new SancationPage();
    }

    public void selectionOfDropdown (String itemType, List < WebElement > type){
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }


    public void CrsSelection(String crsDDList,String GINPin) throws Exception {
      waitUtility.waitTillElementVisible(driver,CrsDD,55);
      commonElements.click(CrsDD);
      selectionOfDropdown(crsDDList,CrsList);
      textBoxControls.setText(GinNum,GINPin);
      corpuserContinue();

    }


}
