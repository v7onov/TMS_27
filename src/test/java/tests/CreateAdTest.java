package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.CreateAdPage;
import testdata.GetCreateAdModel;
import testdata.GetLoginModel;

public class CreateAdTest extends BaseTest {

    @Test
    public void createPotatoAdTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.clickSignInButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
        loginPage.sendData(GetLoginModel.getLoginModelWithAllFields());
        mainPage.openMainPage();
        mainPage.clickCreateAdButton();
        CreateAdPage createAdPage = new CreateAdPage(driver);
        createAdPage.sendData(GetCreateAdModel.getCreateAdModelWithAllFields());
        createAdPage.clickSaveButton();
        Assert.assertEquals(mainPage.getNotificationText(), "Объявление создано");
    }
}