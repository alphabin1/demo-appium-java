package page;

import PageObject.BasePo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;


public class SwipePage extends BasePo {
    public SwipePage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void swipeHorizantal() {
        MobileElement swipeButton = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Swipe\"]/android.widget.TextView[1]\n");
        swipeButton.click();

        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        System.out.println("size is:" + size);
        int w = size.width;
        int h = size.height;
        int m = w / 2;
        int startX = (int) (m);
        int endX = (int) (m - (m / 2));
        int y = (int) (h * 0.7);
        for (int i = 0; i < 5; i++){
            action.press(PointOption.point(startX, y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(endX, y)).release().perform();
        }
//        action.press(PointOption.point(m,y))
//                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
////                .moveTo(PointOption.point(m,(h-y)));
//        MobileElement card = driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"card\"])[1]\n");
//        System.out.println("Card Location :"+ card.getLocation());
    }


}
