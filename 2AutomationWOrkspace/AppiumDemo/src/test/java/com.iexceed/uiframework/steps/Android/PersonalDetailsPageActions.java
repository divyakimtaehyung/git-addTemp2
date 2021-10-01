package com.iexceed.uiframework.steps.Android;

import com.iexceed.uiframework.PageObjects.Android.PersonalDetailsPage;
import com.iexceed.uiframework.PageObjects.Android.otpPage;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static com.iexceed.uiframework.PageObjects.Android.AndroidCabilities.driver;

public class PersonalDetailsPageActions {

    PersonalDetailsPage personalDetailsPage=new PersonalDetailsPage();

    public  PersonalDetailsPageActions() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void fillPersonalDetails(String fname,String lname,String Fatherame,String mothername,String birthCountry,
                                    String birthCity,String citizenCountry) throws Exception {
        personalDetailsPage.fillPersonalDetails(fname,lname);
        personalDetailsPage.enterParenName(Fatherame,mothername);
        personalDetailsPage.selectBirthPlace(birthCountry,birthCity);
        personalDetailsPage.selectCitizenCountry(citizenCountry);
    }
}
