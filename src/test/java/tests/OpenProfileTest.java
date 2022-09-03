package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.MainPage;

public class OpenProfileTest extends BaseTest {

    @Test
    public void openProfilePage(){

        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.moveToProfile();
        Assert.assertEquals(driver.getCurrentUrl(), "http://ec2-18-185-127-15.eu-central-1.compute.amazonaws.com:3000/profile", "lol, kek, error");
    }
}
