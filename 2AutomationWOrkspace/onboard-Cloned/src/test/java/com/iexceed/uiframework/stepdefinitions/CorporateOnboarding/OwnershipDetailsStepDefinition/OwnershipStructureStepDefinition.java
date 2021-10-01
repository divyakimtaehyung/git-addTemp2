package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.OwnershipDetailsStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.OwnershipDetailsActions.OwnershipStructurePageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class OwnershipStructureStepDefinition extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(OwnershipStructureStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";


    @And("user fills ownership structure and percentage details (.+)$")
    public void user_fills_ownership_structure_and_percentage_details(String testcase) throws Exception {
        OwnershipStructurePageActions ownershipStructurePageActions=new OwnershipStructurePageActions();
        LOGGER.info("Enter Ownership and Ownership percentage  details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("OwnershipSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        ownershipStructurePageActions.SelectOwnershipStructure(dataList.get("ParentEntityName"),dataList.get("OwnshipPercentage"));

    }
}
