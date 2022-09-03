package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.EditAdPage;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.ProfilePage;
import testdata.GetLoginModel;

public class EditAdTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(EditAdTest.class.getName());

    @Test
    public void editAdTest(){
        LOGGER.debug("'editAdTest' test started");
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        LOGGER.debug("Logging in");
        mainPage.clickSignInButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
        loginPage.sendData(GetLoginModel.getLoginModelWithAllFields());
        mainPage.openMainPage();
        mainPage.moveToProfile();
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.openExactAd("TestTitle");
        EditAdPage editAdPage = new EditAdPage(driver);
        editAdPage.editPrice("400");
        Assert.assertEquals(profilePage.getNotificationText(), "Объявление изменено");
    }
}