package com.iexceed.uiframework.PageObjects.CorporateOnboarding.DocumentMntMngMnt;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CorporateEntityDocumentPage extends TestBase {

//upload icon 1 certificate incorporation
    @FindBy(id="appdtl__DocumentUpload__el_btn_1_0")
    WebElement upload1Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload1Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload1ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload1Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload1DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload1ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17_txtcnt")
    WebElement upload1CancelBtn;


    //upload icon2 valid commercial license
    @FindBy(id="appdtl__DocumentUpload__el_btn_1_1")
    WebElement upload2Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload2Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload2ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload2Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload2DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload2ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload2CancelBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_2_1")
    WebElement upload2DocBtn;


    //upload icon3 board resolution POA

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_2")
    WebElement upload3Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload3Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload3ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload3Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload3DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload3ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload3CancelBtn;


    //upload icon4 proof of opearting addreess

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_3")
    WebElement upload4Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload4Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload4ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload4Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload4DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload4ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload4CancelBtn;

    //upload icon5 momorandam of association

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_4")
    WebElement upload5Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload5Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload5ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload5Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload5DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload5ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload5CancelBtn;

    //upload icon6 artical association

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_5")
    WebElement upload6Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload6Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload6ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload6Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload6DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload6ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload6CancelBtn;

    //upload icon7 copy of regulatory license

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_6")
    WebElement upload7Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload7Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload7ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload7Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload7DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload7ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload7CancelBtn;

    //upload icon8 certification of incorporation parent share holding

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_7")
    WebElement upload8Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload8Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload8ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload8Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload8DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload8ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload8CancelBtn;

    //upload icon9 proof of sharing parent share holding

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_8")
    WebElement upload9Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload9Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload9ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload9Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload9DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload9ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload9CancelBtn;

    //upload icon10 businessPlan

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_9")
    WebElement upload10Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload10Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload10ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload10Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload10DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload10ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload10CancelBtn;


    //upload icon11 financial statement

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_10")
    WebElement upload11Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload11Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload11ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload11Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload11DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload11ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload11CancelBtn;


    //upload icon12 passport copy of senior management personal

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_11")
    WebElement upload12Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload12Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload12ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload12Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload12DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload12ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload12CancelBtn;


    //upload icon13 passport copy of POD

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_12")
    WebElement upload13Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload13Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload13ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload13Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload13DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload13ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload13CancelBtn;


    //upload icon14 passport copy of authorized signature

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_13")
    WebElement upload14Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload14Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload14ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload14Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload14DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload14ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload14CancelBtn;


    //upload icon15 certified copy of trust deed

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_14")
    WebElement upload15Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload15Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload15ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload15Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload15DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload15ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload15CancelBtn;



    //upload icon16 certification of inorporation trustee company

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_15")
    WebElement upload16Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload16Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload16ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload16Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload16DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload16ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload16CancelBtn;

    //upload icon17 settlor of trust

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_16")
    WebElement upload17Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload17Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload17ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload17Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload17DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload17ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload17CancelBtn;


    //upload icon18 list of all beneficiary

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_17")
    WebElement upload18Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload18Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload18ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload18Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload18DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload18ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload18CancelBtn;

    //upload icon19 passport copy of beneficiaty trust

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_18")
    WebElement upload19Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload19Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload19ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload19Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload19DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload19ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload19CancelBtn;



    //upload icon20 passport copy of controller of  trust

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_19")
    WebElement upload20Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload20Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload20ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload20Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload20DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload20ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload20CancelBtn;



    //upload icon21 fund structure document

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_20")
    WebElement upload21Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload21Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload21ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload21Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload21DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload21ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload21CancelBtn;


    //upload icon22 private fund information private placement momendum

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_21")
    WebElement upload22Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload22Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload22ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload22Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload22DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload22ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload22CancelBtn;

    //upload icon23 undertaking regarding of AML/CFT

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_22")
    WebElement upload23Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload23Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload23ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload23Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload23DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload23ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload23CancelBtn;


    //upload icon24 public fund prospect

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_23")
    WebElement upload24Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload24Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload24ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload24Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload24DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload24ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload24CancelBtn;


    //upload icon25 passportcopy of UBO -limited partner

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_24")
    WebElement upload25Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload25Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload25ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload25Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload25DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload25ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload25CancelBtn;



    //upload icon26 agreement fund manager and fund adminstartor

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_25")
    WebElement upload26Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload26Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload26ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload26Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload26DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload26ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload26CancelBtn;

    //upload icon27 passport copy of UBO

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_26")
    WebElement upload27Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload27Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload27ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload27Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload27DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload27ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload27CancelBtn;


    //upload icon28 screenshot of stock exchage and stock sharing

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_27")
    WebElement upload28Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload28Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload28ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload28Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload28DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload28ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload28CancelBtn;


    //upload icon29 harter bylaws

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_28")
    WebElement upload29Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload29Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload29ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload29Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload29DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload29ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload29CancelBtn;



    //upload icon30 SOE document

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_29")
    WebElement upload30Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload30Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload30ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload30Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload30DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload30ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload30CancelBtn;


    //upload icon31 certificate of incompany

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_30")
    WebElement upload31Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload31Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload31ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload31Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload31DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload31ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload31CancelBtn;

    //upload icon32 certificate of incorporation

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_31")
    WebElement upload32Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload32Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload32ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload32Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload32DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload32ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload32CancelBtn;

    //upload icon33 ownership chart

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_33")
    WebElement upload33Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload33Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload33ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload33Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload33DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload33ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload33CancelBtn;

    //upload icon34 proof of owenrship ultimate beneficial ownership

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_34")
    WebElement upload34Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload34Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload34ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload34Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload34DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload34ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload34CancelBtn;


    //upload icon35 maker checker passport

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_35")
    WebElement upload35Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload35Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload35ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload35Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload35DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload35ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload35CancelBtn;



    //upload icon36 other document

    @FindBy(id="appdtl__DocumentUpload__el_btn_1_36")
    WebElement upload36Icon;
    @FindBy(id="appdtl__DocumentUpload__SupportingDateOfDoc")
    WebElement upload36Date;
    @FindBy(id="appdtl__DocumentUpload__SupportingExpiryOfDoc")
    WebElement upload36ExpireDate;
    @FindBy(id="appdtl__DocumentUpload__SupportingRemark")
    WebElement upload36Remarks;
    @FindBy(xpath="//input[@id='appdtl__DocumentUpload__SupportingFileBrowser']")
    WebElement upload36DocsLink;
    @FindBy(id="appdtl__DocumentUpload__el_btn_16")
    WebElement upload36ConfirmBtn;
    @FindBy(id="appdtl__DocumentUpload__el_btn_17")
    WebElement upload36CancelBtn;


    //Application continue Btn


    @FindBy(id="crponb__BasePage__continueBtn_txtcnt")
    WebElement CrpContinueBtn;
    @FindBy(id="crponb__BasePage__cancelBtn_txtcnt")
    WebElement CrpCancelBtn;


    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public CorporateEntityDocumentPage(){
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
    public ManagementDocumentPage corpuserContinue() throws Exception {
        waitUtility.waitForSeconds(7);
        commonElements.click(CrpContinueBtn);
        Thread.sleep(10000);
        return new ManagementDocumentPage();
    }

    public void CertificateOfIncorpClickUpload1Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload1Icon,48);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload1Icon);
        waitUtility.waitTillElementVisible(driver,upload1Date,7);
        textBoxControls.setText(upload1Date,Date);
        textBoxControls.setText(upload1ExpireDate,ExpiryDate);
        textBoxControls.setText(upload1Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/download.jpeg";
        textBoxControls.setText(upload1DocsLink,path);
//        javaScriptControls.executeJavaScript("arguments[0].click();",upload1DocsLink);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload1ConfirmBtn);


    }


    public void ValidCommercialLicenseClickUpload2Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload2Icon,48);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload2Icon);
        waitUtility.waitTillElementVisible(driver,upload2Date,27);
        textBoxControls.setText(upload2Date,Date);
        textBoxControls.setText(upload2ExpireDate,ExpiryDate);
        textBoxControls.setText(upload2Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/Screenshot from 2021-09-01 16-28-45.png";

        try {
            textBoxControls.setText(upload2DocsLink, path);
            waitUtility.waitForSeconds(5);
            commonElements.click(upload2ConfirmBtn);
        }catch (Exception e)
        {
            javaScriptControls.executeJavaScript("arguments[0].click();",upload2ConfirmBtn);
        }


    }

    public void BoardResolutionUpload3Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload3Icon,15);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload3Icon);
        waitUtility.waitTillElementVisible(driver,upload3Date,17);
        textBoxControls.setText(upload3Date,Date);
        textBoxControls.setText(upload3ExpireDate,ExpiryDate);
        textBoxControls.setText(upload3Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload3DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload3ConfirmBtn);




    }

    public void ProofOfOpeartingAddressUpload4Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload4Icon,18);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload4Icon);
        waitUtility.waitTillElementVisible(driver,upload4Date,7);
        textBoxControls.setText(upload4Date,Date);
        textBoxControls.setText(upload4ExpireDate,ExpiryDate);
        textBoxControls.setText(upload4Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload4DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload4ConfirmBtn);


    }
    public void MemorarumAssociatioUpload5Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload5Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload5Icon);
        waitUtility.waitTillElementVisible(driver,upload5Date,7);
        textBoxControls.setText(upload5Date,Date);
        textBoxControls.setText(upload5ExpireDate,ExpiryDate);
        textBoxControls.setText(upload5Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload5DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload5ConfirmBtn);

    }

    public void ArticalAssociatioUpload6Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload6Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload6Icon);
        waitUtility.waitTillElementVisible(driver,upload6Date,7);
        textBoxControls.setText(upload6Date,Date);
        textBoxControls.setText(upload6ExpireDate,ExpiryDate);
        textBoxControls.setText(upload6Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload6DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload6ConfirmBtn);

    }



    public void CpoyOfRegulatoryUpload7Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload7Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload7Icon);
        waitUtility.waitTillElementVisible(driver,upload7Date,7);
        textBoxControls.setText(upload7Date,Date);
        textBoxControls.setText(upload7ExpireDate,ExpiryDate);
        textBoxControls.setText(upload7Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload7DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload7ConfirmBtn);

    }


    public void certificateIncorpShareholdUpload8Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload8Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload8Icon);
        waitUtility.waitTillElementVisible(driver,upload8Date,7);
        textBoxControls.setText(upload8Date,Date);
        textBoxControls.setText(upload8ExpireDate,ExpiryDate);
        textBoxControls.setText(upload8Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload8DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload8ConfirmBtn);

    }


    public void proofShareHoldingParentUpload9Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload9Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload9Icon);
        waitUtility.waitTillElementVisible(driver,upload9Date,7);
        textBoxControls.setText(upload9Date,Date);
        textBoxControls.setText(upload9ExpireDate,ExpiryDate);
        textBoxControls.setText(upload9Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload9DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload9ConfirmBtn);

    }

    public void businessPlanUpload10Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload10Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload10Icon);
        waitUtility.waitTillElementVisible(driver,upload10Date,7);
        textBoxControls.setText(upload10Date,Date);
        textBoxControls.setText(upload10ExpireDate,ExpiryDate);
        textBoxControls.setText(upload10Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload10DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload10ConfirmBtn);

    }
    public void financialStmntUpload11Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload11Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload11Icon);
        waitUtility.waitTillElementVisible(driver,upload11Date,7);
        textBoxControls.setText(upload11Date,Date);
        textBoxControls.setText(upload11ExpireDate,ExpiryDate);
        textBoxControls.setText(upload11Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload11DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload11ConfirmBtn);

    }

    public void passportCopySeniorMngrUpload12Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload12Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload12Icon);
        waitUtility.waitTillElementVisible(driver,upload12Date,7);
        textBoxControls.setText(upload12Date,Date);
        textBoxControls.setText(upload12ExpireDate,ExpiryDate);
        textBoxControls.setText(upload12Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload12DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload12ConfirmBtn);

    }

    public void passportCopyOfBODUpload13Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload13Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload13Icon);
        waitUtility.waitTillElementVisible(driver,upload13Date,7);
        textBoxControls.setText(upload13Date,Date);
        textBoxControls.setText(upload13ExpireDate,ExpiryDate);
        textBoxControls.setText(upload13Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload13DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload13ConfirmBtn);

    }

    public void passportcopyOfAuthorizedSignUpload14Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload14Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload14Icon);
        waitUtility.waitTillElementVisible(driver,upload14Date,7);
        textBoxControls.setText(upload14Date,Date);
        textBoxControls.setText(upload14ExpireDate,ExpiryDate);
        textBoxControls.setText(upload14Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload14DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload14ConfirmBtn);

    }

    public void certifiedTrustDeedUpload15Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload15Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload15Icon);
        waitUtility.waitTillElementVisible(driver,upload15Date,7);
        textBoxControls.setText(upload15Date,Date);
        textBoxControls.setText(upload15ExpireDate,ExpiryDate);
        textBoxControls.setText(upload15Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload15DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload15ConfirmBtn);

    }

    public void cerificationIncorporationTrusteeUpload16Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload16Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload16Icon);
        waitUtility.waitTillElementVisible(driver,upload16Date,7);
        textBoxControls.setText(upload16Date,Date);
        textBoxControls.setText(upload16ExpireDate,ExpiryDate);
        textBoxControls.setText(upload16Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload16DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload16ConfirmBtn);

    }

    public void seetiorTrustUpload17Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload17Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload17Icon);
        waitUtility.waitTillElementVisible(driver,upload17Date,7);
        textBoxControls.setText(upload17Date,Date);
        textBoxControls.setText(upload17ExpireDate,ExpiryDate);
        textBoxControls.setText(upload17Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload17DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload17ConfirmBtn);

    }

    public void ListAllBeneficiaryUpload18Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload18Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload18Icon);
        waitUtility.waitTillElementVisible(driver,upload18Date,7);
        textBoxControls.setText(upload18Date,Date);
        textBoxControls.setText(upload18ExpireDate,ExpiryDate);
        textBoxControls.setText(upload18Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload18DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload18ConfirmBtn);

    }
    public void passportCopyBeneficiartTrustUpload19Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload19Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload19Icon);
        waitUtility.waitTillElementVisible(driver,upload19Date,7);
        textBoxControls.setText(upload19Date,Date);
        textBoxControls.setText(upload19ExpireDate,ExpiryDate);
        textBoxControls.setText(upload19Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload19DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload19ConfirmBtn);

    }

    public void passportCopyControllernUpload20Icon(String Date,String ExpiryDate,String Remarks) throws Exception {
        waitUtility.waitTillElementVisible(driver,upload20Icon,28);
        javaScriptControls.executeJavaScript("arguments[0].click();",upload20Icon);
        waitUtility.waitTillElementVisible(driver,upload20Date,7);
        textBoxControls.setText(upload20Date,Date);
        textBoxControls.setText(upload20ExpireDate,ExpiryDate);
        textBoxControls.setText(upload20Remarks,Remarks);
        waitUtility.waitForSeconds(4);
        String path="/home/divyabharathi/2AutomationWOrkspace/onboard/src/main/java/com/iexceed/uiframework/PageObjects/CorporateOnboarding/DocumentMntMngMnt/Resource/jackie-chan-news-photo-83389121-1567001252.jpg";
        textBoxControls.setText(upload20DocsLink,path);
        waitUtility.waitForSeconds(5);
        commonElements.click(upload20ConfirmBtn);

    }
}
