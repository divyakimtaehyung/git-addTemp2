package com.iexceed.uiframework.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/Features/CorporateOnboarding/rmInputApplicationCreation.feature",
        glue = {"com.iexceed.uiframework.stepdefinitions.CorporateOnboarding"},
        dryRun=false,
        monochrome=true, //clear output
        tags= "@A",
//        tags= "@1",
        plugin= {"pretty",
                "json:target/jsonReports/cucumber-reports.json","html:target/cucumber-ui-reports.html"
        }
        //sanity and regression tags= {"@sanity,@regression"}-sanity or regression

)

public class TestRunnerLocal {
//    private TestNGCucumberRunner testNGCucumberRunner;
//
//    @BeforeClass(alwaysRun = true)
//    public void setUpClass() throws Exception {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
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
//    @AfterClass(alwaysRun = true)
//    public void tearDownClass() throws Exception {
//        testNGCucumberRunner.finish();
//    }
}