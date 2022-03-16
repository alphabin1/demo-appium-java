package PageObject;

import Testcase.BaseTest;
import Utils.WaitUtils;
import Utils.propertyUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public abstract class BasePo extends BaseTest {

    private  final static int  Implicit_Wait =propertyUtils.getIntegerProperty("implicitWait",50);
    WaitUtils waitUtils;

    public BasePo(AndroidDriver driver) {
        super(driver);
    }

    public void BasePo(AndroidDriver driver){
        this.driver =driver;
        initElements();
        loadProperties();
        driver.manage().timeouts().implicitlyWait(Implicit_Wait, TimeUnit.SECONDS);
    }

    public void initElements(){
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(Implicit_Wait)),this);
    }
    public void loadProperties(){
    }

    protected void waitForVisibilityOf(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    protected boolean isElementPresent(MobileElement element, int timeout){
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
