package com.iexceed.uiframework.steps.Android;

import com.iexceed.uiframework.PageObjects.Android.VerifyIdentityPage;

public class VerifyIdentityPageActions {

    VerifyIdentityPage verifyIdentityPage=new VerifyIdentityPage();

    public void verifyIdentitityDetails(String possportid,String dateOfissued,String dateofExpiry,String authority,String issueCountry) throws Exception {
        verifyIdentityPage.enterPassportIdentity(possportid);
        verifyIdentityPage.DateOfissuePassport_Expiry(dateOfissued,dateofExpiry);
        verifyIdentityPage.enterIssueAuthorityDetails(authority);
        verifyIdentityPage.selectPassportIssueCountry(issueCountry);
    }

}
