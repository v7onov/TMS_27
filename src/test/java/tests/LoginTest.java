package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import testdata.GetLoginModel;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){

        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.clickSignInButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
        loginPage.sendData(GetLoginModel.getLoginModelWithAllFields());
        Assert.assertTrue(mainPage.getLoginStatus());
        }
}