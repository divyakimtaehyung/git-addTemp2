package com.iexceed.uiframework.steps.IOS;

import com.iexceed.uiframework.PageObjects.IOS.userDetailsPage;

public class userDetailsPageActions {

    userDetailsPage userDetailsPage=new userDetailsPage();

    public void fillUserDetails(String fNAme,String lName,String mail,String fatherName,String MotherNmae,String bithcity,
                                String country) throws Exception {
        userDetailsPage.fillingUserDetails(fNAme,lName,mail,fatherName,MotherNmae,bithcity,country);
        userDetailsPage.selectingcountry(country);
        userDetailsPage.selectingCitizenShipCountry(country);
    }

    public void selectDOB(String dob) throws Exception {
        userDetailsPage.selectDOB(dob);

    }
}
