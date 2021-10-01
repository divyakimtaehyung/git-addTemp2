package PageActions;

import PageObjects.desiredCapabilityPage;
import PageObjects.demoApp;
import com.iexceed.uiframework.core.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demoAppActions extends TestBase {

    public static void main (String args[]) throws Exception {

        desiredCapabilityPage desiredCapabilities=new desiredCapabilityPage();
        AndroidDriver<AndroidElement> driver=desiredCapabilities.Capability();
//        demoApp demoapp=new demoApp(driver);
//        demoapp.clickPreference();
//        demoapp.ClickView();
//        demoapp.TappingActions();
//          demoapp.swipe();
//        demoapp.scrolling();

    }

}
