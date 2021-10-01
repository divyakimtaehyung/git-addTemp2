package com.iexceed.uiframework.steps.CorporateOnboarding.CompilanceReviewPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.CompilanceReviewPage.CompilanceReviewPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class CompilanceReviewPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(CompilanceReviewPageActions.class);
    CompilanceReviewPage compilanceReviewPage=new CompilanceReviewPage();


    public CompilanceReviewPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void FillCompilanceReviewDetails(String comments,String RiskRate,String outcome) throws Exception {

        compilanceReviewPage.EnterComments(comments);
        compilanceReviewPage.selectriskRating(RiskRate);
        compilanceReviewPage.selectOutcome(outcome);

    }

    public void SubmitComReviewApp() throws Exception {

        compilanceReviewPage.clickSubmit();
    }

}
