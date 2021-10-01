package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions.*;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class EntityDetailsStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(EntityDetailsStepDefinition.class);
       TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";



    @And("user fills Entity Details and clicks on continue (.+)$")
    public void user_fills_entity_details_and_clicks_on_continue(String testcase) throws Exception {
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
        ContactDetailsPageActions contactDetailsPageActions=new ContactDetailsPageActions();
        contactDetailsPageActions.ContactaddNewUser();
        LOGGER.info("Creating new user entity  and contact details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),caseId);
        testdata.setTestDataInMap(dataList);
        contactDetailsPageActions.addNewUserContactDetails(dataList.get("UserName"),dataList.get("Email"),dataList.get("MobCode"),dataList.get("MobileNum"));
        contactDetailsPageActions.clickContactConfirmBtn();
    }

    @And("user fills new application with the entity name & type details (.+)$")
    public void user_fills_new_application_with_the_entity_name_type_details(String testcase) throws Exception {
        EntityNamePageActions entityNamePageActions=new EntityNamePageActions();
        LOGGER.info("Creating new user entity name  and type details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        entityNamePageActions.AddEntityTypeAndName(dataList.get("EntityLegalName"),dataList.get("TradeName"),dataList.get("LegalEntityType"),dataList.get("PreviousKnownComName"),dataList.get("PreviousTradeComName"));

    }

    @And("user fills new application with the entity contact & address details (.+)$")
    public void user_fills_new_application_with_the_entity_contact_address_details(String testcase) throws Exception {
        EntityContactPageActions entityContactPageActions=new EntityContactPageActions();
        LOGGER.info("Updating new user entity contact info details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        entityContactPageActions.EntityContactInformation(dataList.get("Email"),dataList.get("CompanyWebsite"),dataList.get("AddressType"),dataList.get("BuildingName"),
                dataList.get("Street"),dataList.get("Town"),dataList.get("State"),dataList.get("ZipCode"),dataList.get("PostCode"),dataList.get("Country"));
    }

      @And("user fills new application with business details (.+)$")
        public void user_fills_new_application_with_business_details(String testcase) throws Exception {
          BusinessLocationpageActions businessLocationpageActions=new BusinessLocationpageActions();
          LOGGER.info("Updating new user Business location info details");
          Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
          testdata.setTestDataInMap(dataList);
          businessLocationpageActions.BusinessLocationInfo(dataList.get("Country"),dataList.get("TypeOfOperation"),dataList.get("BusinessPropotion"));

      }
    @And("user fills new application with Industry details (.+)$")
    public void user_fills_new_application_with_industry_details(String testcase) throws Exception {
        IndustryPageActions industryPageActions=new IndustryPageActions();
        LOGGER.info("Updating Industry info details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        industryPageActions.IndustryDetails(dataList.get("TypeOfIndustry"),dataList.get("Section"),dataList.get("Division"),dataList.get("Group"),dataList.get("Class"));

    }

    @And("user fills  Industry incorporation date details (.+)$")
    public void user_fills_industry_incorporation_date_details(String testcase) throws Exception {
       IncorporationPageActions incorporationPageActions=new IncorporationPageActions();
        LOGGER.info("Updating Industry incorporation date");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        incorporationPageActions.DateOgIncorp(dataList.get("DateOfIncorp"));

    }

    @And("user fills  commercial license issue date details (.+)$")
    public void user_fills_commercial_license_issue_date_details(String testcase) throws Exception {
       CommercialLicensePageActions commercialLicensePageActions=new CommercialLicensePageActions();
        LOGGER.info("Updating Industry incorporation date");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        commercialLicensePageActions.CommercialLicenseIssueDate(dataList.get("LicenseNum"),dataList.get("LicenseIssuedBy"),dataList.get("BusinessActivity"),dataList.get("DateOfIncorp"),dataList.get("LcenseExpireDate"));

    }

    @And("user fills  Source fund details (.+)$")
    public void user_fills_source_fund_details(String testcase) throws Exception {
        SourceOfFundActions sourceOfFundActions=new SourceOfFundActions();
        LOGGER.info("Updating Industry source Fund details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        sourceOfFundActions.SourceFund(dataList.get("SourceFund"),dataList.get("Country"),dataList.get("SourceFundDes"));

    }

    @And("user fills  Source wealth details (.+)$")
    public void user_fills_source_wealth_details(String testcase) throws Exception {
        SourceOfWealthActions sourceOfWealthActions=new SourceOfWealthActions();
        LOGGER.info("Updating Industry source Wealth details");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        sourceOfWealthActions.SourceWealth(dataList.get("SourceWealth"),dataList.get("SourceWealthDes"));


    }

}
