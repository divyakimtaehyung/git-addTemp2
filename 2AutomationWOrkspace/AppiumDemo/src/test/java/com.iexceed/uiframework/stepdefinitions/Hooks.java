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

    @After()
    public void quitApp(Scenario scenario) throws Exception {
        driver.quit();
    }


}
