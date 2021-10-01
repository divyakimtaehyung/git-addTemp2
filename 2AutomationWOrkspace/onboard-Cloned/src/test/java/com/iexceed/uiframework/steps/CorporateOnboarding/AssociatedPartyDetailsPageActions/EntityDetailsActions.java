package com.iexceed.uiframework.steps.CorporateOnboarding.AssociatedPartyDetailsPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.AssociatedPartyDetails.EntityDetailsPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.AssociatedPartyDetails.InduvidualDetailsPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class EntityDetailsActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(EntityDetailsActions.class);
    InduvidualDetailsPage induvidualDetailsPage=new InduvidualDetailsPage();
    EntityDetailsPage entityDetailsPage=new EntityDetailsPage();

    public  EntityDetailsActions(){
        PageFactory.initElements(driver,this);
    }

    public void addNewEntity() throws Exception {
        entityDetailsPage.ClickEntityCheckBox();
        entityDetailsPage.addNeWEntity();
    }

    public void EnterEntityDetails(String entityName,String DOBIn,String country,String country2,String legalEntity) throws Exception {
        entityDetailsPage.enterEntityDetails(entityName,DOBIn,country,country2,legalEntity);
    }

    public void EnterEntityContactDetails(String OffCode,String OffNum,String mbcode,String MobNum,String email,String entityDesc,String legalEntity) throws Exception {
        entityDetailsPage.EntityContactDetails(OffCode,OffNum,mbcode,MobNum,email,entityDesc,legalEntity);
        entityDetailsPage.corpuserContinue();
    }



}
