package com.iexceed.uiframework.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/Features/Gmail/GmailValidation.feature",
        glue = {"com.iexceed.uiframework.stepdefinitions.Gmail"},
        dryRun=false,
//        monochrome=true, //clear output
//        tags= "@B",
        plugin= {"pretty",
                "json:target/jsonReports/cucumber-reports.json","html:target/cucumber-ui-reports.html"
        }

)


public class gmailTestRunner {
}
