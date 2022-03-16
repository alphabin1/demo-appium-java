package Testcase;

import page.*;
import org.junit.jupiter.api.Test;
import java.net.MalformedURLException;
import static Testcase.BaseTest.driver;

public class TestCases {
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    FormPage formPage = new FormPage(driver);
    SwipePage swipePage = new SwipePage(driver);
    DragPage dragPage = new DragPage(driver);

   // @Test
    public void loginTest() throws MalformedURLException {
        BaseTest.setUpAppium();
        homePage.navigateToLoginPage();
        loginPage.fillEmailEditText();
        loginPage.fillPasswordEditText();
        loginPage.clickToLoginButton();
    }

    @Test
    public void formTest() throws MalformedURLException {
        BaseTest.setUpAppium();
        homePage.navigateToFormPage();
        formPage.fillInputField();
    }

 //   @Test
    public void swipeHorizantal() throws MalformedURLException {
        BaseTest.setUpAppium();
        homePage.navigateToSwipePage();
        swipePage.swipeHorizantal();
    }

 //  @Test
    public void dragAndDrops() throws MalformedURLException {
        BaseTest.setUpAppium();
        homePage.navigateToDragPage();
        dragPage.dragAndDrop();
    }

}

