package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.LoginPageActions;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPageStepDefinitions extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(LoginPageStepDefinitions.class);
    LoginPageActions loginPageActions=new LoginPageActions();
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/Screenshots";



    @Given("a corporate onboarding application which is at Input stage")
    public void a_corporate_onboarding_application_which_is_at_input_stage() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        LOGGER.info("corporate onboarding application which is at Input stage");
        userIsOnLoginPage();

    }

    @Given("^user is on the login page$")
    public void userIsOnLoginPage() throws Exception {
        LOGGER.info("Browser Initialized and navigating to url");
        TestBase.initialization(props.getProperty("url"));
        LOGGER.info("intialized browser");
        Thread.sleep(8000);
    }




    @And("a corporate onboarding web portal for RMInput role$")
    public void a_corporate_onboarding_web_portal_for_rminput_role() throws Exception {
        LoginPageActions loginPageActions=new LoginPageActions();
        loginPageActions.PageRefresh();
        LOGGER.info("corporate onboarding web portal for RMInput role");
        loginPageActions.enterUserCredentials(props.getProperty("RmInput.username"),props.getProperty("RmInput.password"));


    }
    @When("staff user logs in with the role")
    public void staff_user_logs_in_with_the_role() throws Exception {

        LoginPageActions loginPageActions = new LoginPageActions();
        LOGGER.info("Click on loginBtn");
        loginPageActions.clickSignInBtn();
    }

    @And("a corporate onboarding web portal for CompilanceReview role$")
    public void a_corporate_onboarding_web_portal_for_compilancereview_role() throws Exception {

        LoginPageActions loginPageActions=new LoginPageActions();
        loginPageActions.PageRefresh();
        LOGGER.info("corporate onboarding web portal for Compilance review role");
        loginPageActions.enterUserCredentials(props.getProperty("CompilanceReview.username"),props.getProperty("CompilanceReview.password"));

    }


}
