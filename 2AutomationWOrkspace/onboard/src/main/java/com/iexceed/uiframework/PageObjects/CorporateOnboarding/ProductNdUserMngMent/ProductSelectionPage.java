package com.iexceed.uiframework.PageObjects.CorporateOnboarding.ProductNdUserMngMent;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductSelectionPage extends TestBase {

    @FindBy(id="appdtl__ProductDetails__el_txt_111_txtcnt")
    WebElement addNewProduct;
    @FindBy(id="appdtl__ProductDetails__operatingAccName")
    WebElement salaryAccName;
    @FindBy(xpath="//span[@id='appdtl__ProductDetails__corpAccBtn_txtcnt']")
    WebElement CorporateAccount;
    @FindBy(xpath="//button[@id='appdtl__ProductDetails__tradeFinanceBtn']")
    WebElement TradeFinance;
    @FindBy(id="appdtl__ProductDetails__addtionalDtls")
    WebElement AdditionalDetails;
    @FindBy(xpath="//span[@id='select2-appdtl__ProductDetails__purposeOfAcc-container']")
    WebElement purposeOfAccDD;
    @FindBy(xpath="//*[@id='select2-appdtl__ProductDetails__purposeOfAcc-results']/li")
    List<WebElement> purposeOfAccList;
    @FindBy(xpath="//span[@id='select2-appdtl__ProductDetails__operatingCcy-container']")
    WebElement currencyDD;
    @FindBy(xpath="//*[@id='select2-appdtl__ProductDetails__operatingCcy-results']/li")
    List<WebElement> currencyList;
    @FindBy(id="appdtl__ProductDetails__totalTurnOver")
    WebElement turnOver;
    @FindBy(xpath="//span[@id='select2-appdtl__AddProducts__i__prodDtls__countryCode_0-container']")
    WebElement prodCountryDD;
    @FindBy(xpath="//*[@id='select2-appdtl__AddProducts__i__prodDtls__countryCode_0-results']/li")
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

    //corp application confirm
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


    public ProductSelectionPage(){
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

    public AdminstartorPage corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(4);
        commonElements.click(CrpContinueBtn);
        return new AdminstartorPage();
    }

    public void selectProduct(String salaryAcc,String pruposeOfACC,String addtionalDetail,String currency,String trunOver,
                              String country,String Incometransaction,String IncomeUSDTrans,String outGoingTnx,String OutgoingUSDTnx) throws Exception {
        waitUtility.waitTillElementVisible(driver,addNewProduct,58);
        javaScriptControls.executeJavaScript("arguments[0].click();",addNewProduct);
        waitUtility.waitTillElementVisible(driver,CorporateAccount,5);
        commonElements.click(CorporateAccount);
        textBoxControls.setText(salaryAccName,salaryAcc);
        commonElements.click(purposeOfAccDD);
        waitUtility.waitForSeconds(5);
        selectionOfDropdown(pruposeOfACC,purposeOfAccList);
        textBoxControls.setText(AdditionalDetails,addtionalDetail);
        commonElements.click(currencyDD);
        waitUtility.waitForSeconds(5);
        selectionOfDropdown(currency,currencyList);
        textBoxControls.setText(turnOver,trunOver);
        montlyTransaction(country,Incometransaction,IncomeUSDTrans,outGoingTnx,OutgoingUSDTnx);

    }

    public void montlyTransaction(String country,String Incometransaction,String IncomeUSDTrans,String outGoingTnx,String OutgoingUSDTnx) throws Exception {
        commonElements.click(prodCountryDD);
        waitUtility.waitForSeconds(5);
        selectionOfDropdown(country,prodCountryList);
        textBoxControls.setText(incomeTnx,Incometransaction);
        textBoxControls.setText(incomeTnxUSD,IncomeUSDTrans);
        textBoxControls.setText(outgoingTnx,outGoingTnx);
        textBoxControls.setText(outgoingTnxUSD,OutgoingUSDTnx);
        commonElements.click(prodConfirmBtn);

    }




}
