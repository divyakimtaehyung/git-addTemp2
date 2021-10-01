package com.iexceed.uiframework.steps.CorporateOnboarding.OwnershipDetailsActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.OwnerShipDetails.OwnershipPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.OwnerShipDetails.OwnershipStructurePage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class OwnershipPageActions extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(OwnershipPageActions.class);
    OwnershipPage ownershipPage=new OwnershipPage();
    OwnershipStructurePage ownershipStructurePage=new OwnershipStructurePage();

    public  OwnershipPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void SetOwnerShipDetails(String parentDetails) throws Exception {
//       ownershipPage.corpuserContinue();
        ownershipPage.setOwnership(parentDetails);
        ownershipPage.corpuserContinue();
    }
}
