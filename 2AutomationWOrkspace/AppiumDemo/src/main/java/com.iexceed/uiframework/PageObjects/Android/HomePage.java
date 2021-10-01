package com.iexceed.uiframework.PageObjects.Android;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import static com.iexceed.uiframework.PageObjects.Android.AndroidCabilities.driver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class HomePage {

    //HomePage
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Register']")
    AndroidElement registerBtn;


    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;



    public HomePage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        commonElements = new CommonElements();
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
    }

    public void ClikRegisterBtn() throws Exception {
        registerBtn.click();
    }

}
