package com.iexceed.uiframework.PageObjects.CorporateOnboarding.OwnerShipDetails;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OwnershipStructurePage extends TestBase {

    //Ownership Structure
    @FindBy(xpath="//div[@class='btn-group']")
    WebElement addOwnerGroup;
    @FindBy(xpath="//div[@class='org-add-button cen']")
    WebElement addOwnerBtn;
    @FindBy(xpath="//*[@id='appdtl__Ownership__orgChart']/table/tbody/tr[1]/td/table/tbody/tr/td/div/div[1]/button[1]")
    WebElement iconCompany;
    @FindBy(xpath="//div[@class='icon node-type']//button[@class='icon-comp'][normalize-space()='Company']")
    WebElement iconCompany1;
    @FindBy(xpath="//div[@class='icon node-type']//button[@class='icon-ind'][normalize-space()='Individual']")
    WebElement iconIndividual;
    @FindBy(xpath="//input[@placeholder='Parent entity name']")
    WebElement parentEntityName;
    @FindBy(xpath="//input[@placeholder='Ownership']")
    WebElement ownershipPercent;
    @FindBy(xpath="//div[@class='edit-btn-group']//button[@class='org-save-button'][normalize-space()='SAVE']")
    WebElement ownershipSaveBtn;
    @FindBy(xpath="//div[@class='edit-btn-group']//button[@class='org-cancel-button'][normalize-space()='CANCEL']")
    WebElement ownershipCancelBtn;


    //Application continue Btn

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
    public MouseControls mouseControls;


    public OwnershipStructurePage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);
        mouseControls=new MouseControls(driver);

    }


    public void clickAddOwnerBtn() throws Exception {
        waitUtility.waitForSeconds(40);
        try {
            javaScriptControls.executeJavaScript("arguments[0].click();", addOwnerGroup);
            javaScriptControls.executeJavaScript("arguments[0].click();",addOwnerBtn);

        }catch(Exception e){

//              commonElements.click(addOwnerGroup);
//               javaScriptControls.executeJavaScript("arguments[0].click();",addOwnerBtn);

        }


    }

    public void selectOwnershipStructure(String parentEntyName,String percentOwnerShip) throws Exception {

        waitUtility.waitForSeconds(6);
        try {

            javaScriptControls.executeJavaScript("arguments[0].click();", iconCompany);
            textBoxControls.setText(parentEntityName,parentEntyName);
            textBoxControls.setText(ownershipPercent,percentOwnerShip);
            commonElements.click(ownershipSaveBtn);
        }catch(Exception e){

            javaScriptControls.executeJavaScript("arguments[0].click();", iconCompany1);
            textBoxControls.setText(parentEntityName,parentEntyName);
            textBoxControls.setText(ownershipPercent,percentOwnerShip);
            commonElements.click(ownershipSaveBtn);
        }


    }

    public OwnershipPage corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(5);
        commonElements.click(CrpContinueBtn);
//        Thread.sleep(70000);
        return new OwnershipPage();
    }


}
