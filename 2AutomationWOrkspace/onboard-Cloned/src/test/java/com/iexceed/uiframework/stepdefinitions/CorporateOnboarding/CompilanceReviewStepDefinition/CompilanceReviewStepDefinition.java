package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.CompilanceReviewStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.CompilanceReviewPageActions.CompilanceReviewPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class CompilanceReviewStepDefinition extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(CompilanceReviewStepDefinition.class);
   CompilanceReviewPageActions compilanceReviewPageActions=new CompilanceReviewPageActions();
    public static String Screenshotdir ="test-output/Screenshots";
    TestDataHandler testdata = new TestDataHandler();


    @And("user selects EDD Rating as D-Default or risk of default and selects outcome as Approve (.+)$")
    public void user_selects_edd_rating_as_ddefault_or_risk_of_default_and_selects_outcome_as_approve(String testcase) throws Exception {
        CompilanceReviewPageActions compilanceReviewPageActions=new CompilanceReviewPageActions();
        LOGGER.info("user selects EDD Rating as D-Default or risk of default and selects outcome as Approve");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("CompilanceReviewSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        compilanceReviewPageActions.FillCompilanceReviewDetails(dataList.get("Comments"),dataList.get("RiskRatings"),dataList.get("OutCome"));

    }

    @And("user clicks on sumbit$")
    public void user_clicks_on_sumbit() throws Exception {
        LOGGER.info(" user clicks on sumbit");
        CompilanceReviewPageActions compilanceReviewPageActions=new CompilanceReviewPageActions();
        compilanceReviewPageActions.SubmitComReviewApp();
    }

    @And("application should be in sanction screening stage$")
    public void application_should_be_in_sanction_screening_stage(){
        LOGGER.info(" Application moved to Sanction page");
    }
}
