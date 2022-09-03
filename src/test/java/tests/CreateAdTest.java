package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.CreateAdPage;
import testdata.GetCreateAdModel;
import testdata.GetLoginModel;


public class CreateAdTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(CreateAdTest.class.getName());

    @Test
    public void createPotatoAdTest(){
        LOGGER.debug("'createPotatoAdTest' test started");
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        LOGGER.debug("Logging in");
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