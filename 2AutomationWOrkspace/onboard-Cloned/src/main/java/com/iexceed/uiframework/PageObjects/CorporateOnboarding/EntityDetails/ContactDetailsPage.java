package com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactDetailsPage extends TestBase {

    //contact details
    @FindBy(xpath="//span[@id='appdtl__EntityDetails__el_txt_6_txtcnt']")
    WebElement addNewuser;
    @FindBy(id="appdtl__EntityDetails__userName")
    WebElement userName;
    @FindBy(id="appdtl__EntityDetails__email")
    WebElement userEmail;
    @FindBy(id="select2-appdtl__EntityDetails__mobileCode-container")
    WebElement mobCodeDD;
    @FindBy(xpath="//ul[@id='select2-appdtl__EntityDetails__mobileCode-results']/li")
    List<WebElement> mobileCodeList;
    @FindBy(id="appdtl__EntityDetails__mobileNo")
    WebElement mobNo;
    @FindBy(id="appdtl__EntityDetails__userConfirmBtn_txtcnt")
    WebElement contactConfirm;
    @FindBy(id="appdtl__EntityDetails__userCancelBtn_txtcnt")
    WebElement contactcCancel;
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



    public ContactDetailsPage(){
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
        waitUtility.waitForSeconds(20);
        waitUtility.waitTillElementVisible(driver,addNewuser,55);
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


    public void addNewUserContactDetail(String UserName,String mailid,String mobCode,String MobileNum ) throws Exception {
        waitUtility.waitTillElementVisible(driver,userName,10);
       textBoxControls.setText(userName,UserName);
        textBoxControls.setText(userEmail,mailid);
        waitUtility.waitForSeconds(2);
        commonElements.click(mobCodeDD);
        String mcode = "+"+mobCode;
        selectionOfDropdown(mcode,mobileCodeList);
        waitUtility.waitForSeconds(2);
        textBoxControls.setText(mobNo,MobileNum);
    }

    public void clickNewUserConfirmBtn() throws Exception {

        commonElements.click(contactConfirm);
        corpuserContinue();
    }


    public EntityNamePage corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(2);
        commonElements.click(CrpContinueBtn);
        return new EntityNamePage();

    }


}
