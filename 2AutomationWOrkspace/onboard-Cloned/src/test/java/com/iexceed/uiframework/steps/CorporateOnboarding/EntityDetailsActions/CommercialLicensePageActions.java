package com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.CommercialLincensePage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class CommercialLicensePageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(CommercialLicensePageActions.class);
    CommercialLincensePage commercialLincensePage=new CommercialLincensePage();

    public CommercialLicensePageActions(){
        PageFactory.initElements(driver,this);
    }

    public void CommercialLicenseIssueDate(String LicensNum,String LicenseIssueBy,String BusinessActivity,String issueDate,String ExpirayDate) throws Exception {

        commercialLincensePage.LicenseIssueDate(LicensNum,LicenseIssueBy,BusinessActivity,issueDate,ExpirayDate);
    }

}
