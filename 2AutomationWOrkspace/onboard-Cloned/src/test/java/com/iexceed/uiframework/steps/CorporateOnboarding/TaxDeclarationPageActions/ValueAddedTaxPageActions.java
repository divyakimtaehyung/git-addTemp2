package com.iexceed.uiframework.steps.CorporateOnboarding.TaxDeclarationPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.TaxDeclartion.ValueAddedTaxPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ValueAddedTaxPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(ValueAddedTaxPageActions.class);

    ValueAddedTaxPage valueAddedTaxPage=new ValueAddedTaxPage();

    public  ValueAddedTaxPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void RegisterVAT(String vatNo) throws Exception {
        valueAddedTaxPage.VATregister(vatNo);

    }

}
