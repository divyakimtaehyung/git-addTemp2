package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.EntityDetailsStepDefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions.SourceOfFundActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class SourceOfFundStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(SourceOfFundStepDefinition.class);

    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills  Source fund details (.+)$")
    public void user_fills_source_fund_details(String testcase) throws Exception {
        SourceOfFundActions sourceOfFundActions=new SourceOfFundActions();
        LOGGER.info("Updating Industry source Fund details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        sourceOfFundActions.SourceFund(dataList.get("SourceFund"),dataList.get("Country"),dataList.get("SourceFundDes"));

    }
}
