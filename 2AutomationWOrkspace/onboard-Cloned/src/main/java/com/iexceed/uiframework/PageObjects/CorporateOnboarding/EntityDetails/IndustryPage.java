package com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IndustryPage extends TestBase {

    @FindBy(id="appdtl__EntityDetails__userCancelBtn_txtcnt")
    WebElement contactcCancel;
    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;


    //industry
    @FindBy(id="appdtl__EntityDetails__el_txt_64_txtcnt")
    WebElement addNewIndustry;
    @FindBy(xpath="//span[@id='select2-appdtl__EntityDetails__indType-container']")
    WebElement industryTypeDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__indType-results']/li")
    List<WebElement> indusTypeList;
    @FindBy(xpath="//span[@id='select2-appdtl__EntityDetails__indSection-container']")
    WebElement indusSectionDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__indSection-results']/li")
    List<WebElement> indusSectionList;
    @FindBy(xpath="//span[@id='select2-appdtl__EntityDetails__indDivision-container']")
    WebElement indusDivisionDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__indDivision-results']/li")
    List<WebElement> indusDivisionList;
    @FindBy(xpath="//span[@id='select2-appdtl__EntityDetails__indGroup-container']")
    WebElement indusGroupDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__indGroup-results']/li")
    List<WebElement> indusGroupList;
    @FindBy(xpath="//span[@id='select2-appdtl__EntityDetails__indClass-container']")
    WebElement indusClassDD;
    @FindBy(xpath="//*[@id='select2-appdtl__EntityDetails__indClass-results']/li")
    List<WebElement> indusClassList;
    @FindBy(id="appdtl__EntityDetails__indConfirmBtn")
    WebElement indusConfirmBut;
    @FindBy(id="appdtl__EntityDetails__indCancelBtn")
    WebElement indusCancelBut;






    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public IndustryPage(){
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



    public IncorporationPage corpuserContinue() throws Exception {
//        waitUtility.waitForSeconds(5);
        commonElements.click(CrpContinueBtn);
        return new IncorporationPage();
    }




    public void industryDetails(String typeOfIndustry,String typeOfSect,String indusDivision,
                                String indusGroup,String Indclass) throws Exception {
        waitUtility.waitTillElementVisible(driver,addNewIndustry,45);
        javaScriptControls.executeJavaScript("arguments[0].click();",addNewIndustry);
        commonElements.click(industryTypeDD);
        selectionOfDropdown(typeOfIndustry,indusTypeList);
        commonElements.click(indusSectionDD);
        selectionOfDropdown(typeOfSect,indusSectionList);
        commonElements.click(indusDivisionDD);
        selectionOfDropdown(indusDivision,indusDivisionList);
        commonElements.click(indusGroupDD);
        selectionOfDropdown(indusGroup,indusGroupList);
        commonElements.click(indusClassDD);
        selectionOfDropdown(Indclass,indusClassList);
        commonElements.click(indusConfirmBut);
        waitUtility.waitForSeconds(3);
        corpuserContinue();

    }

   }


