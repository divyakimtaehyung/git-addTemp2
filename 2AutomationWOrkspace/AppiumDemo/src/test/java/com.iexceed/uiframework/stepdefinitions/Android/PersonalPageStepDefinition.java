package com.iexceed.uiframework.stepdefinitions.Android;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.Android.PersonalDetailsPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;
import java.util.Map;

public class PersonalPageStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(otpStepDefintion.class);
    TestDataHandler testdata = new TestDataHandler();

    @And("user fill the personal & contact details (.+)$")
    public void user_fill_the_personal_contact_details(String testcase) throws Exception {
        PersonalDetailsPageActions personalDetailsPageActions=new PersonalDetailsPageActions();
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("basicSheetName"),testcase);
        testdata.setTestDataInMap(dataList);
        personalDetailsPageActions.fillPersonalDetails(dataList.get("firstName"),dataList.get("lastName"),dataList.get("fatherName"),dataList.get("motherName"),
                dataList.get("birthCountry"),dataList.get("birthCity"),dataList.get("citizenshipCountry"));
    }
}
