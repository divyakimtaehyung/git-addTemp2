package com.iexceed.uiframework.steps.CorporateOnboarding.EntityDetailsActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.SourceOfFundPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SourceOfFundActions  extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(SourceOfFundActions.class);
    SourceOfFundPage sourceOfFundPage=new SourceOfFundPage();

    public SourceOfFundActions(){
        PageFactory.initElements(driver,this);
    }

    public void SourceFund(String SrcFund,String CountrySrcFund,String FundDesc) throws Exception {
        sourceOfFundPage.sourceFund(SrcFund,CountrySrcFund,FundDesc);

    }
}
