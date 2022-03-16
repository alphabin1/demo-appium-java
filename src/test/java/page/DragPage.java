package page;

import PageObject.BasePo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;

import java.time.Duration;

public class DragPage extends BasePo {
    public DragPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void dragAndDrop(){
        MobileElement elementr11 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drag-l1\"]/android.widget.ImageView");
        MobileElement elementr12 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drag-c1\"]/android.widget.ImageView");
        MobileElement elementr13 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drag-r1\"]/android.widget.ImageView");
        MobileElement elementr21 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drag-l2\"]/android.widget.ImageView");
        MobileElement elementr22 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drag-c2\"]/android.widget.ImageView");
        MobileElement elementr23 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drag-r2\"]/android.widget.ImageView");
        MobileElement elementr31 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drag-l3\"]/android.widget.ImageView");
        MobileElement elementr32 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drop-c3\"]/android.view.ViewGroup");
        MobileElement elementr33 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drag-r3\"]/android.widget.ImageView");

        MobileElement squre1 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drop-l1\"]/android.view.ViewGroup");
        MobileElement squre2 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drop-c1\"]/android.view.ViewGroup");
        MobileElement squre3 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drop-r1\"]/android.view.ViewGroup");
        MobileElement squre4 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drop-l2\"]/android.view.ViewGroup");
        MobileElement squre5 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drop-c2\"]/android.view.ViewGroup");
        MobileElement squre6 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drop-r2\"]/android.view.ViewGroup");
        MobileElement squre7 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drop-l3\"]/android.view.ViewGroup");
        MobileElement squre8 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drop-c3\"]/android.view.ViewGroup");
        MobileElement squre9 = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"drop-r3\"]/android.view.ViewGroup");

        Point drag1x = elementr11.getLocation();
        Point drop1x = squre1.getLocation();
        Point drag2x = elementr12.getLocation();
        Point drop2x = squre2.getLocation();
        Point drag3x = elementr13.getLocation();
        Point drop3x = squre3.getLocation();
        Point drag4x = elementr21.getLocation();
        Point drop4x = squre4.getLocation();
        Point drag5x = elementr22.getLocation();
        Point drop5x = squre5.getLocation();
        Point drag6x = elementr23.getLocation();
        Point drop6x = squre6.getLocation();
        Point drag7x = elementr31.getLocation();
        Point drop7x = squre7.getLocation();
        Point drag8x = elementr32.getLocation();
        Point drop8x = squre8.getLocation();
        Point drag9x = elementr33.getLocation();
        Point drop9x = squre9.getLocation();

        dragsAndDropFunction(drag1x,drop1x);
        dragsAndDropFunction(drag2x,drop2x);
        dragsAndDropFunction(drag3x,drop3x);
        dragsAndDropFunction(drag4x,drop4x);
        dragsAndDropFunction(drag5x,drop5x);
        dragsAndDropFunction(drag6x,drop6x);
        dragsAndDropFunction(drag7x,drop7x);
        dragsAndDropFunction(drag8x,drop8x);
        dragsAndDropFunction(drag9x,drop9x);
    }
    public void dragsAndDropFunction(Point Drag, Point Drop){
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(Drag))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(Drop)).release().perform();
    }
}
