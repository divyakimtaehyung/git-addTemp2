package org.uiframework.PageObjects.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EntitydetailsPage extends TestBase {

    //contact details
    @FindBy(xpath="//span[@id='appdtl__EntityDetails__el_txt_6_txtcnt']")
    WebElement addNewuser;
    @FindBy(id="appdtl__EntityDetails__userName")
    WebElement userName;
    @FindBy(id="appdtl__EntityDetails__email")
    WebElement userEmail;
    @FindBy(id="select2-appdtl__EntityDetails__mobileCode-container")
    WebElement mobCode;
    @FindBy(xpath="//ul[@id='select2-appdtl__EntityDetails__mobileCode-results']/li")
    List<WebElement> mobileDD;
    @FindBy(id="appdtl__EntityDetails__mobileNo")
    WebElement mobNo;
    @FindBy(id="appdtl__EntityDetails__userConfirmBtn_txtcnt")
    WebElement contactConfirm;
    @FindBy(id="appdtl__EntityDetails__userCancelBtn_txtcnt")
    WebElement contactcCancel;
    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinue;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancel;

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

    //EntityContact
    @FindBy(id="appdtl__AddressDetails__i__entContactInfo__emailAddress")
    WebElement entityEmail;
    @FindBy(id="appdtl__AddressDetails__i__entContactInfo__companyWebsite")
    WebElement compWebsite;
    @FindBy(id="appdtl__EntityDetails__el_txt_24_txtcnt")
    WebElement addNewAddress;
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
    WebElement postal;
    @FindBy(id="appdtl__EntityDetails__poBox")
    WebElement poBox;
    @FindBy(id="select12-appdtl__EntityDetails__countryName-container")
    WebElement countryDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__countryName-results']/li")
    List<WebElement> countryList;
    @FindBy(id="appdtl__EntityDetails__addressConfirmBtn_txtcnt")
    WebElement addressConfirm;
    @FindBy(id="appdtl__EntityDetails__addressCancelBtn_txtcnt")
    WebElement addressCancel;


//Business location
   @FindBy(id="appdtl__EntityDetails__businessLocContryDom_option_Yes_span_")
    WebElement countryinCorpYes;
    @FindBy(id="appdtl__EntityDetails__businessLocContryDom_option_No_span_")
    WebElement countryinCorpNo;
    @FindBy(id="select12-appdtl__BusinessLocation__i__entBusinessLocation__domicile-container")
    WebElement countryDomiliceDD;
    @FindBy(xpath="select12-//*[@id='select2-appdtl__BusinessLocation__i__entBusinessLocation__domicile-results']/li")
    List<WebElement> countryDomiliceList;
    @FindBy(id="appdtl__EntityDetails__el_txt_53_txtcnt")
    WebElement addBusinessLoc;
    @FindBy(id="select12-appdtl__EntityDetails__busiCountryName-container")
    WebElement busCountryDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__EntityDetails__busiCountryName-results\"]/li")
    List<WebElement> busCountryList;
    @FindBy(id="appdtl__EntityDetails__busiTypeOfOperation")
    WebElement typeOfBus;
    @FindBy(id="appdtl__EntityDetails__locationConfiemBtn_txtcnt")
    WebElement locConfirmButt;
    @FindBy(id="appdtl__EntityDetails__locationCancelBtn_txtcnt")
    WebElement locCancelButt;

