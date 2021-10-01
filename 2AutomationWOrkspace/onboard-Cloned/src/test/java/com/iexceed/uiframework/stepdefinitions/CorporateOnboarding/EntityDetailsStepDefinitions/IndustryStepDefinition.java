package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.EntityDetailsStepDefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions.IndustryPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class IndustryStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(IndustryStepDefinition.class);

    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills new application with Industry details (.+)$")
    public void user_fills_new_application_with_industry_details(String testcase) throws Exception {
        IndustryPageActions industryPageActions=new IndustryPageActions();
        LOGGER.info("Updating Industry info details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        industryPageActions.IndustryDetails(dataList.get("TypeOfIndustry"),dataList.get("Section"),dataList.get("Division"),dataList.get("Group"),dataList.get("Class"));

    }
}
