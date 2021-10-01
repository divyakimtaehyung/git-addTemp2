package com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.ContactDetailsPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(ContactDetailsPageActions.class);
    ContactDetailsPage contactDetailsPage=new ContactDetailsPage();
    public ContactDetailsPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void ContactaddNewUser() throws Exception {
        contactDetailsPage.clickAddNewUser();
    }

    public void addNewUserContactDetails(String username,String email,String MobileCode,String MobileNum) throws Exception {
        contactDetailsPage.addNewUserContactDetail(username,email,MobileCode,MobileNum);
    }
    public void clickContactConfirmBtn() throws Exception {
        contactDetailsPage.clickNewUserConfirmBtn();
    }

}