//business Market
    @FindBy(id="appdtl__EntityDetails__el_txt_57_txtcnt")
    WebElement addBusinessMarket;
    @FindBy(id="select12-appdtl__EntityDetails__busiMktCountry-container")
    WebElement busMarkCountryDD;
    @FindBy(xpath="//*[@id=\"select2-appdtl__EntityDetails__busiMktCountry-results\"]/li")
    List<WebElement> busMarkCountryList;
    @FindBy(id="appdtl__EntityDetails__busiMktProportion")
    WebElement BusPropotion;
    @FindBy(id="appdtl__EntityDetails__busiMarketConfirmBtn_txtcnt")
    WebElement busMarConfirmButt;
    @FindBy(id="appdtl__EntityDetails__busiMarketCancelBtn_txtcnt")
    WebElement busMarConfirmButtCancel;

    //industry
    @FindBy(id="appdtl__EntityDetails__el_txt_64_txtcnt")
    WebElement addNewIndustry;
    @FindBy(id="select12-appdtl__EntityDetails__indType-container")
    WebElement industryTypeDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__indType-results']/li")
    List<WebElement> indusTypeList;
    @FindBy(id="select12-appdtl__EntityDetails__indSection-container")
    WebElement indusSectionDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__indSection-results']/li")
    List<WebElement> indusSectionList;
    @FindBy(id="select12-appdtl__EntityDetails__indDivision-container")
    WebElement indusDivisionDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__indDivision-results']/li")
    List<WebElement> indusDivisionList;
    @FindBy(id="select12-appdtl__EntityDetails__indGroup-container")
    WebElement indusGroupDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__indGroup-results']/li")
    List<WebElement> indusGroupList;
    @FindBy(id="select12-appdtl__EntityDetails__indClass-container")
    WebElement indusClassDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__indClass-results']/li")
    List<WebElement> indusClassList;
    @FindBy(id="appdtl__EntityDetails__indConfirmBtn")
    WebElement indusConfirmBut;
    @FindBy(id="appdtl__EntityDetails__indCancelBtn")
    WebElement indusCancelBut;

//incorporation
   @FindBy(id="appdtl__EntityDetails__i__entityInfo__dateOfIncorporation")
    WebElement DateofInCorp;


    //Commercial linence
    @FindBy(id="appdtl__EntityDetails__i__entCommercialLicense__commLicenseNumber")
    WebElement commLicenseNO;
    @FindBy(id="appdtl__EntityDetails__i__entCommercialLicense__commLicenseIssuedBy")
    WebElement commIssuedBY;
    @FindBy(id="appdtl__EntityDetails__i__entCommercialLicense__businessActivities")
    WebElement commLicenseActivity;
    @FindBy(id="appdtl__EntityDetails__i__entCommercialLicense__commLicenseIssueDate")
    WebElement commIssuedDate;
    @FindBy(id="appdtl__EntityDetails__i__entCommercialLicense__commLicenseExpiryDate")
    WebElement commExpireddDate;

//source of fund
    @FindBy(id="appdtl__EntityDetails__el_txt_83_txtcnt")
    WebElement addSourceFund;
    @FindBy(id="select12-appdtl__EntityDetails__SOF-container")
    WebElement sourceFundDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__SOF-results']/li")
    List<WebElement> sourceFundList;
    @FindBy(id="select12-appdtl__EntityDetails__SOFCountry-container")
    WebElement sourceCountryDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__SOFCountry-results']/li")
    List<WebElement> sourceCountryList;
    @FindBy(id="appdtl__EntityDetails__SOFDesc")
    WebElement sourceFundDesc;
    @FindBy(id="appdtl__EntityDetails__SOFConfirmBtn_txtcnt")
    WebElement SOFConfirmBtn;
    @FindBy(id="appdtl__EntityDetails__SOFCancelBtn_txtcnt")
    WebElement SOFCancelBtn;

//source of wealth
    @FindBy(id="appdtl__EntityDetails__el_txt_87_txtcnt")
    WebElement addSourceWealth;
    @FindBy(id="select12-appdtl__EntityDetails__SOW-container")
    WebElement sourceWealthDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__SOW-results']/li")
    List<WebElement> sourceWealthList;
    @FindBy(id="appdtl__EntityDetails__SOWDesc")
    WebElement sourceWealthDesc;
    @FindBy(id="appdtl__EntityDetails__SOWConfirmBtn_txtcnt")
    WebElement SOWConfirmBtn;
    @FindBy(id="appdtl__EntityDetails__SOWCancelBtn_txtcnt")
    WebElement SOWCancelBtn;






    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public EntitydetailsPage(){
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
