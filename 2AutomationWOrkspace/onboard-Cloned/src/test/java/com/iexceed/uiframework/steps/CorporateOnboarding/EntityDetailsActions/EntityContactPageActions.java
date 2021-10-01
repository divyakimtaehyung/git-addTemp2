package com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.EntityContactPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class EntityContactPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(EntityContactPageActions.class);
    EntityContactPage entityContactPage=new EntityContactPage();
    public EntityContactPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void EntityContactInformation(String email,String website,String addresType,String buildNum,String Street,String town,String state,
                                         String Zipcode,String PostCode,String country ) throws Exception {

        entityContactPage.entityContactInfo(email,website,addresType,buildNum,Street,town,state,Zipcode,PostCode,country);
    }
}
