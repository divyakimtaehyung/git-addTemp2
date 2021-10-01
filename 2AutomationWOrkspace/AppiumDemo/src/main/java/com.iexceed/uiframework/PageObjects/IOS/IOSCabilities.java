package com.iexceed.uiframework.PageObjects.IOS;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSCabilities {

  public  static IOSDriver<WebElement> driver;

  public  void IOSAppCapability() throws MalformedURLException {

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("pCloudy_Username", "divya.bharathi@i-exceed.com");
    capabilities.setCapability("pCloudy_ApiKey", "tk6cbfnnny9vhm55nhqmgzv3");
    capabilities.setCapability("pCloudy_DurationInMinutes", 15);
    capabilities.setCapability("newCommandTimeout", 600);
    capabilities.setCapability("launchTimeout", 90000);
    capabilities.setCapability("pCloudy_DeviceManufacturer", "APPLE");
    capabilities.setCapability("pCloudy_DeviceVersion", "12.0.1");
    capabilities.setCapability("platformVersion", "12.0.1");
    capabilities.setCapability("platformName", "ios");
    capabilities.setCapability("acceptAlerts", true);
    capabilities.setCapability("automationName", "XCUITest");
    capabilities.setCapability("pCloudy_ApplicationName", "RetailOnboarding_Resigned1633068226.ipa");
    capabilities.setCapability("bundleId", "com.ixceed.RetailOnboarding.Dev");
    capabilities.setCapability("pCloudy_WildNet", "true");
    capabilities.setCapability("pCloudy_EnableVideo", "true");
    capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
    capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
    driver = new IOSDriver<WebElement>(new URL("https://us.pcloudy.com/appiumcloud/wd/hub"), capabilities);  }

}


