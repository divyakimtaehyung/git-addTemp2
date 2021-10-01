package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.TaxDeclarationStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions.CommonReportingStandardPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class CommonReportingStandardStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(ValueAddedTaxStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills common reporting declaration details (.+)$")
    public void user_fills_common_reporting_declaration_details(String testcase) throws Exception {

        CommonReportingStandardPageActions commonReportingStandardPageActions=new CommonReportingStandardPageActions();

        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("taxDeclareSheet"),testcase);
        testdata.setTestDataInMap(dataList);

        commonReportingStandardPageActions.SelectingCRS(dataList.get("CRS Description"),dataList.get("GINNumber"));


    }

    @Then("Sanction page should be displayed$")
    public void sanction_page_should_be_displayed() throws Throwable {
        LOGGER.info("Sanction page should be displayed");
    }



    @And("user fills Tax declaration Details and clicks on continue (.+)$")
    public void user_fills_tax_declaration_details_and_clicks_on_continue(String testcase) throws Exception {
        ValueAddedTaxStepDefinition valueAddedTaxStepDefinition=new ValueAddedTaxStepDefinition();
        TaxResidencyStepDefinition taxResidencyStepDefinition=new TaxResidencyStepDefinition();
        ForeignAccountTaxPageStepDefinitions foreignAccountTaxPageStepDefinitions=new ForeignAccountTaxPageStepDefinitions();
        CommonReportingStandardStepDefinition commonReportingStandardStepDefinition=new CommonReportingStandardStepDefinition();

        valueAddedTaxStepDefinition.user_fills_value_added_tax_declaration_details(testcase);
        taxResidencyStepDefinition.user_fills_tax_residency_details(testcase);
        foreignAccountTaxPageStepDefinitions.user_fills_foreign_account_tax_details(testcase);
        commonReportingStandardStepDefinition.user_fills_common_reporting_declaration_details(testcase);


    }
}
