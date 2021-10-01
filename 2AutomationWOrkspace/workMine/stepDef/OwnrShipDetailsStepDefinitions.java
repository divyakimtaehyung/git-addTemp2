package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.OwnershipDetailsActions.OwnershipPageActions;
import com.iexceed.uiframework.steps.CorporateOnboarding.OwnershipDetailsActions.OwnershipStructurePageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class OwnrShipDetailsStepDefinitions extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(EntityDetailsStepDefinition.class);
        TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";


    @And("user fills Ownership Details and clicks on continue (.+)$")
    public void user_fills_ownership_details_and_clicks_on_continue(String testcase) throws Exception {
        user_fills_ownership_structure_and_percentage_details(testcase);
        user_fills_Ownership_Detail(testcase);


    }


    @And("user fills ownership structure and percentage details (.+)$")
    public void user_fills_ownership_structure_and_percentage_details(String testcase) throws Exception {
        OwnershipStructurePageActions ownershipStructurePageActions=new OwnershipStructurePageActions();
        LOGGER.info("Enter Ownership and Ownership percentage  details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("OwnershipSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        ownershipStructurePageActions.SelectOwnershipStructure(dataList.get("ParentEntityName"),dataList.get("OwnshipPercentage"));

    }

    @And("user fills ownership details (.+)$")
    public void user_fills_Ownership_Detail(String testcase) throws Exception {
        OwnershipPageActions ownershipPageActions=new OwnershipPageActions();
        LOGGER.info("Enter Ownership and Ownership percentage  details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("OwnershipSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        ownershipPageActions.SetOwnerShipDetails(dataList.get("OwnerShipParentDetails"));

    }

}
