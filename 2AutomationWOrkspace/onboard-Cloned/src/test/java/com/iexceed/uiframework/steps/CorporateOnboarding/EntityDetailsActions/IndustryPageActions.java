package com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.IndustryPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class IndustryPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(IndustryPageActions.class);
    IndustryPage industryPage=new IndustryPage();

    public IndustryPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void IndustryDetails(String typeOfIndus,String Section,String Division,String Group,String typeOfclass) throws Exception {
        industryPage.industryDetails(typeOfIndus,Section,Division,Group,typeOfclass);

    }
}
