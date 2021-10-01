package com.iexceed.uiframework.steps.CorporateOnboarding;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.OwnerShipDetails.OwnershipPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.OwnerShipDetails.OwnershipStructurePage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class OwnrShiDetailpPageActions extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(OwnrShiDetailpPageActions.class);
   OwnershipPage ownershipPage=new OwnershipPage();
    OwnershipStructurePage ownershipStructurePage=new OwnershipStructurePage();


    public  OwnrShiDetailpPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void SelectOwnershipStructure(String parntentityName,String OwnershipPercent) throws Exception {

        ownershipStructurePage.clickAddOwnerBtn();
        ownershipStructurePage.selectOwnershipStructure(parntentityName,OwnershipPercent);
        ownershipStructurePage.corpuserContinue();

 }

   public void SetOwnerShipDetails(String parentDetails) throws Exception {
//       ownershipPage.corpuserContinue();
       ownershipPage.setOwnership(parentDetails);
       ownershipPage.corpuserContinue();
   }
}
