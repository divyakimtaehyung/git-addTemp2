package com.iexceed.uiframework.steps.Gmail;

import com.iexceed.uiframework.PageObjects.Gmail.GmailDashboardPage;

public class GmailDashboardActions {

    GmailDashboardPage gmailDashboardPage=new GmailDashboardPage();


    public void clickGotItIcon() throws Exception {
        gmailDashboardPage.clickGotIt_Dashboard();

    }

    public void msgComposing(String toMailId,String subject,String composeMsg) throws Exception {
        gmailDashboardPage.clickComposeBtn();
        gmailDashboardPage.msgComposing(toMailId,subject,composeMsg);
    }

    public void sentMailDetails(String sentMail,String msg) throws Exception {
        gmailDashboardPage.clickNavigationMenu(sentMail,msg);

    }
}
