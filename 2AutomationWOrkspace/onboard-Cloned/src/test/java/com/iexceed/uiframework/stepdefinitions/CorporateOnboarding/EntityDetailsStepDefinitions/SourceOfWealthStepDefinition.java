package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.EntityDetailsStepDefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions.SourceOfWealthActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class SourceOfWealthStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(SourceOfWealthStepDefinition.class);

    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills  Source wealth details (.+)$")
    public void user_fills_source_wealth_details(String testcase) throws Exception {
        SourceOfWealthActions sourceOfWealthActions=new SourceOfWealthActions();
        LOGGER.info("Updating Industry source Wealth details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        sourceOfWealthActions.SourceWealth(dataList.get("SourceWealth"),dataList.get("SourceWealthDes"));


    }


    @Then("Product selection page should be displayed$")
    public void product_selection_page_should_be_displayed(){
        LOGGER.info("Product selection page should be displayed");

    }

    @And("user fills Entity Details and clicks on continue (.+)$")
    public void user_fills_entity_details_and_clicks_on_continue(String testcase) throws Exception {
        ContactDetailsPageStepDefinition contactDetailsPageStepDefinition=new ContactDetailsPageStepDefinition();
        EntityNameStepDefinition entityNameStepDefinition=new EntityNameStepDefinition();
        EntityContactStepDefinition entityContactStepDefinition=new EntityContactStepDefinition();
        BusinessLocationStepDefinition businessLocationStepDefinition=new BusinessLocationStepDefinition();
        IndustryStepDefinition industryStepDefinition=new IndustryStepDefinition();
        IncorporationStepDefinition incorporationStepDefinition=new IncorporationStepDefinition();
        CommercialLicenseStepDefinition commercialLicenseStepDefinition=new CommercialLicenseStepDefinition();
        SourceOfFundStepDefinition sourceOfFundStepDefinition=new SourceOfFundStepDefinition();
        SourceOfWealthStepDefinition sourceOfWealthStepDefinition=new SourceOfWealthStepDefinition();


        contactDetailsPageStepDefinition.user_fills_new_application_with_the_name_address_contact_details(testcase);
        entityNameStepDefinition.user_fills_new_application_with_the_entity_name_type_details(testcase);
        entityContactStepDefinition.user_fills_new_application_with_the_entity_contact_address_details(testcase);
        businessLocationStepDefinition.user_fills_new_application_with_business_details(testcase);
        industryStepDefinition.user_fills_new_application_with_industry_details(testcase);
        incorporationStepDefinition.user_fills_industry_incorporation_date_details(testcase);
        commercialLicenseStepDefinition.user_fills_commercial_license_issue_date_details(testcase);
        sourceOfFundStepDefinition.user_fills_source_fund_details(testcase);
        sourceOfWealthStepDefinition.user_fills_source_wealth_details(testcase);
        sourceOfWealthStepDefinition.product_selection_page_should_be_displayed();

    }
}
