package com.iexceed.uiframework.stepdefinitions.IOS;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.IOS.homePageActions;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class homePageStepDefinition extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(homePageStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();

    @When("mobile app is launched (.+)$")
    public void mobile_app_is_launched(String testcase) throws Exception {
        homePageActions homepageactions=new homePageActions();
        LOGGER.info("app is launched");
        homepageactions.selectLanguage();
    }
}
