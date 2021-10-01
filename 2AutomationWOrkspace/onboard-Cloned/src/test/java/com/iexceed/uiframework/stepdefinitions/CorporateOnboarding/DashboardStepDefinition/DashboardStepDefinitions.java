package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.DashboardStepDefinition;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.DashboardPage.DashboardPage;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.SanctionPageStepDefinition.SanctionStepDefinition;
import com.iexceed.uiframework.steps.CorporateOnboarding.DashboardPageActions.DashboardPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class DashboardStepDefinitions extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(DashboardStepDefinitions.class);
    DashboardPage dashboardPage=new DashboardPage();
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";

    @When("user selects the new application$")
    public void user_selects_the_new_application() throws Exception {
        DashboardPageActions dashboardPageActions=new DashboardPageActions();
        dashboardPageActions.clickNewApllication();
        LOGGER.info("RMInput role user clik the new alication ");

    }
    @And("user enter application number (.+)$")
    public void user_enter_application_number(String testcase) throws Exception {

        DashboardPageActions dashboardPageActions=new DashboardPageActions();
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("productselectSheet"),testcase);;
        testdata.setTestDataInMap(dataList);
        dashboardPageActions.ApplicationEdit(dataList.get("ApplicationNO"));


    }


    @And("user acquires the application under unclaimed application dashboard$")
    public void user_acquires_the_application_under_unclaimed_application_dashboard(){
        LOGGER.info("user acquires the application under unclaimed application dashboard ");
    }

    @Then("user acquire the submited application (.+)$")
    public void user_acquire_the_submited_application(String testcase) throws Exception {
        DashboardPageActions dashboardPageactions=new DashboardPageActions();
        SanctionStepDefinition sanctionStepDefinition=new SanctionStepDefinition();
        String ApplicationName=sanctionStepDefinition.getApplicationName();
        dashboardPageactions.AcquireApplication(ApplicationName);


    }

    @And("user click on acquired application under my application dashboard$")
    public void user_click_on_acquired_application_under_my_application_dashboard() throws Exception {
        DashboardPageActions dashboardPageactions=new DashboardPageActions();
        dashboardPageactions.ClickAcquiredApp();

    }
}
