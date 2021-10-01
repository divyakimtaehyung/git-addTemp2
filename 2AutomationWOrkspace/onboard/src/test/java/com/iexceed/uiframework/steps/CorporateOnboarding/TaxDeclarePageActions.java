package com.iexceed.uiframework.steps.CorporateOnboarding;


import com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion.CommonReportingStandardsPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion.ForeignAccountTaxPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion.TaxResidencyPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion.ValueAddedTaxPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class TaxDeclarePageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(TaxDeclarePageActions.class);

   ValueAddedTaxPage valueAddedTaxPage=new ValueAddedTaxPage();
   TaxResidencyPage taxResidencyPage=new TaxResidencyPage();
   ForeignAccountTaxPage foreignAccountTaxPage=new ForeignAccountTaxPage();
   CommonReportingStandardsPage commonReportingStandardsPage=new CommonReportingStandardsPage();


    public  TaxDeclarePageActions(){
        PageFactory.initElements(driver,this);
    }

    public void RegisterVAT(String vatNo) throws Exception {
        valueAddedTaxPage.VATregister(vatNo);

    }

    public void AddTaxCountry(String country,String TInNum) throws Exception {
        taxResidencyPage.addNewCountryTax(country,TInNum);

    }

    public void DetailsFACTA(String personCatagory) throws Exception {
        foreignAccountTaxPage.FACTDetails(personCatagory);
    }

    public void SelectingCRS(String CRSList,String GINPin) throws Exception {
        commonReportingStandardsPage.CrsSelection(CRSList,GINPin);
    }
}
