package com.iexceed.uiframework.PageObjects.CorporateOnboarding;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.ContactDetailsPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.SansactionDetails.SancationPage;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
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


    //search
    @FindBy(id="dshbrd__MyAppln__searchMyAppln")
    WebElement searchBox;
    @FindBy(id="dshbrd__LoadTaskList__i__myTaskList__applicationNum_0_txtcnt")
    WebElement ApplicationId;
    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;

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


    public void acquireApplication() throws Exception {
       String Temp=sancationPage.getAppName();
       String ApplicationName=Temp.trim();
        waitUtility.waitForSeconds(25);
        commonElements.click(searchBox);
        textBoxControls.setText(searchBox,ApplicationName);
//        waitUtility.waitTillElementVisible(driver,ApplicationId,5);


    }


}
