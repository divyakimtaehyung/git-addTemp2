package com.iexceed.uiframework.steps.CorporateOnboarding;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.ReviewSubmissionDetails.ReviewSubmissionPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ReviewSubmissionActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(ReviewSubmissionActions.class);
    ReviewSubmissionPage reviewSubmissionPage =new ReviewSubmissionPage();
    String ApplicationName;

    public  ReviewSubmissionActions(){
        PageFactory.initElements(driver,this);
    }

    public void SubmitApp() throws Exception {
        reviewSubmissionPage.ClickSubmitAppBtn();

    }


}
