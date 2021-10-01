package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class EntityDetailsStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(EntityDetailsStepDefinition.class);
    EntityDetailsPageActions entityDetailsPageActions=new EntityDetailsPageActions();
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";


    @And("user fills new application with allEntityDetails (.+)$")
    public void user_fills_new_application_with_allentitydetails(String testcase) throws Exception {
        user_fills_new_application_with_the_name_address_contact_details(testcase);
        user_fills_new_application_with_the_entity_name_type_details(testcase);
        user_fills_new_application_with_the_entity_contact_address_details(testcase);
        user_fills_new_application_with_business_details(testcase);
        user_fills_new_application_with_industry_details(testcase);
        user_fills_industry_incorporation_date_details(testcase);
        user_fills_commercial_license_issue_date_details(testcase);
        user_fills_source_fund_details(testcase);
        user_fills_source_wealth_details(testcase);

    }

    @And("user fills new application with the name address & contact details (.+)$")
    public void user_fills_new_application_with_the_name_address_contact_details(String caseId) throws Exception {
        EntityDetailsPageActions entityDetailsPageActions=new EntityDetailsPageActions();
        entityDetailsPageActions.ContactaddNewUser();
        LOGGER.info("Creating new user entity  and contact details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),caseId);
        testdata.setTestDataInMap(dataList);
        entityDetailsPageActions.addNewUserContactDetails(dataList.get("UserName"),dataList.get("Email"),dataList.get("MobCode"),dataList.get("MobileNum"));
        entityDetailsPageActions.clickContactConfirmBtn();
    }

    @And("user fills new application with the entity name & type details (.+)$")
    public void user_fills_new_application_with_the_entity_name_type_details(String testcase) throws Exception {
        EntityDetailsPageActions entityDetailsPageActions=new EntityDetailsPageActions();
        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        entityDetailsPageActions.AddEntityTypeAndName(dataList.get("EntityLegalName"),dataList.get("TradeName"),dataList.get("LegalEntityType"),dataList.get("PreviousKnownComName"),dataList.get("PreviousTradeComName"));

    }

    @And("user fills new application with the entity contact & address details (.+)$")
    public void user_fills_new_application_with_the_entity_contact_address_details(String testcase) throws Exception {
        EntityDetailsPageActions entityDetailsPageActions=new EntityDetailsPageActions();
        LOGGER.info("Updating new user entity contact info details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        entityDetailsPageActions.EntityContactInformation(dataList.get("Email"),dataList.get("CompanyWebsite"),dataList.get("AddressType"),dataList.get("BuildingName"),
                dataList.get("Street"),dataList.get("Town"),dataList.get("State"),dataList.get("ZipCode"),dataList.get("PostCode"),dataList.get("Country"));
    }

      @And("user fills new application with business details (.+)$")
        public void user_fills_new_application_with_business_details(String testcase) throws Exception {
          EntityDetailsPageActions entityDetailsPageActions=new EntityDetailsPageActions();
          LOGGER.info("Updating new user Business location info details");
          Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
          testdata.setTestDataInMap(dataList);
          entityDetailsPageActions.BusinessLocationInfo(dataList.get("Country"),dataList.get("TypeOfOperation"),dataList.get("BusinessPropotion"));

      }
    @And("user fills new application with Industry details (.+)$")
    public void user_fills_new_application_with_industry_details(String testcase) throws Exception {
        EntityDetailsPageActions entityDetailsPageActions=new EntityDetailsPageActions();
        LOGGER.info("Updating Industry info details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        entityDetailsPageActions.IndustryDetails(dataList.get("TypeOfIndustry"),dataList.get("Section"),dataList.get("Division"),dataList.get("Group"),dataList.get("Class"));

    }

    @And("user fills  Industry incorporation date details (.+)$")
    public void user_fills_industry_incorporation_date_details(String testcase) throws Exception {
        EntityDetailsPageActions entityDetailsPageActions=new EntityDetailsPageActions();
        LOGGER.info("Updating Industry incorporation date");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        entityDetailsPageActions.DateOgIncorp(dataList.get("DateOfIncorp"));

    }

    @And("user fills  commercial license issue date details (.+)$")
    public void user_fills_commercial_license_issue_date_details(String testcase) throws Exception {
        EntityDetailsPageActions entityDetailsPageActions=new EntityDetailsPageActions();
        LOGGER.info("Updating Industry incorporation date");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        entityDetailsPageActions.CommercialLicenseIssueDate(dataList.get("LicenseNum"),dataList.get("LicenseIssuedBy"),dataList.get("BusinessActivity"),dataList.get("DateOfIncorp"),dataList.get("LcenseExpireDate"));

    }

    @And("user fills  Source fund details (.+)$")
    public void user_fills_source_fund_details(String testcase) throws Exception {
        EntityDetailsPageActions entityDetailsPageActions=new EntityDetailsPageActions();
        LOGGER.info("Updating Industry source Fund details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        entityDetailsPageActions.SourceFund(dataList.get("SourceFund"),dataList.get("Country"),dataList.get("SourceFundDes"));

    }

    @And("user fills  Source wealth details (.+)$")
    public void user_fills_source_wealth_details(String testcase) throws Exception {
        EntityDetailsPageActions entityDetailsPageActions=new EntityDetailsPageActions();
        LOGGER.info("Updating Industry source Wealth details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        entityDetailsPageActions.SourceWealth(dataList.get("SourceWealth"),dataList.get("SourceWealthDes"));


    }

}
