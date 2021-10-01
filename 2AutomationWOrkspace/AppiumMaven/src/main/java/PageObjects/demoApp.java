package PageObjects;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.implementations.*;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class demoApp extends TestBase {

    public AndroidDriver<AndroidElement> driver;

    private CommonElements commonElements;
    private CommonDriver commonDriver;
    private TextBoxControls textBoxControls;
    private WaitUtility waitUtility;
    private WindowHandling windowHandling;
    private ScreenshotControl screenshotControl;
    private JavaScriptControls javaScriptControls;


    public demoApp(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
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

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Preference']")
    AndroidElement Preference;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='3. Preference dependencies']")
    AndroidElement PreferenceDpendency;
    @AndroidFindBy(id = "android:id/checkbox")
    AndroidElement checkBox;
    @AndroidFindBy(xpath = "(//android.widget.RelativeLayout)[2]")
    AndroidElement wifiSetting;
    @AndroidFindBy(id= "android:id/edit")
    AndroidElement wifiSettingTxt;
    @AndroidFindBy(id = "android:id/button1")
    AndroidElement wifiSettingOkBtn;



    public void clickPreference() throws Exception {

         commonElements.click(Preference);
         waitUtility.waitForSeconds(2);
         commonElements.click(PreferenceDpendency);
         commonElements.click(checkBox);
         commonElements.click(wifiSetting);
         textBoxControls.setText(wifiSettingTxt,"kim taehyung");
         commonElements.click(wifiSettingOkBtn);

        }



    @AndroidFindBy(uiAutomator = "text(\"Views\")")
    public AndroidElement ViewElem;
    @AndroidFindBy(uiAutomator = "new UiSelector().clickable(true)")
    List< AndroidElement> ClickableElem;

    public void ClickView() throws Exception {

        commonElements.click(ViewElem);
        System.out.println(ClickableElem.size());

    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Expandable Lists']")
    public AndroidElement ExpandList;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='1. Custom Adapter']")
    public AndroidElement CustomerAdapter;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='People Names']")
    public AndroidElement PeopleName;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sample menu']")
    public AndroidElement SampleMenu;

    public void TappingActions() throws Exception {
          TouchAction t=new TouchAction(driver);
         commonElements.click(ViewElem);
         t.tap(tapOptions().withElement(element(ExpandList))).perform();
         waitUtility.waitForSeconds(2);
         commonElements.click(CustomerAdapter);
        t.longPress(longPressOptions().withElement(element(PeopleName)).withDuration(ofSeconds(3))).release().perform();
        waitUtility.waitForSeconds(2);
        System.out.println(SampleMenu.isDisplayed());
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Widgets']")
    public AndroidElement DateWiget;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='2. Inline']")
    public AndroidElement inline;
    @AndroidFindBy(xpath = "//*[@content-desc='6']")
    public AndroidElement SixClk;
    @AndroidFindBy(xpath = "//*[@content-desc='20']")
    public AndroidElement TwntyM;
    @AndroidFindBy(xpath = "//*[@content-desc='45']")
    public AndroidElement FourtyFiveM;

    public void swipe() throws Exception {

        commonElements.click(ViewElem);
        commonElements.click(DateWiget);
        TouchAction t=new TouchAction(driver);
        t.tap(tapOptions().withElement(element(inline))).perform();
        Thread.sleep(2000);
        commonElements.click(SixClk);
        //long press,on element atleast 2 min  ,move to another element any you release
        t.longPress(longPressOptions().withElement(element(TwntyM)).withDuration(ofSeconds(2))).moveTo(element(FourtyFiveM)).release().perform();



    }

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView3\"))")
    public AndroidElement ScrollElem;
    public void scrolling() throws Exception {

        waitUtility.waitTillElementVisible(driver,ViewElem,3);
        commonElements.click(ViewElem);
        System.out.println(ScrollElem.isDisplayed());
        driver.navigate().back();
    }

}
