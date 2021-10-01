package com.iexceed.uiframework.steps.CorporateOnboarding.LoginPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.DashboardPage.DashboardPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.LoginPage.LoginPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(LoginPageActions.class);
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();

    public LoginPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void enterUserCredentials(String usrName,String Password) throws Exception {
        loginPage.setUserName(usrName);
        loginPage.setPassword(Password);

    }

       public void clickSignInBtn() throws Exception {
        dashboardPage=loginPage.clickSignInButton();
    }
   public void PageRefresh() throws Exception {
       loginPage.refreshPage();

   }

}
