package com.iexceed.uiframework.stepdefinitions.IOS;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.stepdefinitions.Android.otpStepDefintion;
import com.iexceed.uiframework.steps.IOS.userDetailsPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class userDetailsStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(userDetailsStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();

    @When("user fill the details (.+)$")
    public void user_fill_the_details(String testcase) throws Exception {
        userDetailsPageActions userdetailsPageActions=new userDetailsPageActions();
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        userdetailsPageActions.fillUserDetails(dataList.get("firstName"),dataList.get("lastName"),dataList.get("emailAddress"),
                dataList.get("fatherName"),dataList.get("motherName"),dataList.get("birthCity"),dataList.get("birthCountry"));
    }

    @When("user set the dob field (.+)$")
    public void user_set_the_dob_field(String testcase) throws Exception {
        userDetailsPageActions userdetailsPageActions=new userDetailsPageActions();
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        userdetailsPageActions.selectDOB(dataList.get("DOB"));
    }
}
