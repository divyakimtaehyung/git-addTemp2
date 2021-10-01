package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.SanctionPageStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.SanctionDetailsPageActions.SanctionPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class SanctionStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(SanctionStepDefinition.class);
    SanctionPageActions sanctionPageActions=new SanctionPageActions();
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/CorporateOnboardingReport";
    String appName;
    @And("user fills sanction details and clicks on continue (.+)$")
    public void user_fills_sanction_details_and_clicks_on_continue(String testcase) throws Exception {
        SanctionPageActions sansactionPageActions=new SanctionPageActions();
        LOGGER.info("User fills the sanction details");
        sansactionPageActions.SelectSensitiveSanctionDetaisl();
         appName=sansactionPageActions.getAPPlicationName();
        ExcelHandler.UpdateTestDataToExcel(props.getProperty("filePath"), props.getProperty("basicSheetName"),"ApplicationName",appName,testcase);
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        sansactionPageActions.checking(dataList.get("ApplicationName"));


    }


    public String getApplicationName() throws Exception {

        return appName;
    }

    @Then("Application submit page should be displayed$")
    public void application_submit_page_should_be_displayed(){
        LOGGER.info("Application submit page should be displayed");
    }



}
