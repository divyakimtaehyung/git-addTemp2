package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.ReviewSubmissionStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.ReviewSubmissionActions.ReviewSubmissionActions;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReviewSubmissionStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(ReviewSubmissionStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";



    @Then("user click the submit button (.+)$")
    public void user_click_the_submit_button(String testcase) throws Exception {
        ReviewSubmissionActions reviewSubmissionActions=new ReviewSubmissionActions();
        LOGGER.info("user submit the application");
        reviewSubmissionActions.SubmitApp();
    }


}
