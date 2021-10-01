package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.DocumntMngMntDetailStepDefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.AssociatedPartyDetailsStepDefinition.EntityDetailsStepDefinition;
import com.iexceed.uiframework.stepdefinitions.CorporateOnboarding.AssociatedPartyDetailsStepDefinition.InduvidualDetailsStepDefinition;
import com.iexceed.uiframework.steps.CorporateOnboarding.DocumntMngMntDetailPageActions.CorporateEntityDocumentPageActions;
import com.iexceed.uiframework.steps.CorporateOnboarding.DocumntMngMntDetailPageActions.ManagementDocumentPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class CorporateEntityDocumentStepDefinitions extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(CorporateEntityDocumentStepDefinitions.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String Screenshotdir ="test-output/CorporateOnboardingReport";

    @And("user fills upload the Document details and click on continue(.+)$")
    public void user_fills_upload_the_document_details_and_click_on_continue(String testcase) throws Exception {
        ManagementDocumentStepDefinitions managementDocumentStepDefinitions=new ManagementDocumentStepDefinitions();
        user_upload_the_corporate_entity_document_details(testcase);
        managementDocumentStepDefinitions.user_upload_management_document_details(testcase);
    }





    @And("user upload the corporate entity Document details (.+)$")
    public void user_upload_the_corporate_entity_document_details(String testcase) throws Exception {
        CorporateEntityDocumentPageActions corporateEntityDocumentPageActions=new CorporateEntityDocumentPageActions();
        LOGGER.info("Updating Industry incorporation date");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("DocumentMngMntSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        corporateEntityDocumentPageActions.CertificateOfIncorporationUpload1(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.ValidCommercialLicenseClickUpload2(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.BoardResolutionUpload3(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.ProofOfOpeartingAddressUpload4(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.MemorarumAssociatioUpload5(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.ArticalAssociatioUpload6(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.CpoyOfRegulatoryUpload7(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.certificateIncorpShareholdUpload8n(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.proofShareHoldingParentUpload9(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.businessPlanUpload10(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.financialStmntUpload11(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.passportCopySeniorMngrUpload12(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.passportCopyOfBODUpload13(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.passportcopyOfAuthorizedSignUpload14(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.certifiedTrustDeedUpload15(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.cerificationIncorporationTrusteeUpload16(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.seetiorTrustUpload17(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.ListAllBeneficiaryUpload18(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.passportCopyBeneficiartTrustUpload19(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
//        corporateEntityDocumentPageActions.passportCopyControllernUpload20(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));

        corporateEntityDocumentPageActions.CropContinue();
    }






}
