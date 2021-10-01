package com.iexceed.uiframework.steps.CorporateOnboarding.ProductUsrMngMntPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.ProductNdUserMngMent.AdminstartorPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.ProductNdUserMngMent.ProductSelectionPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ProductSelectionPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(ProductSelectionPageActions.class);
    ProductSelectionPage productSelectionPage=new ProductSelectionPage();
    AdminstartorPage adminstartorPage=new AdminstartorPage();


    public  ProductSelectionPageActions(){
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
}
