package page;

import PageObject.BasePo;
import Utils.WaitUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage extends BasePo {
    WaitUtils waitUtils;

    public LoginPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void fillEmailEditText(){
        MobileElement emailTextFiels = driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input-email\"]");
        emailTextFiels.sendKeys("jitaliptl07@gmail.com");
    }

    public void fillPasswordEditText(){
        MobileElement passwordTextfiels = driver.findElementByAccessibilityId("input-password");
        passwordTextfiels.sendKeys("jitali@07");
    }

    public void clickToLoginButton(){
        MobileElement loginButton = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");
        loginButton.click();
        MobileElement popUpMessage = driver.findElementByClassName("android.widget.Button");
        popUpMessage.click();
    }
}
