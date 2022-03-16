package Testcase;

import Utils.propertyUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public  class BaseTest {

    protected static AndroidDriver<AndroidElement> driver;
    public static String APPIUM_SERVER_URL = propertyUtils.getProperty("appium.server.Url");

    public BaseTest(AndroidDriver driver) {
    }
    @BeforeMethod
    public static void setUpAppium() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        setCapability(desiredCapabilities);
        driver = new AndroidDriver(new URL(APPIUM_SERVER_URL),desiredCapabilities);
    }

    public static void setCapability(DesiredCapabilities desiredCapabilities){
        String PLATFORM_NAME = propertyUtils.getProperty("android.Platform");
        String PLATFORM_VERSION = propertyUtils.getProperty("android.Platform.Version");
        String DEVICE_NAME = propertyUtils.getProperty("android.Devicename");
        String APP_LOCATION = propertyUtils.getProperty("android.app.path");
        String AUTOMATION_NAME = propertyUtils.getProperty("android.Automationname");
        String APP_PACKAGE = propertyUtils.getProperty("com.wdiodemoapp");
        String APP_ACTIVITY = propertyUtils.getProperty("appActivity");

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,PLATFORM_VERSION);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,PLATFORM_NAME);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,DEVICE_NAME);
        desiredCapabilities.setCapability(MobileCapabilityType.APP,APP_LOCATION);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,AUTOMATION_NAME);
        desiredCapabilities.setCapability("appPackage",APP_PACKAGE);
        desiredCapabilities.setCapability("appActivity",APP_ACTIVITY);
    }
}
