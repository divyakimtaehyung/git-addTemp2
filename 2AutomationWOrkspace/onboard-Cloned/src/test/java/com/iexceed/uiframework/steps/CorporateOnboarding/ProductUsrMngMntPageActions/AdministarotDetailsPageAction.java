package com.iexceed.uiframework.steps.CorporateOnboarding.ProductUsrMngMntPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.ProductNdUserMngMent.AdminstartorPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.ProductNdUserMngMent.ProductSelectionPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class AdministarotDetailsPageAction extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(AdministarotDetailsPageAction.class);
    ProductSelectionPage productSelectionPage=new ProductSelectionPage();
    AdminstartorPage adminstartorPage=new AdminstartorPage();


    public  AdministarotDetailsPageAction(){
        PageFactory.initElements(driver,this);
    }




    public void BankAdminUSerCreation(String title,String FirstName,String MidName,String LastName ,String MobCode,
                                      String mobNum,String email,String nationlity,String DOB,String BithPlace,
                                      String PostNum,String PassportExpiDate,String PassPortCountry,String resident) throws Exception {
        adminstartorPage.bankAdminUSerCreation(title,FirstName,MidName,LastName,MobCode,mobNum,email,nationlity,
                DOB,BithPlace,PostNum,PassportExpiDate ,PassPortCountry,resident);

    }

}
