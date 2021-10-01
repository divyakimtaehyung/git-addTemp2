package com.iexceed.uiframework.stepdefinitions.IOS;


import com.iexceed.uiframework.steps.IOS.IOSCapabilityActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;

public class IOSPageStepDefinition {

    private static Logger LOGGER = LogManager.getLogger(IOSPageStepDefinition.class);

    @Given("user launch the IOS mobile app with valid capabilities$")
    public void user_launch_the_ios_mobile_app_with_valid_capabilities() throws MalformedURLException {
        IOSCapabilityActions iosCapabilityActions=new IOSCapabilityActions();
        iosCapabilityActions.launchIOsApp();

    }

}
