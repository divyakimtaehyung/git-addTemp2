package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.AssoicatedPartyPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class AssoicatedPartyStepDefiition extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(DashboardStepDefinitions.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";



    @And("user fills Associated party details and clicks on continue (.+)$")
    public void user_fills_associated_party_details_and_clicks_on_continue(String testcase) throws Exception {
        user_fills_assoiciated_party_details(testcase);
        user_fills_assoiciated_entity_details(testcase);

    }

    @And("user fills assoiciated party details (.+)$")
    public void user_fills_assoiciated_party_details(String testcase) throws Exception {
        AssoicatedPartyPageActions assoicatedPartyPageActions=new AssoicatedPartyPageActions();
        LOGGER.info("user fills assoiciated party details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("productselectSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        assoicatedPartyPageActions.AddNewInduviduals();
        assoicatedPartyPageActions.EnterMemberDetails(dataList.get("Title"),dataList.get("FirstName"),dataList.get("MidNAme"),dataList.get("LastName"),dataList.get("DOB"),dataList.get("Role"));
        assoicatedPartyPageActions.EnterContactDetails(dataList.get("MobCode"),dataList.get("MobNum"),dataList.get("MobileCode"),dataList.get("MobNum"),dataList.get("Email"),dataList.get("Country"),dataList.get("Country"),dataList.get("PEPDESC"));
        assoicatedPartyPageActions.clickCheckBox();

    }

    @And("user fills assoiciated entity details (.+)$")
    public void user_fills_assoiciated_entity_details(String testcase) throws Exception {
        AssoicatedPartyPageActions assoicatedPartyPageActions=new AssoicatedPartyPageActions();
        LOGGER.info("user fills assoiciated entity details ");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("AssociatedPartySheet"),testcase);
        testdata.setTestDataInMap(dataList);
        assoicatedPartyPageActions.addNewEntity();
        assoicatedPartyPageActions.EnterEntityDetails(dataList.get("LegalEntityName"),dataList.get("DateOfInCOrp"),dataList.get("Country"),dataList.get("Country"),dataList.get("LegalEntityType"));
        assoicatedPartyPageActions.EnterEntityContactDetails(dataList.get("MobCode"),dataList.get("MobNum"),dataList.get("MobCode"),dataList.get("MobNum"),dataList.get("Email"),dataList.get("OwnerShipParentDetails"),dataList.get("LegalEntityType"));

    }
}
