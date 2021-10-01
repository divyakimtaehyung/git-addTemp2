package com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion.CommonReportingStandardsPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion.ForeignAccountTaxPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ForeignAccountTaxPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(ForeignAccountTaxPageActions.class);


    ForeignAccountTaxPage foreignAccountTaxPage=new ForeignAccountTaxPage();
    CommonReportingStandardsPage commonReportingStandardsPage=new CommonReportingStandardsPage();


    public  ForeignAccountTaxPageActions(){
        PageFactory.initElements(driver,this);
    }
    public void DetailsFACTA(String personCatagory) throws Exception {
        foreignAccountTaxPage.FACTDetails(personCatagory);
    }

}
