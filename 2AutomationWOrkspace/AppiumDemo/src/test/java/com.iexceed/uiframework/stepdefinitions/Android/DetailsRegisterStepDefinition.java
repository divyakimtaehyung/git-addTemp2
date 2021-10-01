package com.iexceed.uiframework.stepdefinitions.Android;

import com.iexceed.uiframework.PageObjects.Android.DetailsRegisterPage;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.Android.DetailsRegisterPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class DetailsRegisterStepDefinition extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(HomePageStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();

    @And("user enter mailid,monilenumber and DoB (.+)$")
    public void user_enter_mailidmonilenumber_and_dob(String testcase) throws Exception {
        DetailsRegisterPageActions detailsRegisterPageActions=new DetailsRegisterPageActions();
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        detailsRegisterPageActions.DetailsRegister(dataList.get("emailAddress"),dataList.get("mobileNumber"));
        detailsRegisterPageActions.DateSelect(dataList.get("DOB"));
        detailsRegisterPageActions.submitDetails();
    }


    @And("user enter DoB (.+)$")
    public void user_enter_dob(String testcase) throws Exception {
        DetailsRegisterPageActions detailsRegisterPageActions=new DetailsRegisterPageActions();
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        detailsRegisterPageActions.datePickerValidation(dataList.get("DOB"));
    }
}
