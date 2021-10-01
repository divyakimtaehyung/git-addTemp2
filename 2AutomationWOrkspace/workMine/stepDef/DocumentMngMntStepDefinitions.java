package com.iexceed.uiframework.stepdefinitions.CorporateOnboarding;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CorporateOnboarding.DocumentMngMntActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class DocumentMngMntStepDefinitions extends TestBase {
    private static Logger LOGGER = LogManager.getLogger(DashboardStepDefinitions.class);
    TestDataHandler testdata = new TestDataHandler();
     public static String Screenshotdir ="test-output/Screenshots";

    @And("user fills upload the Document details (.+)$")
    public void user_fills_upload_the_document_details(String testcase) throws Exception {
        DocumentMngMntActions documentMngMntActions=new DocumentMngMntActions();
        LOGGER.info("Updating Industry incorporation date");
        Map<String, String> dataList = ExcelHandler.getTestDataInMap(props.getProperty("filePath"),props.getProperty("DocumentMngMntSheet"),testcase);
        testdata.setTestDataInMap(dataList);
        documentMngMntActions.CertificateOfIncorporationUpload1(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.ValidCommercialLicenseClickUpload2(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.BoardResolutionUpload3(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.ProofOfOpeartingAddressUpload4(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.MemorarumAssociatioUpload5(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.ArticalAssociatioUpload6(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.CpoyOfRegulatoryUpload7(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.certificateIncorpShareholdUpload8n(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.proofShareHoldingParentUpload9(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.businessPlanUpload10(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.financialStmntUpload11(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.passportCopySeniorMngrUpload12(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.passportCopyOfBODUpload13(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.passportcopyOfAuthorizedSignUpload14(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.certifiedTrustDeedUpload15(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.cerificationIncorporationTrusteeUpload16(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.seetiorTrustUpload17(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.ListAllBeneficiaryUpload18(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.passportCopyBeneficiartTrustUpload19(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));
        documentMngMntActions.passportCopyControllernUpload20(dataList.get("Date"),dataList.get("ExpDate"),dataList.get("Remarks"));



        documentMngMntActions.CropContinue();
    }

}
