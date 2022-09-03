package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.AdPage;
import pageObject.MainPage;

public class MessageTest extends BaseTest{

    private static final Logger LOGGER = LogManager.getLogger(MessageTest.class.getName());

    @Test(enabled = false)
    public void sendMessageFromAdPageTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.searchAndMoveToAd("title");
        AdPage adPage = new AdPage(driver);
        adPage.sendMessage("some message");
        Assert.assertEquals(adPage.getNotificationText(), "Сообщение отправлено");
    }
}