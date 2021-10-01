package PageObjects;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.List;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class StoreAppPageObects extends TestBase {

    public AndroidDriver<AndroidElement> driver;


    //homepage objects
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter name here']")
    AndroidElement UserName;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Female']")
    AndroidElement FemaleRadioBtn;
    @AndroidFindBy(id = "android:id/text1")
    AndroidElement CountryDD;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Benin\"))")
    AndroidElement BeninCountry;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Benin']")
    AndroidElement BeninCountrySelect;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    AndroidElement LetsShopBtn;
    @AndroidFindBy(xpath = "//android.widget.Toast[1]")
    AndroidElement ToastMsg;

    //product selection page
    @AndroidFindBy(xpath = "//*[@text='ADD TO CART']")
    List<AndroidElement> addtoCart;

    //Productpage objacts
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()" + ".resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView("
            + "new UiSelector().text(\"Air Jordan 9 Retro\"));")
    AndroidElement ProductListitem;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/rvProductList")
    List< AndroidElement> ProductList;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/productName")
    List<AndroidElement> ProductName;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/productAddCart")
    List<AndroidElement> AddToCart;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    AndroidElement AddToCartProceedBtn;
    @AndroidFindBy(xpath ="//android.widget.TextView[text='Air Jordan 9 Retro']")
    AndroidElement SampleProductName;

    //productprize validation page
    @AndroidFindBy(id ="com.androidsample.generalstore:id/productPrice")
    List<AndroidElement> Productprice;
    @AndroidFindBy(id ="com.androidsample.generalstore:id/totalAmountLbl")
    AndroidElement TotalPrice;

    //mpbile guester

    @AndroidFindBy(className ="android.widget.CheckBox")
    AndroidElement CheckBox;
    @AndroidFindBy(xpath ="//*[@text='Please read our terms of conditions']")
    AndroidElement termsConditions;
    @AndroidFindBy(id ="android:id/button1")
    AndroidElement PopupBtnCLose;
    @AndroidFindBy(id ="com.androidsample.generalstore:id/btnProceed")
    AndroidElement ProceedBtn;



    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public StoreAppPageObects(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        commonElements = new CommonElements();
        commonDriver = new CommonDriver(driver);
        textBoxControls= new TextBoxControls();
        waitUtility= new WaitUtility();
        windowHandling = new WindowHandling(driver);
        screenshotControl = new ScreenshotControl(driver);
        javaScriptControls = new JavaScriptControls(driver);


    }



    public void HomePageDetails() throws Exception {

        waitUtility.waitTillElementVisible(driver,UserName,3);
            commonElements.click(UserName);
            textBoxControls.setText(UserName, "kim taehyung");
            driver.hideKeyboard();
            commonElements.click(FemaleRadioBtn);
            commonElements.click(CountryDD);
            commonElements.isElementVisible(BeninCountry);
            commonElements.click(BeninCountrySelect);
            commonElements.click(LetsShopBtn);
            waitUtility.waitForSeconds(3);
            scrollProductList();


    }




    public void scrollProductList() throws Exception {
        System.out.println(ProductListitem.isDisplayed());
        waitUtility.waitForSeconds(3);
        int count=ProductList.size();

        for(int i=0;i<count;i++){

            String prodName=ProductName.get(i).getText();
            if(prodName.equalsIgnoreCase("Air Jordan 9 Retro"))
            {
                AddToCart.get(i).click();
                break;

            }

        }
        commonElements.click(AddToCartProceedBtn);
        String lastpageText=SampleProductName.getText();
        waitUtility.waitForSeconds(2);
        Assert.assertEquals("Air Jordan 9 Retro", SampleProductName.getText());

    }



    //adding product validation

    public  void addindProductSumValidations() throws Exception {

        waitUtility.waitTillElementVisible(driver,UserName,3);
        commonElements.click(UserName);
        textBoxControls.setText(UserName, "kim taehyung");
        driver.hideKeyboard();
        commonElements.click(FemaleRadioBtn);
        commonElements.click(CountryDD);
        commonElements.isElementVisible(BeninCountry);
        commonElements.click(BeninCountrySelect);
        commonElements.click(LetsShopBtn);
        waitUtility.waitForSeconds(3);
        addtoCart.get(0).click();
        //text changed to added to card so we again make it as added to card
        addtoCart.get(0).click();
        commonElements.click(AddToCartProceedBtn);
        Thread.sleep(3000);
        String amount1= Productprice.get(0).getText();
        amount1=amount1.substring(1);
        double a1=Double.parseDouble(amount1);

        String amount2=Productprice.get(1).getText();
        amount2=amount2.substring(1);
        double a2=Double.parseDouble(amount2);
        Double sum=a1+a2;
        System.out.println("sum of produts:"+sum);
        String total=TotalPrice.getText();
        total=total.substring(1);
        double totalAmount=Double.parseDouble(total);
        System.out.print("total amount displayed: "+totalAmount);
        Assert.assertEquals(sum,totalAmount);


        //Mobile Gestures

        TouchAction t=new TouchAction(driver);
        commonElements.click(CheckBox);
         t.longPress(longPressOptions().withElement(element(termsConditions)).withDuration(ofSeconds(2))).release().perform();
       Thread.sleep(2);
        commonElements.click(PopupBtnCLose);
//
       commonElements.click(ProceedBtn);



    }




    //validate toast message
    public void validateToastMsg() throws Exception {

        waitUtility.waitTillElementVisible(driver,FemaleRadioBtn,5);
         commonElements.click(FemaleRadioBtn);
        commonElements.click(CountryDD);
        commonElements.isElementVisible(BeninCountry);
        waitUtility.waitForSeconds(2);
        commonElements.click(BeninCountrySelect);
        commonElements.click(LetsShopBtn);
//        String Msg=ToastMsg.getAttribute("name");
//            System.out.println(Msg);
        System.out.println(ToastMsg.getText());
 }



}
