package com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion.TaxResidencyPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class TaxResidencyPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(TaxResidencyPageActions.class);


    TaxResidencyPage taxResidencyPage=new TaxResidencyPage();


    public  TaxResidencyPageActions(){
        PageFactory.initElements(driver,this);
    }


    public void AddTaxCountry(String country,String TInNum) throws Exception {
        taxResidencyPage.addNewCountryTax(country,TInNum);

    }
}
