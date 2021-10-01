package com.iexceed.uiframework.steps.Android;

import com.iexceed.uiframework.PageObjects.Android.AndroidCabilities;
import com.iexceed.uiframework.PageObjects.Android.DetailsRegisterPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static com.iexceed.uiframework.PageObjects.Android.AndroidCabilities.driver;

import java.net.MalformedURLException;

public class DetailsRegisterPageActions {


    DetailsRegisterPage detailsRegisterPage=new DetailsRegisterPage();

    public DetailsRegisterPageActions() throws Exception {


        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void DetailsRegister(String Email,String MobNo) throws Exception {

        detailsRegisterPage.FillEmailDetails(Email);
        detailsRegisterPage.FillMobNum(MobNo);
    }

    public void DateSelect(String year) throws Exception {
        detailsRegisterPage.DatePick(year);
    }

    public void submitDetails(){
        detailsRegisterPage.ClickPolicAcceptCheckBox();
        detailsRegisterPage.clickSubmitBtn();
    }

    public void datePickerValidation(String DOB) throws Exception {
        detailsRegisterPage.datePicker(DOB);

    }

}
