package com.iexceed.uiframework.PageObjects.Android;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static com.iexceed.uiframework.PageObjects.Android.AndroidCabilities.driver;

public class otpPage {

    //HomePage
    @AndroidFindBy(xpath ="//*[@text='Enter OTP']")
    AndroidElement otpTextBox;
    @AndroidFindBy(xpath ="//*[@text='Continue']")
    AndroidElement ContinueBtn;

    private CommonElements commonElements;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;




    public otpPage() throws MalformedURLException {


        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        commonElements = new CommonElements();
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();

    }

       public void enterOtp(String otp){
        otpTextBox.click();
        otpTextBox.sendKeys(otp);
        }

public void submitOtp() throws Exception {
        waitUtility.waitForSeconds(3);
    ContinueBtn.click();
}

}
