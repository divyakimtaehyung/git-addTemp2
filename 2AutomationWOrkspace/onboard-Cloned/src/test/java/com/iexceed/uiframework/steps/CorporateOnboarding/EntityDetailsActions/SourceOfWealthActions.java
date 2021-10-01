package com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.SourceOfWealth;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SourceOfWealthActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(SourceOfWealthActions.class);
    SourceOfWealth sourceOfWealth=new SourceOfWealth();

    public SourceOfWealthActions(){
        PageFactory.initElements(driver,this);
    }

    public void SourceWealth(String SourceWealth,String SrcWealthDesc) throws Exception {
        sourceOfWealth.sourcewealth(SourceWealth,SrcWealthDesc);

    }
}
