package page;

import PageObject.BasePo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomePage extends BasePo {

    public HomePage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void navigateToLoginPage(){
        MobileElement loginButton = driver.findElementByAccessibilityId("Login");
        loginButton.click();
    }

    public void navigateToFormPage(){
        MobileElement formButton = driver.findElementByAccessibilityId("Forms");
        formButton.click();
    }
    public void navigateToDragPage(){
        MobileElement dragButton = driver.findElementByAccessibilityId("Drag");
        dragButton.click();
    }
    public void navigateToSwipePage(){
        MobileElement swipeButton = driver.findElementByAccessibilityId("Swipe");
        swipeButton.click();
    }


}

//    public void login(){
//        MobileElement loginButton = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView[1]"));
//        loginButton.click();
//        String pageSource = driver.getPageSource();
//        System.out.println(pageSource);
//
//    }
//    public void getCredential(){
//
////        MobileElement emailText = (MobileElement) driver.findElement(MobileBy.AccessibilityId("~input-email"));
////        emailText.sendKeys("jitaliptl07@gmail.com");
////        String pageSource = driver.getPageSource();
////        System.out.println(pageSource);
////
//        MobileElement passwordText = (MobileElement)  driver.findElementByAccessibilityId("~input-password");
//        passwordText.sendKeys("jitali@07");
//    }

