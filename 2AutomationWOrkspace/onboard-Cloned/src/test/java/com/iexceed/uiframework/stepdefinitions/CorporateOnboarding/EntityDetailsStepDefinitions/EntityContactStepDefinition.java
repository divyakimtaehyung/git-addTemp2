package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.EntityDetailsStepDefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions.EntityContactPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class EntityContactStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(EntityContactStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills new application with the entity contact & address details (.+)$")
    public void user_fills_new_application_with_the_entity_contact_address_details(String testcase) throws Exception {
        EntityContactPageActions entityContactPageActions=new EntityContactPageActions();
        LOGGER.info("Updating new user entity contact info details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        entityContactPageActions.EntityContactInformation(dataList.get("Email"),dataList.get("CompanyWebsite"),dataList.get("AddressType"),dataList.get("BuildingName"),
                dataList.get("Street"),dataList.get("Town"),dataList.get("State"),dataList.get("ZipCode"),dataList.get("PostCode"),dataList.get("Country"));
    }

}
