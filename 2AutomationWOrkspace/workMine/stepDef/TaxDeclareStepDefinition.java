package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions.CommonReportingStandardPageActions;
import com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions.ForeignAccountTaxPageActions;
import com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions.TaxResidencyPageActions;
import com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions.ValueAddedTaxPageActions;
import com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarePageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class TaxDeclareStepDefinition extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(TaxDeclareStepDefinition.class);
   TaxDeclarePageActions taxDeclarePageActions=new TaxDeclarePageActions();
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills Tax declaration Details and clicks on continue (.+)$")
    public void user_fills_tax_declaration_details_and_clicks_on_continue(String testcase) throws Exception {


        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("taxDeclareSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        user_fills_Value_added_taX(testcase);
        user_fills_Tax_residency_page_details(testcase);
        user_fills_Foreign_account_tax_page(testcase);
        user_fills_Common_reporting_standards(testcase);

    }


    public void user_fills_Value_added_taX(String testcase) throws Exception {
        ValueAddedTaxPageActions valueAddedTaxPageActions=new ValueAddedTaxPageActions();
        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("taxDeclareSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        valueAddedTaxPageActions.RegisterVAT(dataList.get("VATNumber"));


    }

    public void user_fills_Tax_residency_page_details(String testcase) throws Exception {
        TaxResidencyPageActions taxResidencyPageActions=new TaxResidencyPageActions();
        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("taxDeclareSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        taxResidencyPageActions.AddTaxCountry(dataList.get("Country"),dataList.get("TINNumber"));


    }


    public void user_fills_Foreign_account_tax_page(String testcase) throws Exception {
        ForeignAccountTaxPageActions foreignAccountTaxPageActions=new ForeignAccountTaxPageActions();
        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("taxDeclareSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        foreignAccountTaxPageActions.DetailsFACTA(dataList.get("UsPersonDDReason"));

    }

    public void user_fills_Common_reporting_standards(String testcase) throws Exception {
        CommonReportingStandardPageActions commonReportingStandardPageActions=new CommonReportingStandardPageActions();
        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("taxDeclareSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        commonReportingStandardPageActions.SelectingCRS(dataList.get("CRS Description"),dataList.get("GINNumber"));

    }
}
