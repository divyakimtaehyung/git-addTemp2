package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.TaxDeclarationStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions.TaxResidencyPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class TaxResidencyStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(ValueAddedTaxStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills tax residency details (.+)$")
    public void user_fills_tax_residency_details(String testcase) throws Exception {

        TaxResidencyPageActions taxResidencyPageActions=new TaxResidencyPageActions();
        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("taxDeclareSheet"),testcase);
        testdata.setTestDataInMap(dataList);

        taxResidencyPageActions.AddTaxCountry(dataList.get("Country"),dataList.get("TINNumber"));


    }
}
