package com.iexceed.uiframework.steps.CorporateOnboarding.DocumntMngMntDetailPageActions;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.DocumentMntMngMnt.CorporateEntityDocumentPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.DocumentMntMngMnt.ManagementDocumentPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ManagementDocumentPageActions  extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(ManagementDocumentPageActions.class);
    ManagementDocumentPage managementDocumentPage=new ManagementDocumentPage();

    public  ManagementDocumentPageActions(){
        PageFactory.initElements(driver,this);
    }


    public void CropContinue() throws Exception {

        managementDocumentPage.corpuserContinue();
    }

}
