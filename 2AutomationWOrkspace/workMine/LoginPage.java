package org.uiframework.PageObjects.CorporateOnboarding;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class LoginPage extends TestBase {

    @FindBy(id="caolgn__Login__userId")
    WebElement userName;
    @FindBy(id="caolgn__Login__password")
    WebElement password;
    @FindBy(id="caolgn__Login__el_btn_7")
    WebElement loginBtn;
    @FindBy(xpath="//p[contains(text(),'Invalid username or password')]")
    WebElement alertMsg;
    @FindBy(xpath="//button[@class='ok']")
    WebElement okBtn;



    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public LoginPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);

    }

    public void enterLoginCredentials(String username, String pasword)throws Exception{

        setUserName(username);
        waitUtility.waitForSeconds(10);
        setPassword(pasword);

    }



    public void navigateToUrl() throws Exception {
        ((JavascriptExecutor)driver).executeScript("window.open('');");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        windowHandling.switchToAnyWindow(tabs.get(1));
        commonDriver.navigateToUrl(props.getProperty("url"));
        waitUtility.waitForSeconds(10);
    }


    public DashboardPage clickSignInButton() throws Exception {
        waitUtility.waitTillElementBecomeClickable(driver,loginBtn,20);
        getSignInBtn();
        return new DashboardPage();
    }
    public void setUserName(String username) throws Exception {
        setWaitUtilityUsername();
        textBoxControls.setText(userName,username);

    }
    public void setPassword(String pasword) throws Exception {
        setWaitUtilityPassword();
        textBoxControls.setText(password,pasword);
    }
    public void getSignInBtn() throws Exception {
        waitUtility.waitForSeconds(6);
        javaScriptControls.executeJavaScript("arguments[0].click();",loginBtn);

    }
    public void refreshPage() throws Exception {
        commonDriver.navigateRefresh();
    }

    public void setWaitUtilityUsername(){
        waitUtility.waitTillElementVisible(driver,userName,20);
    }
    public void setWaitUtilityPassword(){
        waitUtility.waitTillElementVisible(driver,password,20);
    }
    public void setWaitUtilityLoginBtn(){
        waitUtility.waitTillElementVisible(driver,loginBtn,30);
    }

    public void navigateToUrl(String url,int childWindow) throws Exception {
        ((JavascriptExecutor)driver).executeScript("window.open('');");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        windowHandling.switchToAnyWindow(tabs.get(childWindow));
        commonDriver.navigateToUrl(url);
        waitUtility.waitForSeconds(10);
    }



}
