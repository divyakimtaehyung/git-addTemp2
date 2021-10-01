package com.iexceed.uiframework.steps.CorporateOnboarding;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.EntityDetails.*;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class EntityDetailsPageActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(EntityDetailsPageActions.class);

    ContactDetailsPage contactDetailsPage=new ContactDetailsPage();
    EntityNamePage entityNamePage=new EntityNamePage();
    EntityContactPage entityContactPage=new EntityContactPage();
    BusinessLocationPage businessLocationPage=new BusinessLocationPage();
    IndustryPage industryPage=new IndustryPage();
    IncorporationPage incorporationPage=new IncorporationPage();
    CommercialLincensePage commercialLincensePage=new CommercialLincensePage();
    SourceOfFundPage sourceOfFundPage=new SourceOfFundPage();
    SourceOfWealth sourceOfWealth=new SourceOfWealth();


    public EntityDetailsPageActions(){
        PageFactory.initElements(driver,this);
    }

    public void ContactaddNewUser() throws Exception {
        contactDetailsPage.clickAddNewUser();
    }

    public void addNewUserContactDetails(String username,String email,String MobileCode,String MobileNum) throws Exception {
        contactDetailsPage.addNewUserContactDetail(username,email,MobileCode,MobileNum);
    }
public void clickContactConfirmBtn() throws Exception {
    contactDetailsPage.clickNewUserConfirmBtn();
}

public void AddEntityTypeAndName(String LglName,String TrdName,String LglType,String PrvisComName,String TrdComName) throws Exception {
    entityNamePage.entityNameaAndType(LglName,TrdName,LglType,PrvisComName,TrdComName);
}

  public void EntityContactInformation(String email,String website,String addresType,String buildNum,String Street,String town,String state,
                                       String Zipcode,String PostCode,String country ) throws Exception {

      entityContactPage.entityContactInfo(email,website,addresType,buildNum,Street,town,state,Zipcode,PostCode,country);
  }

  public void BusinessLocationInfo(String country,String typeOfOperation,String bussPropostion) throws Exception {

      businessLocationPage.businessLocationDetails(country,typeOfOperation,bussPropostion);
  }

    public void IndustryDetails(String typeOfIndus,String Section,String Division,String Group,String typeOfclass) throws Exception {
        industryPage.industryDetails(typeOfIndus,Section,Division,Group,typeOfclass);

    }
    public void DateOgIncorp(String Date) throws Exception {
        incorporationPage.incorpDate(Date);
    }

    public void CommercialLicenseIssueDate(String LicensNum,String LicenseIssueBy,String BusinessActivity,String issueDate,String ExpirayDate) throws Exception {

        commercialLincensePage.LicenseIssueDate(LicensNum,LicenseIssueBy,BusinessActivity,issueDate,ExpirayDate);
    }
    public void SourceFund(String SrcFund,String CountrySrcFund,String FundDesc) throws Exception {
        sourceOfFundPage.sourceFund(SrcFund,CountrySrcFund,FundDesc);

    }

    public void SourceWealth(String SourceWealth,String SrcWealthDesc) throws Exception {
        sourceOfWealth.sourcewealth(SourceWealth,SrcWealthDesc);

    }

    }
