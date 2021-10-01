package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.TaxDeclarationStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions.ValueAddedTaxPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class ValueAddedTaxStepDefinition extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(ValueAddedTaxStepDefinition.class);
        TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills value added tax declaration details (.+)$")
    public void user_fills_value_added_tax_declaration_details(String testcase) throws Exception {

        ValueAddedTaxPageActions valueAddedTaxPageActions=new ValueAddedTaxPageActions();
        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("taxDeclareSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        valueAddedTaxPageActions.RegisterVAT(dataList.get("VATNumber"));


    }
}
