package PageActions;

import PageObjects.StoreAppDesiredCapabilities;
import PageObjects.StoreAppPageObects;
import com.iexceed.uiframework.core.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class StoreAppActions extends TestBase {
    public static void main (String args[]) throws Exception {

    StoreAppDesiredCapabilities storeAppDesiredCapabilities = new StoreAppDesiredCapabilities();
    AndroidDriver<AndroidElement> driver = storeAppDesiredCapabilities.Capability();

        StoreAppPageObects storeAppPageObects=new StoreAppPageObects(driver);
//        storeAppPageObects.HomePageDetails();
//        storeAppPageObects.validateToastMsg();
        storeAppPageObects.addindProductSumValidations();
}
}
