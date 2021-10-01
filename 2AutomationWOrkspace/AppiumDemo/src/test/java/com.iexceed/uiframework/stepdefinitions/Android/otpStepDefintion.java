package com.iexceed.uiframework.stepdefinitions.Android;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.Android.otpPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;
import java.util.Map;

public class otpStepDefintion extends TestBase  {

    private static Logger LOGGER = LogManager.getLogger(otpStepDefintion.class);
    TestDataHandler testdata = new TestDataHandler();

    @And("user enter otp and click on continue (.+)$")
    public void user_enter_otp_and_click_on_continue(String testcase) throws Exception {
        otpPageActions otppageActions=new otpPageActions();
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        otppageActions.EnterOTP(dataList.get("otp"));
        otppageActions.clickContinueBtn();
    }
}
