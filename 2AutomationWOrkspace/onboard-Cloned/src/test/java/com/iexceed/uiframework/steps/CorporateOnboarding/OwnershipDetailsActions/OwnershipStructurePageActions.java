package com.iexceed.uiframework.steps.CorporateOnboarding.OwnershipDetailsActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.OwnerShipDetails.OwnershipPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.OwnerShipDetails.OwnershipStructurePage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class OwnershipStructurePageActions extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(OwnershipStructurePageActions.class);
    OwnershipPage ownershipPage=new OwnershipPage();
    OwnershipStructurePage ownershipStructurePage=new OwnershipStructurePage();


    public  OwnershipStructurePageActions(){
        PageFactory.initElements(driver,this);
    }

    public void SelectOwnershipStructure(String parntentityName,String OwnershipPercent) throws Exception {

        ownershipStructurePage.clickAddOwnerBtn();
        ownershipStructurePage.selectOwnershipStructure(parntentityName,OwnershipPercent);
        ownershipStructurePage.corpuserContinue();

    }

}
