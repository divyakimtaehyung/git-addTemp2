package com.iexceed.uiframework.steps.Android;

import com.iexceed.uiframework.PageObjects.Android.otpPage;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static com.iexceed.uiframework.PageObjects.Android.AndroidCabilities.driver;

public class otpPageActions {

    otpPage otpPage=new otpPage();
    public  otpPageActions() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void EnterOTP(String otp){
        otpPage.enterOtp(otp);
    }

    public void clickContinueBtn() throws Exception {
        otpPage.submitOtp();

    }

}
