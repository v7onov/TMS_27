package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.EditAdPage;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.ProfilePage;
import testdata.GetLoginModel;

public class EditAdTest extends BaseTest {

    @Test
    public void editAdTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
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