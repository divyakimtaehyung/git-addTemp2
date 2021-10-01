package com.iexceed.uiframework.steps.CorporateOnboarding.SanctionDetailsPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.SansactionDetails.SancationPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SanctionPageActions extends TestBase {


    private static Logger LOGGER = LogManager.getLogger(SanctionPageActions.class);
    SancationPage sancationPage=new SancationPage();
    String  ApplicationName;

    public SanctionPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void SelectSensitiveSanctionDetaisl() throws Exception {
        sancationPage.sensitiveSanctionDetails();

    }

    public String getAPPlicationName() throws Exception {
        ApplicationName=sancationPage.getAppName();
        return ApplicationName;

    }

    public void checking(String appname){
        System.out.println(appname);

    }
}
