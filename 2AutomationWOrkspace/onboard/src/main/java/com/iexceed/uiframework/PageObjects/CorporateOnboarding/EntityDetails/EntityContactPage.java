package com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EntityContactPage extends TestBase {
    //contact details
    @FindBy(xpath="//span[@id='appdtl__EntityDetails__el_txt_6_txtcnt']")
    WebElement addNewuser;

    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;


    //EntityContact
    @FindBy(id="appdtl__AddressDetails__i__entContactInfo__emailAddress")
    WebElement entityEmail;
    @FindBy(id="appdtl__AddressDetails__i__entContactInfo__companyWebsite")
    WebElement compWebsite;
    @FindBy(xpath="//span[@id='appdtl__EntityDetails__el_txt_24_txtcnt']")
    WebElement addNewAddressBtn;
    @FindBy(id="select2-appdtl__EntityDetails__addressType-container")
    WebElement addressDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__addressType-results']/li")
    List<WebElement> addressList;
    @FindBy(id="appdtl__EntityDetails__buildName")
    WebElement buildName;
    @FindBy(id="appdtl__EntityDetails__streetName")
    WebElement streetName;
    @FindBy(id="appdtl__EntityDetails__townName")
    WebElement townName;
    @FindBy(id="appdtl__EntityDetails__stateName")
    WebElement stateName;
    @FindBy(id="appdtl__EntityDetails__postalCode")
    WebElement Zippostal;
    @FindBy(id="appdtl__EntityDetails__poBox")
    WebElement poBoxCode;
    @FindBy(xpath="//span[@id='select2-appdtl__EntityDetails__countryName-container']")
    WebElement countryDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__countryName-results']/li")
    List<WebElement> countryList;
    @FindBy(id="appdtl__EntityDetails__addressConfirmBtn_txtcnt")
    WebElement EntaddressConfirm;
    @FindBy(id="appdtl__EntityDetails__addressCancelBtn_txtcnt")
    WebElement addressCancel;









    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public EntityContactPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);

    }

    public void clickAddNewUser() throws Exception {
        waitUtility.waitTillElementVisible(driver,addNewuser,25);
        commonElements.click(addNewuser);


    }
    public void selectionOfDropdown (String itemType, List < WebElement > type){
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }



    public BusinessLocationPage corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(7);
        commonElements.click(CrpContinueBtn);
        return new BusinessLocationPage();
    }


    public void entityContactInfo(String email,String ComWebsite,String AddressType,String BuidingNo,String Street,String town,String State,
                                  String ZipCode,String PostCode,String Country) throws Exception {

        waitUtility.waitTillElementVisible(driver,entityEmail,45);
//        textBoxControls.setText(entityEmail,email);
//        textBoxControls.setText(compWebsite,ComWebsite);
        javaScriptControls.executeJavaScript("arguments[0].click();",addNewAddressBtn);
        waitUtility.waitTillElementVisible(driver,addressDD,15);
        commonElements.click(addressDD);
        selectionOfDropdown(AddressType,addressList);
        textBoxControls.setText(buildName,BuidingNo);
        textBoxControls.setText(streetName,Street);
        textBoxControls.setText(townName,town);
        textBoxControls.setText(stateName,State);
        textBoxControls.setText(Zippostal,ZipCode);
        textBoxControls.setText(poBoxCode,PostCode);
        waitUtility.waitForSeconds(5);
        commonElements.click(countryDD);
        selectionOfDropdown(Country,countryList);
        waitUtility.waitForSeconds(5);
        commonElements.click(EntaddressConfirm);
        textBoxControls.setText(entityEmail,email);
        textBoxControls.setText(compWebsite,ComWebsite);
        corpuserContinue();

    }




}
