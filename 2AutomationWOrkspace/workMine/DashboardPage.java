package org.uiframework.PageObjects.CorporateOnboarding;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
public class DashboardPage extends TestBase {

    @FindBy(xpath="//a[contains(text(),'My Applications')]")
    WebElement myApplication;
    @FindBy(xpath="//a[contains(text(),'Unclaimed Applications')]")
    WebElement unclaimApp;
    @FindBy(xpath="//a[contains(text(),'Completed Applications')]")
    WebElement completedApp;
    @FindBy(xpath="//a[contains(text(),'Active Applications')]")
    WebElement activeApp;

    @FindBy(xpath="//a[contains(text(),'Active Applications')]")
    WebElement newApp;

    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


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



}
