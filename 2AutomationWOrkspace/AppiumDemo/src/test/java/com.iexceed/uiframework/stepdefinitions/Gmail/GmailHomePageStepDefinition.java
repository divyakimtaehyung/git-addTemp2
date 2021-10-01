package com.iexceed.uiframework.stepdefinitions.Gmail;

import com.iexceed.uiframework.stepdefinitions.Android.HomePageStepDefinition;
import com.iexceed.uiframework.steps.Gmail.GmailDashboardActions;
import com.iexceed.uiframework.steps.Gmail.gmailLoginPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;

public class GmailHomePageStepDefinition {
    private static Logger LOGGER = LogManager.getLogger(GmailHomePageStepDefinition.class);

    @Given("user launch the gmail mobile app with valid capabilities$")
    public void user_launch_the_gmail_mobile_app_with_valid_capabilities() throws Exception {
        gmailLoginPageActions gmailLoginPageActions=new gmailLoginPageActions();
        GmailDashboardActions gmailDashboardActions=new GmailDashboardActions();
        gmailLoginPageActions.readCapabilities();
        gmailDashboardActions.clickGotItIcon();

    }


    @When("gmail app is launched (.+)$")
    public void gmail_app_is_launched(String testcase){
        LOGGER.info("app is launched");

    }

}
