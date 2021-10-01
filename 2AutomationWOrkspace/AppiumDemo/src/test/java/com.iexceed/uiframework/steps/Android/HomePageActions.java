package com.iexceed.uiframework.steps.Android;

import com.iexceed.uiframework.PageObjects.Android.AndroidCabilities;
import com.iexceed.uiframework.PageObjects.Android.DetailsRegisterPage;
import com.iexceed.uiframework.PageObjects.Android.HomePage;
import com.iexceed.uiframework.core.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static com.iexceed.uiframework.PageObjects.Android.AndroidCabilities.driver;
import java.net.MalformedURLException;

public class HomePageActions  {



     HomePage homePage=new HomePage();



    public  HomePageActions() throws MalformedURLException {
      PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    public void ClickRegisterBtn() throws Exception {
        homePage.ClikRegisterBtn();
    }


    }
