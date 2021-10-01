package com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BusinessLocationPage extends TestBase {


    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;




    //Business location
    @FindBy(id="appdtl__EntityDetails__businessLocContryDom_option_Yes_span_")
    WebElement countryinCorpYes;
    @FindBy(id="appdtl__EntityDetails__businessLocContryDom_option_No_span_")
    WebElement countryinCorpNo;
    @FindBy(xpath="//span[@id='select2-appdtl__BusinessLocation__i__entBusinessLocation__domicile-container']")
    WebElement countryDomiliceDD;
    @FindBy(xpath="//*[@id='select2-appdtl__BusinessLocation__i__entBusinessLocation__domicile-results']/li")
    List<WebElement> countryDomiliceList;
    @FindBy(id="appdtl__EntityDetails__el_txt_53_txtcnt")
    WebElement addBusinessLoc;
    @FindBy(xpath="//span[@id='select2-appdtl__EntityDetails__busiCountryName-container']")
    WebElement busCountryDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__busiCountryName-results']/li")
    List<WebElement> busCountryList;
    @FindBy(id="appdtl__EntityDetails__busiTypeOfOperation")
    WebElement typeOfBusOperation;
    @FindBy(id="appdtl__EntityDetails__locationConfiemBtn_txtcnt")
    WebElement locConfirmButt;
    @FindBy(id="appdtl__EntityDetails__locationCancelBtn_txtcnt")
    WebElement locCancelButt;

    //business Market
    @FindBy(id="appdtl__EntityDetails__el_txt_57_txtcnt")
    WebElement addBusinessMarket;
    @FindBy(xpath="//span[@id='select2-appdtl__EntityDetails__busiMktCountry-container']")
    WebElement busMarkCountryDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__busiMktCountry-results']/li")
    List<WebElement> busMarkCountryList;
    @FindBy(id="appdtl__EntityDetails__busiMktProportion")
    WebElement BusPropotion;
    @FindBy(id="appdtl__EntityDetails__busiMarketConfirmBtn_txtcnt")
    WebElement busMarConfirmButt;
    @FindBy(id="appdtl__EntityDetails__busiMarketCancelBtn_txtcnt")
    WebElement busMarConfirmButtCancel;







    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public BusinessLocationPage(){
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




    public IndustryPage corpuserContinue() throws Exception {
//        waitUtility.waitForSeconds(3);
        commonElements.click(CrpContinueBtn);
        return new IndustryPage();
    }


    public void businessLocationDetails(String country,String typeOfBusiness,String busPropotion) throws Exception {
        waitUtility.waitTillElementVisible(driver,countryinCorpYes,53);
        addBusinessLocationInfo(country,typeOfBusiness);
        waitUtility.waitForSeconds(5);
        addBusinessMarketInfo(country,busPropotion);
        commonElements.click(countryinCorpYes);
        commonElements.click(countryDomiliceDD);
        selectionOfDropdown(country,countryDomiliceList);

        corpuserContinue();

    }

    public void addBusinessLocationInfo(String country,String typeOfBusiness) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();",addBusinessLoc);
        waitUtility.waitTillElementVisible(driver,busCountryDD,6);
        commonElements.click(busCountryDD);
        selectionOfDropdown(country,busCountryList);
        textBoxControls.setText(typeOfBusOperation,typeOfBusiness);
        commonElements.click(locConfirmButt);

    }

    public void addBusinessMarketInfo(String country,String propotion) throws Exception {
        waitUtility.waitForSeconds(5);
        javaScriptControls.executeJavaScript("arguments[0].click();",addBusinessMarket);
        waitUtility.waitTillElementVisible(driver,busMarkCountryDD,6);
        commonElements.click(busMarkCountryDD);
        selectionOfDropdown(country,busMarkCountryList);
        textBoxControls.setText(BusPropotion,propotion);
        commonElements.click(busMarConfirmButt);
    }





}


