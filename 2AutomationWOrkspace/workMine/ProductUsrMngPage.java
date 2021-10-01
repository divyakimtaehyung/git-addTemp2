package org.uiframework.PageObjects.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductUsrMngPage extends TestBase {

    @FindBy(id="appdtl__ProductDetails__el_txt_111_txtcnt")
    WebElement addNewProduct;
    @FindBy(id="appdtl__ProductDetails__operatingAccName")
    WebElement AccName;
    @FindBy(id="appdtl__ProductDetails__addtionalDtls")
    WebElement usrAddDetails;
    @FindBy(id="select2-appdtl__ProductDetails__purposeOfAcc-container")
    WebElement purposeOfAccDD;
    @FindBy(id="//*[@id='select2-appdtl__ProductDetails__purposeOfAcc-results']/li")
    List<WebElement> purposeOfAccList;
    @FindBy(id="select2-appdtl__ProductDetails__operatingCcy-container")
    WebElement currencyDD;
    @FindBy(id="//*[@id='select2-appdtl__ProductDetails__operatingCcy-results']/li")
    List<WebElement> currencyList;
    @FindBy(id="appdtl__ProductDetails__totalTurnOver")
    WebElement turnOver;
    @FindBy(id="select12-appdtl__AddProducts__i__prodDtls__countryCode_0-container")
    WebElement prodCountryDD;
    @FindBy(id="//*[@id='select2-appdtl__AddProducts__i__prodDtls__countryCode_0-results']/li")
    List<WebElement> prodCountryList;
    @FindBy(id="appdtl__AddProducts__i__prodDtls__incomingTxnPerMonth_0")
    WebElement incomeTnx;
    @FindBy(id="appdtl__AddProducts__i__prodDtls__incomingValPerMonth_0")
    WebElement incomeTnxUSD;
    @FindBy(id="appdtl__AddProducts__i__prodDtls__outgoingTxnPerMonth_0")
    WebElement outgoingTnx;
    @FindBy(id="appdtl__AddProducts__i__prodDtls__outgoingValPerMonth_0")
    WebElement outgoingTnxUSD;
    @FindBy(id="appdtl__ProductDetails__prodConfirmBtn_txtcnt")
    WebElement prodConfirmBtn;
    @FindBy(id="appdtl__ProductDetails__prodCancelBtn_txtcnt")
    WebElement prodCancelBtn;

    //Trade finance
    @FindBy(id="appdtl__ProductDetails__tradeFinanceBtn")
    WebElement prodTradeFinanceBtn;
    @FindBy(id="appdtl__ProductDetails__prodConfirmBtn_txtcnt")
    WebElement prodTFConfirmBtn;
    @FindBy(id="appdtl__ProductDetails__prodCancelBtn_txtcnt")
    WebElement prodTFCancelBtn;


    //bank admin user
    @FindBy(id="select12-appdtl__ProductDetails__ADTitle-container")
    WebElement adminTitleDD;
    @FindBy(xpath="//*[@id='select2-appdtl__ProductDetails__ADTitle-results']/li")
    List<WebElement> adminTitleList;
    @FindBy(id="appdtl__ProductDetails__ADFirstName")
    WebElement adminFName;
    @FindBy(id="appdtl__ProductDetails__ADMiddleName")
    WebElement adminMName;
    @FindBy(id="appdtl__ProductDetails__ADLastName")
    WebElement adminLName;
    @FindBy(id="select12-appdtl__ProductDetails__ADMobCode-container")
    WebElement adminMobDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__ProductDetails__ADMobCode-results\"]/li")
    List<WebElement> adminMobList;
    @FindBy(id="appdtl__ProductDetails__ADMobNo")
    WebElement adminMobNo;
    @FindBy(id="appdtl__ProductDetails__ADEmail")
    WebElement adminEmail;
    @FindBy(id="appdtl__ProductDetails__ADNationality")
    WebElement adminNationalityDD;
    @FindBy(xpath="//*[@id=\"appdtl__ProductDetails__ADNationality_div\"]/ul/li")
    List<WebElement> adminNationlityList;
    @FindBy(id="appdtl__ProductDetails__ADDOB")
    WebElement adminDOB;
    @FindBy(id="appdtl__ProductDetails__ADPOB")
    WebElement adminPOB;
    @FindBy(id="appdtl__ProductDetails__ADPassNo")
    WebElement adminPasspNO;
    @FindBy(id="select2-appdtl__ProductDetails__ADPassIssueCountry-container")
    WebElement adminPassCountryDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__ProductDetails__ADPassIssueCountry-results\"]/li")
    List<WebElement> adminCountryList;
    @FindBy(id="appdtl__ProductDetails__ADPassExpDt")
    WebElement adminPassExpDT;
    @FindBy(id="select12-appdtl__ProductDetails__ADCountryOfRes-container")
    WebElement adminCountryResDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__ProductDetails__ADCountryOfRes-results\"]")
    List<WebElement> adminCountryResList;
    @FindBy(id="appdtl__ProductDetails__ADConfirmBtn_txtcnt")
    WebElement adminConfirmBtn;
    @FindBy(id="appdtl__ProductDetails__ADCancelBtn_txtcnt")
    WebElement adminCancelBtn;






    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public ProductUsrMngPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);

    }


}
