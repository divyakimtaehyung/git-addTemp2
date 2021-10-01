package com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.BusinessLocationPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class BusinessLocationpageActions extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(BusinessLocationpageActions.class);
    BusinessLocationPage businessLocationPage=new BusinessLocationPage();

    public BusinessLocationpageActions(){
        PageFactory.initElements(driver,this);
    }


    public void BusinessLocationInfo(String country,String typeOfOperation,String bussPropostion) throws Exception {

        businessLocationPage.businessLocationDetails(country,typeOfOperation,bussPropostion);
    }

}
