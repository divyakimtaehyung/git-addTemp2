package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.AssociatedPartyDetailsStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.OwnershipDetailsStepDefinition.OwnershipStepDefinition;
import com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.OwnershipDetailsStepDefinition.OwnershipStructureStepDefinition;
import com.iexceed.uiframework.steps.CorporateOnboarding.AssociatedPartyDetailsPageActions.InduvidualDetailsPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class InduvidualDetailsStepDefinition extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(InduvidualDetailsStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/CorporateOnboardingReport";


    @And("user fills assoiciated party details (.+)$")
    public void user_fills_assoiciated_party_details(String testcase) throws Exception {
        InduvidualDetailsPageActions induvidualDetailsPageActions=new InduvidualDetailsPageActions();
        LOGGER.info("user fills assoiciated party details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("productselectSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        induvidualDetailsPageActions.AddNewInduviduals();
        induvidualDetailsPageActions.EnterMemberDetails(dataList.get("Title"),dataList.get("FirstName"),dataList.get("MidNAme"),dataList.get("LastName"),dataList.get("DOB"),dataList.get("Role"));
        induvidualDetailsPageActions.EnterContactDetails(dataList.get("MobCode"),dataList.get("MobNum"),dataList.get("MobileCode"),dataList.get("MobNum"),dataList.get("Email"),dataList.get("Country"),dataList.get("Country"),dataList.get("PEPDESC"));
        induvidualDetailsPageActions.clickCheckBox();

    }


    @And("user fills Ownership Details and clicks on continue (.+)$")
    public void user_fills_ownership_details_and_clicks_on_continue(String testcase) throws Exception {
        OwnershipStructureStepDefinition ownershipStructureStepDefinition=new OwnershipStructureStepDefinition();
        OwnershipStepDefinition ownershipStepDefinition=new OwnershipStepDefinition();
        ownershipStructureStepDefinition.user_fills_ownership_structure_and_percentage_details(testcase);
        ownershipStepDefinition.user_fills_ownership_details(testcase);

    }
}
