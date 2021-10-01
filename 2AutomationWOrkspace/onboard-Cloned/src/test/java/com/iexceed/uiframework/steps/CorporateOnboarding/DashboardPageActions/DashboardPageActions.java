package com.iexceed.uiframework.steps.CorporateOnboarding.DashboardPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.DashboardPage.DashboardPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.ContactDetailsPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(DashboardPageActions.class);
    ContactDetailsPage contactDetailsPage=new ContactDetailsPage();
    DashboardPage dashboardPage=new DashboardPage();


    public DashboardPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void clickNewApllication() throws Exception {
        contactDetailsPage=dashboardPage.clickNewApp();

    }

    public void ApplicationEdit(String appno) throws Exception {
        dashboardPage.clickEditAPplication(appno);


    }

    public void AcquireApplication(String applicationName) throws Exception {

        dashboardPage.acquireApplication(applicationName);

    }

    public void ClickAcquiredApp() throws Exception {
        dashboardPage.clickingAcquiredApp();
    }

}
