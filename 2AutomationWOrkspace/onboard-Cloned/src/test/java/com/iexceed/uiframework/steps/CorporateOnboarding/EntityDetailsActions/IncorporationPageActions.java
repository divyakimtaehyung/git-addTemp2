package com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.IncorporationPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class IncorporationPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(IncorporationPageActions.class);
    IncorporationPage incorporationPage=new IncorporationPage();

    public IncorporationPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void DateOgIncorp(String Date) throws Exception {
        incorporationPage.incorpDate(Date);
    }
}
