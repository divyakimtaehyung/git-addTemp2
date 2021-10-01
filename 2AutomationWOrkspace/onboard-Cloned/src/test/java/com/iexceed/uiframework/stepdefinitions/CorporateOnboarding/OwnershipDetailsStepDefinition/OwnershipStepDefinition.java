package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.OwnershipDetailsStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.ProductUMngMntStepDefinition.AdministratorStepDefinition;
import com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.ProductUMngMntStepDefinition.ProductSelectionStepDefinition;
import com.iexceed.uiframework.steps.CorporateOnboarding.OwnershipDetailsActions.OwnershipPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class OwnershipStepDefinition extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(OwnershipStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/CorporateOnboardingReport";


    @And("user fills ownership details (.+)$")
    public void user_fills_ownership_details(String testcase) throws Exception {
       OwnershipPageActions ownershipPageActions=new OwnershipPageActions();
        LOGGER.info("Enter Ownership and Ownership percentage  details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("OwnershipSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        ownershipPageActions.SetOwnerShipDetails(dataList.get("OwnerShipParentDetails"));

    }

    @Then("Individual details page should be displayed (.+)$")
    public void individual_details_page_should_be_displayed(String testcase){
        LOGGER.info("Individual details page should be displayed ");
    }



}
