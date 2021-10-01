package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.DocumntMngMntDetailStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.DocumntMngMntDetailPageActions.ManagementDocumentPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class ManagementDocumentStepDefinitions extends TestBase {


    private static Logger LOGGER = LogManager.getLogger(ManagementDocumentStepDefinitions.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/CorporateOnboardingReport";

    @And("user upload management document details (.+)$")
    public void user_upload_management_document_details(String testcase) throws Exception {
        ManagementDocumentPageActions managementDocumentPageActions=new ManagementDocumentPageActions();
        LOGGER.info("Updating Industry incorporation date");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"), props.getProperty("DocumentMngMntSheet"), testcase);
        testdata.setTestDataInMap(dataList);
        Thread.sleep(8000);
        managementDocumentPageActions.CropContinue();


    }

    @Then("Tax Declartion page should be displayed$")
    public void tax_declartion_page_should_be_displayed(){
        LOGGER.info("Tax Declartion page should be displayed");

    }

}
