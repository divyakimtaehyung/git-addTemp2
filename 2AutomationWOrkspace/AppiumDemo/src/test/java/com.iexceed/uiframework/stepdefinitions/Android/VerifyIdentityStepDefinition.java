package com.iexceed.uiframework.stepdefinitions.Android;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.Android.VerifyIdentityPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class VerifyIdentityStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(otpStepDefintion.class);
    TestDataHandler testdata = new TestDataHandler();

    @And("user fill the identity details (.+)$")
    public void user_fill_the_identity_details(String testcase) throws Exception {
        VerifyIdentityPageActions verifyIdentityPageActions=new VerifyIdentityPageActions();
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        verifyIdentityPageActions.verifyIdentitityDetails(dataList.get("passportId"),dataList.get("dateOfIssue"),dataList.get("dateOfExpiry"),dataList.get("issuedAuthority"),dataList.get("issuedCountry"));
    }


}
