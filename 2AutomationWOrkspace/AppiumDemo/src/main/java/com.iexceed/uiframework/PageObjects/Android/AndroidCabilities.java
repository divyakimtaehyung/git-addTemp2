package com.iexceed.uiframework.PageObjects.Android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidCabilities {

  public  static AndroidDriver<?> driver;

  public  void AppCapability() throws MalformedURLException {

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("pCloudy_Username", "sriganesh.d@i-exceed.com");
    capabilities.setCapability("pCloudy_ApiKey", "bkx8w6zydrxh6kj7xxw5t4kr");
    capabilities.setCapability("pCloudy_DurationInMinutes", 25);
    capabilities.setCapability("newCommandTimeout", 600);
    capabilities.setCapability("launchTimeout", 90000);
    capabilities.setCapability("pCloudy_DeviceManufacturer", "GOOGLE");
    capabilities.setCapability("pCloudy_DeviceVersion", "10.0.0");
    capabilities.setCapability("platformVersion", "10.0.0");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("automationName", "uiautomator2");
    capabilities.setCapability("pCloudy_ApplicationName", "app-releaseJune29.apk");
    capabilities.setCapability("appPackage", "com.iexceed.retailonboarding");
    capabilities.setCapability("appActivity", "com.iexceed.retailonboarding.splashscreen.SplashscreenActivity");
    capabilities.setCapability("pCloudy_WildNet", "false");
    capabilities.setCapability("pCloudy_EnableVideo", "false");
    capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
    capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
    capabilities.setCapability("MobileCapabilityType.NO_RESET", "true");
     driver = new AndroidDriver<AndroidElement>(new URL("https://us.pcloudy.com/appiumcloud/wd/hub"), capabilities);
}



}


