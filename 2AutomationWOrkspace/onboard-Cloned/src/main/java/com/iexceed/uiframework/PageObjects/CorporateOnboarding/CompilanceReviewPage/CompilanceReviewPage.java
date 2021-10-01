package com.iexceed.uiframework.PageObjects.CorporateOnboarding.CompilanceReviewPage;

import com.iexceed.uiframework.PageObjects.CorporateOnboarding.SansactionDetails.SancationPage;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompilanceReviewPage extends TestBase {

    @FindBy(id="comapp__CompApproval__comment")
    WebElement CommentsTxt;
    @FindBy(id="comapp__CompApproval__riskRating")
    WebElement RiskRatingDD;
    @FindBy(xpath="//*[@id='comapp__CompApproval__riskRating_div']/ul/li")
    List<WebElement> RiskRatingList;
    @FindBy(id="comapp__CompApproval__actionDD")
    WebElement OutcomeDD;
    @FindBy(xpath="//*[@id='comapp__CompApproval__actionDD_div']/ul/li")
    List<WebElement> OutcomeList;
    @FindBy(id="comapp__CompApproval__el_btn_10")
    WebElement SubmitBtn;
    @FindBy(id="comapp__CompApproval__cancel")
    WebElement CancelBtn;
    @FindBy(xpath="//button[contains(text(),'Ok')]")
    WebElement PopupOkBtn;


    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;
    SancationPage sancationPage=new SancationPage();

    public CompilanceReviewPage(){
        PageFactory.initElements(driver,this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);

    }

    public void selectionOfDropdown (String itemType, List< WebElement > type){
        for (WebElement name : type) {
            if (name.getText().equals(itemType)) {
                name.click();
                break;
            }
        }
    }

    public void EnterComments(String comments) throws Exception {
        waitUtility.waitTillElementVisible(driver,CommentsTxt,15);
        commonElements.click(CommentsTxt);
        textBoxControls.setText(CommentsTxt,comments);

    }

    public void selectriskRating(String riskrating) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", RiskRatingDD);
        selectionOfDropdown(riskrating,RiskRatingList);

    }

    public void selectOutcome(String outcome) throws Exception {
        javaScriptControls.executeJavaScript("arguments[0].click();", OutcomeDD);
        selectionOfDropdown(outcome,OutcomeList);

    }

    public void clickSubmit() throws Exception {
        commonElements.click(SubmitBtn);
        waitUtility.waitTillElementVisible(driver,PopupOkBtn,20);
        commonElements.click(PopupOkBtn);
    }

}
