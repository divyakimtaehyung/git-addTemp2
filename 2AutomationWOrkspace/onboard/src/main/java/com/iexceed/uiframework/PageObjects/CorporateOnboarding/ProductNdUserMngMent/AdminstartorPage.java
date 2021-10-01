package com.iexceed.uiframework.PageObjects.CorporateOnboarding.ProductNdUserMngMent;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminstartorPage extends TestBase {

    //bank admin user
    @FindBy(id="appdtl__ProductDetails__el_txt_117_txtcnt")
    WebElement AddadminBtn;
    @FindBy(xpath="//span[@id='select2-appdtl__ProductDetails__ADTitle-container']")
    WebElement adminTitleDD;
    @FindBy(xpath="//*[@id='select2-appdtl__ProductDetails__ADTitle-results']/li")
    List<WebElement> adminTitleList;
    @FindBy(id="appdtl__ProductDetails__ADFirstName")
    WebElement adminFName;
    @FindBy(id="appdtl__ProductDetails__ADMiddleName")
    WebElement adminMName;
    @FindBy(id="appdtl__ProductDetails__ADLastName")
    WebElement adminLName;
    @FindBy(xpath="//span[@id='select2-appdtl__ProductDetails__ADMobCode-container']")
    WebElement adminMobDD;
    @FindBy(xpath="//*[@id='select2-appdtl__ProductDetails__ADMobCode-results']/li")
    List<WebElement> adminMobList;
    @FindBy(id="appdtl__ProductDetails__ADMobNo")
    WebElement adminMobNo;
    @FindBy(id="appdtl__ProductDetails__ADEmail")
    WebElement adminEmail;
    @FindBy(xpath="//input[@id='appdtl__ProductDetails__AdNationality']")
    WebElement adminNationalityDD;
    @FindBy(xpath="//div[@id='appdtl__ProductDetails__AdNationality_div']/ul/li")
    List<WebElement> adminNationlityList;
    @FindBy(id="appdtl__ProductDetails__ADDOB")
    WebElement adminDOB;
    @FindBy(id="appdtl__ProductDetails__ADPOB")
    WebElement adminPOB;
    @FindBy(id="appdtl__ProductDetails__ADPassNo")
    WebElement adminPasspNO;
    @FindBy(id="appdtl__ProductDetails__ADPassExpDt")
    WebElement adminPassExpDT;
    @FindBy(xpath="//span[@id='appdtl__ProductDetails__el_txt_135_txtcnt']")
    WebElement adminPassExpDTLable;
    @FindBy(xpath="//span[@id='select2-appdtl__ProductDetails__ADPassIssueCountry-container']")
    WebElement adminPassCountryDD;
    @FindBy(xpath="//*[@id='select2-appdtl__ProductDetails__ADPassIssueCountry-results']/li")
    List<WebElement> adminCountryList;

    @FindBy(xpath="//span[@id='select2-appdtl__ProductDetails__ADCountryOfRes-container']")
    WebElement adminCountryResDD;
    @FindBy(xpath="//*[@id='select2-appdtl__ProductDetails__ADCountryOfRes-results']/li")
    List<WebElement> adminCountryResList;
    @FindBy(id="appdtl__ProductDetails__ADConfirmBtn_txtcnt")
    WebElement adminConfirmBtn;
    @FindBy(id="appdtl__ProductDetails__ADCancelBtn_txtcnt")
    WebElement adminCancelBtn;



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


    public AdminstartorPage(){
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
        waitUtility.waitForSeconds(15);
        commonElements.click(CrpContinueBtn);
    }

    public void bankAdminUSerCreation(String title,String FirstName,String MidName,String LastName ,String MobCode,
                                      String mobNum,String email,String nationlity,String DOB,String BithPlace,
                                      String PostNum,String PassportExpiDate,String PassPortCountry,String resident) throws Exception {
        waitUtility.waitTillElementVisible(driver,AddadminBtn,45);
        javaScriptControls.executeJavaScript("arguments[0].click();",AddadminBtn);
        commonElements.click(adminTitleDD);
        selectionOfDropdown(title,adminTitleList);
        textBoxControls.setText(adminFName,FirstName);
        textBoxControls.setText(adminMName,MidName);
        textBoxControls.setText(adminLName,LastName);
        commonElements.click(adminMobDD);
        String mcode = "+"+MobCode;
        selectionOfDropdown(mcode,adminMobList);
        textBoxControls.setText(adminMobNo,mobNum);

        commonElements.click(adminPassCountryDD);
        selectionOfDropdown(PassPortCountry,adminCountryList);
        commonElements.click(adminCountryResDD);
        selectionOfDropdown(resident,adminCountryResList);

        textBoxControls.setText(adminEmail,email);
        commonElements.click(adminNationalityDD);
        selectionOfDropdown(nationlity,adminNationlityList);
        textBoxControls.setText(adminPOB,BithPlace);
        textBoxControls.setText(adminDOB,DOB);
        textBoxControls.setText(adminPasspNO,PostNum);
        textBoxControls.setText(adminPassExpDT,PassportExpiDate);
        commonElements.click(adminPassExpDTLable);
//        commonElements.click(adminPassCountryDD);
//        selectionOfDropdown(PassPortCountry,adminCountryList);
//        commonElements.click(adminCountryResDD);
//        selectionOfDropdown(resident,adminCountryResList);


        commonElements.click(adminConfirmBtn);



    }

}
