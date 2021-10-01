package com.iexceed.uiframework.stepdefinitions.Android;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.Android.CapabilityActions;
import com.iexceed.uiframework.steps.Android.HomePageActions;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;

public class HomePageStepDefinition  {
    private static Logger LOGGER = LogManager.getLogger(HomePageStepDefinition.class);
    TestDataHandler testdata = new TestDataHandler();

    @Given("user launch the mobile app with valid capabilities$")
    public void user_launch_the_mobile_app_with_valid_capabilities() throws MalformedURLException {
        CapabilityActions capabilityActions=new CapabilityActions();
        capabilityActions.ReadCapability();

    }
    @When("mobile app is launched$")
    public void mobile_app_is_launched(){

        LOGGER.info("mobile app is launched");
    }

    @Then("user click the register button$")
    public void user_click_the_register_button() throws Exception {
        LOGGER.info("user click the register button");
        HomePageActions homePageActions=new HomePageActions();
        homePageActions.ClickRegisterBtn();
    }
}
