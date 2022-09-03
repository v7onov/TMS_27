package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.MainPage;

import static staticdata.WebUrls.*;

public class OpenProfileTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(OpenProfileTest.class.getName());

    @Test
    public void openProfilePage(){
        LOGGER.debug("'openProfilePage' test started");
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        LOGGER.debug("Attempting to navigate to Profile Page from Main Page");
        mainPage.moveToProfile();
        Assert.assertEquals(driver.getCurrentUrl(), PROFILE_PAGE, "lol, kek, error");
    }
}
