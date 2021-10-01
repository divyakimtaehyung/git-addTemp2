package com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion.CommonReportingStandardsPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class CommonReportingStandardPageActions  extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(CommonReportingStandardPageActions.class);


    CommonReportingStandardsPage commonReportingStandardsPage=new CommonReportingStandardsPage();


    public  CommonReportingStandardPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void SelectingCRS(String CRSList,String GINPin) throws Exception {
        commonReportingStandardsPage.CrsSelection(CRSList,GINPin);
    }
}
