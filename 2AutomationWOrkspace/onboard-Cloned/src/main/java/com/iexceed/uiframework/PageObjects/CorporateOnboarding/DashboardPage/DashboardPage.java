package com.iexceed.uiframework.PageObjects.CorporateOnboarding.DashboardPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.ContactDetailsPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.SansactionDetails.SancationPage;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends TestBase {

    @FindBy(xpath="//a[contains(text(),'My Applications')]")
    WebElement myApplication;
    @FindBy(xpath="//a[contains(text(),'Unclaimed Applications')]")
    WebElement unclaimApp;
    @FindBy(xpath="//a[contains(text(),'Completed Applications')]")
    WebElement completedApp;
    @FindBy(xpath="//a[contains(text(),'Active Applications')]")
    WebElement activeApp;

    @FindBy(id="dshbrd__Dashboard__newApplnBtn_txtcnt")
    WebElement newApp;


    //unclaimed aplication tab
    @FindBy(xpath="//a[contains(text(),'Unclaimed Applications')]")
    WebElement UnclaimedApplication;

    //Acquire unclaimed application
    @FindBy(xpath="//*[@id='dshbrd__UnclaimedAppln__el_icn_5_0']")
    WebElement AcquireUnclaimedApp;
    @FindBy(xpath="//button[contains(text(),'Ok')]")
    WebElement PopupOkBtn;

    //unclaimed search tab
    @FindBy(id="dshbrd__UnclaimedAppln__searchUnclaminedAppln")
    WebElement searchBox;

    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;

    //Myappliaction tab search box
    @FindBy(id="dshbrd__MyAppln__searchMyAppln")
    WebElement MyAppsearchBox;
    @FindBy(id="dshbrd__LoadTaskList__i__myTaskList__applicationNum_0_txtcnt")
    WebElement ApplicationId;

    String AcquiredAPP;

    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;
    SancationPage sancationPage=new SancationPage();

    public DashboardPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);

    }

    public ContactDetailsPage clickNewApp() throws Exception {
        waitUtility.waitForSeconds(20);
        waitUtility.waitTillElementVisible(driver,newApp,60);
        commonElements.click(newApp);
        waitUtility.waitForSeconds(20);
        return new ContactDetailsPage();
    }


    public void clickEditAPplication(String applicationNo) throws Exception {
        waitUtility.waitForSeconds(15);
        commonElements.click(searchBox);
        textBoxControls.setText(searchBox,applicationNo);
        waitUtility.waitTillElementVisible(driver,ApplicationId,5);
        commonElements.click(ApplicationId);
        waitUtility.waitForSeconds(20);
        commonElements.click(CrpContinueBtn);

    }


    public void acquireApplication(String tempApplication) throws Exception {
//       String Temp=sancationPage.getAppName();
//        String Temp=" CPOB5049";
       AcquiredAPP=tempApplication.trim();
       commonElements.click(UnclaimedApplication);
        waitUtility.waitForSeconds(5);
        commonElements.click(searchBox);
        textBoxControls.setText(searchBox,AcquiredAPP);

        try {
            commonElements.click(AcquireUnclaimedApp);
        }catch (Exception e){

         System.out.println(e);
        }
        waitUtility.waitTillElementVisible(driver,PopupOkBtn,10);
        commonElements.click(PopupOkBtn);
    }

    public void clickingAcquiredApp() throws Exception {
//        AcquiredAPP="CPOB5049";
        waitUtility.waitForSeconds(20);
        commonElements.click(MyAppsearchBox);
        textBoxControls.setText(MyAppsearchBox,AcquiredAPP);
        waitUtility.waitTillElementVisible(driver,ApplicationId,5);
        commonElements.click(ApplicationId);

    }


}
