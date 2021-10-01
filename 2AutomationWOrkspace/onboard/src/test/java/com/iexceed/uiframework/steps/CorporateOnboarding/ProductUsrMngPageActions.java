package com.iexceed.uiframework.steps.CorporateOnboarding;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.ProductNdUserMngMent.AdminstartorPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.ProductNdUserMngMent.ProductSelectionPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ProductUsrMngPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(ProductUsrMngPageActions.class);
     ProductSelectionPage productSelectionPage=new ProductSelectionPage();
    AdminstartorPage adminstartorPage=new AdminstartorPage();


    public  ProductUsrMngPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void SelectProduct(String salaryAcc,String pruposeOfACC,String addtionalDetail,String currency,String trunOver,
                              String country,String Incometransaction,String IncomeUSDTrans,String outGoingTnx,String OutgoingUSDTnx) throws Exception {

        productSelectionPage.selectProduct(salaryAcc,pruposeOfACC,addtionalDetail,currency,trunOver,country,Incometransaction,
                IncomeUSDTrans,outGoingTnx,OutgoingUSDTnx);
    }
     public void ContinueCorpApplication() throws Exception {
         productSelectionPage.corpuserContinue();

     }

     public void BankAdminUSerCreation(String title,String FirstName,String MidName,String LastName ,String MobCode,
                                       String mobNum,String email,String nationlity,String DOB,String BithPlace,
                                       String PostNum,String PassportExpiDate,String PassPortCountry,String resident) throws Exception {
         adminstartorPage.bankAdminUSerCreation(title,FirstName,MidName,LastName,MobCode,mobNum,email,nationlity,
                 DOB,BithPlace,PostNum,PassportExpiDate ,PassPortCountry,resident);

     }

}
