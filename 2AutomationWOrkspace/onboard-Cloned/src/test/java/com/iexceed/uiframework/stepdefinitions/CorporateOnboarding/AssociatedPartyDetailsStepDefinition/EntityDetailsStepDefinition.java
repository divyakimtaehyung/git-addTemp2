package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.AssociatedPartyDetailsStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.AssociatedPartyDetailsPageActions.EntityDetailsActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class EntityDetailsStepDefinition extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(EntityDetailsStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills assoiciated entity details (.+)$")
    public void user_fills_assoiciated_entity_details(String testcase) throws Exception {
        EntityDetailsActions entityDetailsActions=new EntityDetailsActions();
        LOGGER.info("user fills assoiciated entity details ");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("AssociatedPartySheet"),testcase);
        testdata.setTestDataInMap(dataList);
        entityDetailsActions.addNewEntity();
        entityDetailsActions.EnterEntityDetails(dataList.get("LegalEntityName"),dataList.get("DateOfInCOrp"),dataList.get("Country"),dataList.get("Country"),dataList.get("LegalEntityType"));
        entityDetailsActions.EnterEntityContactDetails(dataList.get("MobCode"),dataList.get("MobNum"),dataList.get("MobCode"),dataList.get("MobNum"),dataList.get("Email"),dataList.get("OwnerShipParentDetails"),dataList.get("LegalEntityType"));

    }

    @Then("Corporate entity documents page should be displayed$")
    public void corporate_entity_documents_page_should_be_displayed(){
        LOGGER.info("Corporate entity documents page should be displayed ");
    }


    @And("user fills Associated party details and clicks on continue (.+)$")
    public void user_fills_associated_party_details_and_clicks_on_continue(String testcase) throws Exception {
        InduvidualDetailsStepDefinition induvidualDetailsStepDefinition=new InduvidualDetailsStepDefinition();
              induvidualDetailsStepDefinition.user_fills_assoiciated_party_details(testcase);
        user_fills_assoiciated_entity_details(testcase);

    }
}
