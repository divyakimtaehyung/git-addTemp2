package com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.EntityNamePage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class EntityNamePageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(EntityNamePageActions.class);
    EntityNamePage entityNamePage=new EntityNamePage();
    public EntityNamePageActions(){
        PageFactory.initElements(driver,this);
    }

    public void AddEntityTypeAndName(String LglName,String TrdName,String LglType,String PrvisComName,String TrdComName) throws Exception {
        entityNamePage.entityNameaAndType(LglName,TrdName,LglType,PrvisComName,TrdComName);
    }

}
