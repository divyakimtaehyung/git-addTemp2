package com.iexceed.uiframework.runners;

import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.junit.After;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import static com.iexceed.uiframework.PageObjects.Android.AndroidCabilities.driver;

@RunWith(Cucumber.class)

@CucumberOptions(

//        features = "src/test/resources/Features/Android/AppReleaseJune29.feature",
//        glue = {"com.iexceed.uiframework.stepdefinitions.Android"},
        features = "src/test/resources/Features/IOS/iosfeaturefile.feature",
        glue = {"com.iexceed.uiframework.stepdefinitions.IOS"},
        dryRun=false,
//        monochrome=true, //clear output
        tags= "@B",
        plugin= {"pretty",
                "json:target/jsonReports/cucumber-reports.json","html:target/cucumber-ui-reports.html"
        }

)

public class TestRunnerAppium {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
//
//    @Test(dataProvider = "features")
//    public void feature(PickleWrapper eventwrapper, FeatureWrapper cucumberFeature) throws Throwable {
//        //testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//        testNGCucumberRunner.runScenario(eventwrapper.getPickle());
//    }
//
//    @DataProvider//(parallel=true)
//    public Object[][] features() {
//        // return testNGCucumberRunner.provideFeatures();
//        return testNGCucumberRunner.provideScenarios();
//    }
//
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }

        @After()
        public void quitApp(Scenario scenario) throws Exception {
                driver.quit();
        }
}