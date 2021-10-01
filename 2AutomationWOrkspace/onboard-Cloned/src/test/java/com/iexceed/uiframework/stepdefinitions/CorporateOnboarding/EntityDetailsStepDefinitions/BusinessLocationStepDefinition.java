package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.EntityDetailsStepDefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions.BusinessLocationpageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class BusinessLocationStepDefinition extends TestBase {


    private static Logger LOGGER = LogManager.getLogger(BusinessLocationStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills new application with business details (.+)$")
    public void user_fills_new_application_with_business_details(String testcase) throws Exception {
        BusinessLocationpageActions businessLocationpageActions=new BusinessLocationpageActions();
        LOGGER.info("Updating new user Business location info details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        businessLocationpageActions.BusinessLocationInfo(dataList.get("Country"),dataList.get("TypeOfOperation"),dataList.get("BusinessPropotion"));

    }

}
