package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.EntityDetailsStepDefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions.ContactDetailsPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class ContactDetailsPageStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(ContactDetailsPageStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";



    @And("user fills new application with the name address & contact details (.+)$")
    public void user_fills_new_application_with_the_name_address_contact_details(String caseId) throws Exception {
        ContactDetailsPageActions contactDetailsPageActions=new ContactDetailsPageActions();
        contactDetailsPageActions.ContactaddNewUser();
        LOGGER.info("Creating new user entity  and contact details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),caseId);
        testdata.setTestDataInMap(dataList);
        contactDetailsPageActions.addNewUserContactDetails(dataList.get("UserName"),dataList.get("Email"),dataList.get("MobCode"),dataList.get("MobileNum"));
        contactDetailsPageActions.clickContactConfirmBtn();
    }



}
