package com.iexceed.uiframework.steps.CorporateOnboarding;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.DashboardPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.ContactDetailsPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.SansactionDetails.SancationPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(LoginPageActions.class);
    ContactDetailsPage contactDetailsPage=new ContactDetailsPage();
    DashboardPage dashboardPage=new DashboardPage();


    public  DashboardPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void clickNewApllication() throws Exception {
        contactDetailsPage=dashboardPage.clickNewApp();

    }

    public void ApplicationEdit(String appno) throws Exception {
        dashboardPage.clickEditAPplication(appno);


    }

    public void AcquireApplication() throws Exception {

        dashboardPage.acquireApplication();

    }

}
