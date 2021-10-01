package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.OwnrShiDetailpPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class OwnrShipDetailsStepDefinitions extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(EntityDetailsStepDefinition.class);
    OwnrShiDetailpPageActions ownrShiDetailpPageActions=new OwnrShiDetailpPageActions();
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";


    @And("user fills new application with OwnershipDetails details (.+)$")
    public void user_fills_new_application_with_ownershipdetails_details(String testcase) throws Exception {
        user_fills_ownership_structure_and_percentage_details(testcase);
        user_fills_ownership_details(testcase);


    }


    @And("user fills ownership structure and percentage details (.+)$")
    public void user_fills_ownership_structure_and_percentage_details(String testcase) throws Exception {
        OwnrShiDetailpPageActions ownrShiDetailpPageActions=new OwnrShiDetailpPageActions();
        LOGGER.info("Enter Ownership and Ownership percentage  details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("OwnershipSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        ownrShiDetailpPageActions.SelectOwnershipStructure(dataList.get("ParentEntityName"),dataList.get("OwnshipPercentage"));

    }

    @And("user fills ownership details (.+)$")
    public void user_fills_ownership_details(String testcase) throws Exception {
        OwnrShiDetailpPageActions ownrShiDetailpPageActions=new OwnrShiDetailpPageActions();
        LOGGER.info("Enter Ownership and Ownership percentage  details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("OwnershipSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        ownrShiDetailpPageActions.SetOwnerShipDetails(dataList.get("OwnerShipParentDetails"));

    }

}
