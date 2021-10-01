package com.iexceed.uiframework.steps.Gmail;

import com.iexceed.uiframework.PageObjects.Gmail.GmailAppCabilities;
import com.iexceed.uiframework.PageObjects.Gmail.gmailLoginpage;

import java.net.MalformedURLException;

public class gmailLoginPageActions {
    GmailAppCabilities gmailAppCabilities=new GmailAppCabilities();
    gmailLoginpage gmailloginpage=new gmailLoginpage();

    public void readCapabilities() throws Exception {
        gmailAppCabilities.AppCapability();
        gmailloginpage.clickGotIt();
    }
}

