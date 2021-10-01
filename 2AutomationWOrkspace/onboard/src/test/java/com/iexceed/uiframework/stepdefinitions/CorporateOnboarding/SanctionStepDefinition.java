package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.SanctionPageActions;
import com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarePageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class SanctionStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(SanctionStepDefinition.class);
    SanctionPageActions sansactionPageActions=new SanctionPageActions();
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills sanction details (.+)$")
    public void user_fills_sanction_details(String testcase) throws Exception {
        SanctionPageActions sansactionPageActions=new SanctionPageActions();
        LOGGER.info("User fills the sanction details");
        sansactionPageActions.SelectSensitiveSanctionDetaisl();
        String appName=sansactionPageActions.getAPPlicationName();
        ExcelHandler.UpdateTestDataToExcel(props.getProperty("filePath"), props.getProperty("basicSheetName"),"ApplicationName",appName,testcase);
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        sansactionPageActions.checking(dataList.get("ApplicationName"));

    }

}
