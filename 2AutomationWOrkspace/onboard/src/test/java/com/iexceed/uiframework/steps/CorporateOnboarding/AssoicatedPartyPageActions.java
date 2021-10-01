package com.iexceed.uiframework.steps.CorporateOnboarding;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.AssociatedPartyDetails.EntityDetailsPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.AssociatedPartyDetails.InduvidualDetailsPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.parser.Entity;

public class AssoicatedPartyPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(AssoicatedPartyPageActions.class);
    InduvidualDetailsPage induvidualDetailsPage=new InduvidualDetailsPage();
    EntityDetailsPage entityDetailsPage=new EntityDetailsPage();

    public  AssoicatedPartyPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void AddNewInduviduals() throws Exception {
        induvidualDetailsPage.addNewIndivdual();
        induvidualDetailsPage.selectMemeber();
    }
    public void EnterMemberDetails(String title,String firstname,String MidName,String LastName,String DOB,String role) throws Exception {

        induvidualDetailsPage.fillMemebersDetails(title,firstname,MidName,LastName,DOB,role);

    }

    public void EnterContactDetails(String OffCode,String OffNum,String mbcode,String MobNum,String email,
                                    String country,String nationlity,String PepDescr) throws Exception {
        induvidualDetailsPage.fillContactDetails(OffCode,OffNum,mbcode,MobNum,email,country,nationlity,PepDescr);


    }

    public void clickCheckBox() throws Exception {
        induvidualDetailsPage.ClickInduvidualCheckBox();
        induvidualDetailsPage.corpuserContinue();
    }

    public void CorpUSerContine() throws Exception {
        induvidualDetailsPage.corpuserContinue();
    }

    public void addNewEntity() throws Exception {
        entityDetailsPage.ClickEntityCheckBox();
        entityDetailsPage.addNeWEntity();
    }

    public void EnterEntityDetails(String entityName,String DOBIn,String country,String country2,String legalEntity) throws Exception {
        entityDetailsPage.enterEntityDetails(entityName,DOBIn,country,country2,legalEntity);
    }

    public void EnterEntityContactDetails(String OffCode,String OffNum,String mbcode,String MobNum,String email,String entityDesc,String legalEntity) throws Exception {
        entityDetailsPage.EntityContactDetails(OffCode,OffNum,mbcode,MobNum,email,entityDesc,legalEntity);
//        entityDetailsPage.corpuserContinue();
    }


}
