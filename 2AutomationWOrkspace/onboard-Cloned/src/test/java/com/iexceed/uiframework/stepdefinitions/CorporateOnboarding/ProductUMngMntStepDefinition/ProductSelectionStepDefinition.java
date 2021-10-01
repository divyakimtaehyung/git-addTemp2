package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.ProductUMngMntStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.EntityDetailsStepDefinitions.*;
import com.iexceed.uiframework.steps.CorporateOnboarding.ProductUsrMngMntPageActions.ProductSelectionPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class ProductSelectionStepDefinition extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(ProductSelectionStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/CorporateOnboardingReport";






    @And("user fills product selection details (.+)$")
    public void user_fills_product_selection_details(String testcase) throws Exception {
        ProductSelectionPageActions productSelectionPageActions=new ProductSelectionPageActions();
        LOGGER.info("user fills product selection details details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("productselectSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        productSelectionPageActions.SelectProduct(dataList.get("SalaryAccName"),dataList.get("PurposeOfAccount"),dataList.get("AdditionalDetails"),dataList.get("Curruncy"),dataList.get("TurnOver"),dataList.get("Country"),
                dataList.get("Income"),dataList.get("IncomeUSD"),dataList.get("OutGoing"),dataList.get("OutGoingUSD"));
        productSelectionPageActions.ContinueCorpApplication();

    }
}
