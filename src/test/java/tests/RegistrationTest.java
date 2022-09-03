package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import testdata.GetRegistrationModel;

public class RegistrationTest extends BaseTest {

    @Test
    public void registrationTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.clickSignInButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickRegistrationButton();
        loginPage.sendData(GetRegistrationModel.getRegistrationModelWithAllFields());
        Assert.assertEquals(loginPage.getRegistrationMessage(), "Вы прошли регистрацию");
    }
}