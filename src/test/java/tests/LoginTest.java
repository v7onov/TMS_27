package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import testdata.GetLoginModel;

public class LoginTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(LoginTest.class.getName());

    @Test
    public void loginTest(){
        LOGGER.debug("'loginTest' test started");
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.clickSignInButton();
        LOGGER.debug("Logging in");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
        LOGGER.debug("Sending login and password to fields");
        loginPage.sendData(GetLoginModel.getLoginModelWithAllFields());
        Assert.assertTrue(mainPage.getLoginStatus());
        }
}