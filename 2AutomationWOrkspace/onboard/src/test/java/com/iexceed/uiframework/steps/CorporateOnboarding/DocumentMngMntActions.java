package com.iexceed.uiframework.steps.CorporateOnboarding;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.DashboardPage;
import com.iexceed.uiframework.PageObjects.CorporateOnboarding.DocumentMntMngMnt.CorporateEntityDocumentPage;
import com.iexceed.uiframework.core.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class DocumentMngMntActions extends TestBase {

    private static Logger LOGGER = LogManager.getLogger(DocumentMngMntActions.class);
    CorporateEntityDocumentPage corporateEntityDocumentPage=new CorporateEntityDocumentPage();

    public  DocumentMngMntActions(){
        PageFactory.initElements(driver,this);
    }

    public void CropContinue() throws Exception {

        corporateEntityDocumentPage.corpuserContinue();
    }

    public void CertificateOfIncorporationUpload1(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.CertificateOfIncorpClickUpload1Icon(Date,ExpiryDate,Remarks);
    }

    public void ValidCommercialLicenseClickUpload2(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.ValidCommercialLicenseClickUpload2Icon(Date,ExpiryDate,Remarks);
    }


    public void BoardResolutionUpload3(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.BoardResolutionUpload3Icon(Date,ExpiryDate,Remarks);
    }
    public void ProofOfOpeartingAddressUpload4(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.ProofOfOpeartingAddressUpload4Icon(Date,ExpiryDate,Remarks);
    }

    public void MemorarumAssociatioUpload5(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.MemorarumAssociatioUpload5Icon(Date,ExpiryDate,Remarks);
    }

    public void ArticalAssociatioUpload6(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.ArticalAssociatioUpload6Icon(Date,ExpiryDate,Remarks);
    }

    public void CpoyOfRegulatoryUpload7(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.CpoyOfRegulatoryUpload7Icon(Date,ExpiryDate,Remarks);
    }

    public void certificateIncorpShareholdUpload8n(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.certificateIncorpShareholdUpload8Icon(Date,ExpiryDate,Remarks);
    }

    public void proofShareHoldingParentUpload9(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.proofShareHoldingParentUpload9Icon(Date,ExpiryDate,Remarks);
    }

    public void businessPlanUpload10(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.businessPlanUpload10Icon(Date,ExpiryDate,Remarks);
    }

    public void financialStmntUpload11(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.financialStmntUpload11Icon(Date,ExpiryDate,Remarks);
    }

    public void passportCopySeniorMngrUpload12(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.passportCopySeniorMngrUpload12Icon(Date,ExpiryDate,Remarks);
    }
    public void passportCopyOfBODUpload13(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.passportCopyOfBODUpload13Icon(Date,ExpiryDate,Remarks);
    }

    public void passportcopyOfAuthorizedSignUpload14(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.passportcopyOfAuthorizedSignUpload14Icon(Date,ExpiryDate,Remarks);
    }
    public void certifiedTrustDeedUpload15(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.certifiedTrustDeedUpload15Icon(Date,ExpiryDate,Remarks);
    }

    public void cerificationIncorporationTrusteeUpload16(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.cerificationIncorporationTrusteeUpload16Icon(Date,ExpiryDate,Remarks);
    }

    public void seetiorTrustUpload17(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.seetiorTrustUpload17Icon(Date,ExpiryDate,Remarks);
    }

    public void ListAllBeneficiaryUpload18(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.ListAllBeneficiaryUpload18Icon(Date,ExpiryDate,Remarks);
    }

    public void passportCopyBeneficiartTrustUpload19(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.passportCopyBeneficiartTrustUpload19Icon(Date,ExpiryDate,Remarks);
    }
    public void passportCopyControllernUpload20(String Date,String ExpiryDate,String Remarks) throws Exception {

        corporateEntityDocumentPage.passportCopyControllernUpload20Icon(Date,ExpiryDate,Remarks);
    }




}
