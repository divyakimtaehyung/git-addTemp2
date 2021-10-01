package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.EntityDetailsStepDefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions.EntityNamePageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class EntityNameStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(EntityNameStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";



    @And("user fills new application with the entity name & type details (.+)$")
    public void user_fills_new_application_with_the_entity_name_type_details(String testcase) throws Exception {
        EntityNamePageActions entityNamePageActions=new EntityNamePageActions();
        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        entityNamePageActions.AddEntityTypeAndName(dataList.get("EntityLegalName"),dataList.get("TradeName"),dataList.get("LegalEntityType"),dataList.get("PreviousKnownComName"),dataList.get("PreviousTradeComName"));

    }


}
