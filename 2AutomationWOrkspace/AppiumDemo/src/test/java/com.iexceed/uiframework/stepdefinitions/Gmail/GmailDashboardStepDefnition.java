package com.iexceed.uiframework.stepdefinitions.Gmail;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.Gmail.GmailDashboardActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class GmailDashboardStepDefnition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(GmailDashboardStepDefnition.class);
    TestDataHandler testdata = new TestDataHandler();

    @Then("user send the message (.+)$")
    public void user_send_the_message(String testcase) throws Exception {
        GmailDashboardActions gmailDashboardActions=new GmailDashboardActions();
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("gmailValidateSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        gmailDashboardActions.msgComposing(dataList.get("toMail_Id"),dataList.get("subject"),dataList.get("composeMsg"));
        gmailDashboardActions.sentMailDetails(dataList.get("subject"),dataList.get("composeMsg"));
    }

}
