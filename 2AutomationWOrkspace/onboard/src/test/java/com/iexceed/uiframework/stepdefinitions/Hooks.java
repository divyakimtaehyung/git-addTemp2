package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks extends TestBase {
    @Before()
    public  void init(){
        System.out.println("Starting scenario");

    }
    @BeforeStep()
    public  void bf(){
        System.out.println("Before scenario");

    }
    @AfterStep("not @api")
    public  void af(Scenario scenario) throws IOException {
        File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(src);
        scenario.attach(fileContent,"image/png","screenshot");
    }

    @After("not @api")
    public void teardown(Scenario scenario) throws Exception {
       /* if(scenario.isFailed()){
            System.out.println("taking screenshot");
            final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");

        }*/

      //  VideoRecorder_utlity.stopRecord();
        driver.quit();
    }

}
