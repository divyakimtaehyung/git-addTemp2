package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.EntityDetailsStepDefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions.CommercialLicensePageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class CommercialLicenseStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(CommercialLicenseStepDefinition.class);

    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills  commercial license issue date details (.+)$")
    public void user_fills_commercial_license_issue_date_details(String testcase) throws Exception {
        CommercialLicensePageActions commercialLicensePageActions=new CommercialLicensePageActions();
        LOGGER.info("Updating Industry incorporation date");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        commercialLicensePageActions.CommercialLicenseIssueDate(dataList.get("LicenseNum"),dataList.get("LicenseIssuedBy"),dataList.get("BusinessActivity"),dataList.get("DateOfIncorp"),dataList.get("LcenseExpireDate"));

    }


}
