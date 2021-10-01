package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.ProductUMngMntStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.EntityDetailsStepDefinitions.BusinessLocationStepDefinition;
import com.iexceed.uiframework.steps.CorporateOnboarding.ProductUsrMngMntPageActions.AdministarotDetailsPageAction;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class AdministratorStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(AdministratorStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills adminstation details (.+)$")
    public void user_fills_adminstation_details(String testcase) throws Exception {
        AdministarotDetailsPageAction administarotDetailsPageAction=new AdministarotDetailsPageAction();
        LOGGER.info("user fills adminstation details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"), props.getProperty("productselectSheet"), testcase);
        testdata.setTestDataInMap(dataList);
        administarotDetailsPageAction.BankAdminUSerCreation(dataList.get("Title"), dataList.get("FirstName"), dataList.get("MidNAme"), dataList.get("LastName"), dataList.get("MobCode"), dataList.get("MobNum"), dataList.get("Email")
                , dataList.get("Nationlity"), dataList.get("DOB"), dataList.get("Country"), dataList.get("PassPortNum"), dataList.get("PassPostExpirDate"), dataList.get("Country"), dataList.get("Country"));

    }

    @Then("Build ownership structure page should be displayed$")
    public void build_ownership_structure_page_should_be_displayed(){

        LOGGER.info("Build ownership structure page should be displayed");
    }


    @And("user fills Product and user management and clicks on continue (.+)$")
    public void user_fills_product_and_user_management_and_clicks_on_continue(String testcase) throws Exception {
        ProductSelectionStepDefinition productSelectionStepDefinition=new ProductSelectionStepDefinition();
        productSelectionStepDefinition.user_fills_product_selection_details(testcase);
        user_fills_adminstation_details(testcase);

    }


}
