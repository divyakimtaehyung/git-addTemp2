package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsPageActions;
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

    @And("user fills tax declaration details (.+)$")
    public void user_fills_tax_declaration_details(String testcase) throws Exception {

        TaxDeclarePageActions taxDeclarePageActions=new TaxDeclarePageActions();
        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("taxDeclareSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        taxDeclarePageActions.RegisterVAT(dataList.get("VATNumber"));
        taxDeclarePageActions.AddTaxCountry(dataList.get("Country"),dataList.get("TINNumber"));
        taxDeclarePageActions.DetailsFACTA(dataList.get("UsPersonDDReason"));
        taxDeclarePageActions.SelectingCRS(dataList.get("CRS Description"),dataList.get("GINNumber"));


    }


}
