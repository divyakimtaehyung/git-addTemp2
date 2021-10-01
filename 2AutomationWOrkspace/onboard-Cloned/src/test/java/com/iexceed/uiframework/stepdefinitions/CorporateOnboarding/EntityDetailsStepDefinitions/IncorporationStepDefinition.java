package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.EntityDetailsStepDefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions.IncorporationPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class IncorporationStepDefinition extends TestBase {


    private static Logger LOGGER = LogManager.getLogger(IncorporationStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills  Industry incorporation date details (.+)$")
    public void user_fills_industry_incorporation_date_details(String testcase) throws Exception {
      IncorporationPageActions incorporationPageActions=new IncorporationPageActions();
        LOGGER.info("Updating Industry incorporation date");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        incorporationPageActions.DateOgIncorp(dataList.get("DateOfIncorp"));

    }
}
