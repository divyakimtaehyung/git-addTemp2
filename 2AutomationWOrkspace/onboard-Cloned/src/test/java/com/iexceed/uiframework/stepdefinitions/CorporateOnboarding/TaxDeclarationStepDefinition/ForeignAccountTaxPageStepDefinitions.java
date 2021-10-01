package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.TaxDeclarationStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions.ForeignAccountTaxPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class ForeignAccountTaxPageStepDefinitions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(ValueAddedTaxStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills foreign account tax details (.+)$")
    public void user_fills_foreign_account_tax_details(String testcase) throws Exception {

        ForeignAccountTaxPageActions foreignAccountTaxPageActions=new ForeignAccountTaxPageActions();
        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("taxDeclareSheet"),testcase);
        testdata.setTestDataInMap(dataList);

        foreignAccountTaxPageActions.DetailsFACTA(dataList.get("UsPersonDDReason"));


    }
}
