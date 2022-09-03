package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import testdata.GetRegistrationModel;

public class RegistrationTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(RegistrationTest.class.getName());

    @Test
    public void registrationTest() {
        LOGGER.debug("'registrationTest' test started");
        MainPage mainPage = new MainPage(driver);
        LOGGER.debug("Attempting to open main page");
        mainPage.openMainPage();
        mainPage.clickSignInButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickRegistrationButton();
        LOGGER.debug("Filling all fields and trying to register a new user");
        loginPage.sendData(GetRegistrationModel.getRegistrationModelWithAllFields());
        Assert.assertEquals(loginPage.getNotificationText(), "Вы прошли регистрацию");
    }
}