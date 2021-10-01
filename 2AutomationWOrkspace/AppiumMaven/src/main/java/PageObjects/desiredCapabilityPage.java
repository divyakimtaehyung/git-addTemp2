package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
public class desiredCapabilityPage {

    public static AndroidDriver<AndroidElement> Capability() throws MalformedURLException {

        File f=new File("src/test/java/resources");
        File fs=new File(f,"app-releaseJune29.apk");

        DesiredCapabilities cap=new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "divya");
        cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        return driver;

    }
}
