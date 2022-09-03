package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.AdPage;
import pageObject.CataloguePage;
import pageObject.MainPage;

public class SearchBarTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(SearchBarTest.class.getName());

    @Test
    public void searchBarTest(){
        LOGGER.debug("'searchBarTest' test started");
        MainPage mainPage = new MainPage(driver);
        LOGGER.debug("Attempting to open main page");
        mainPage.openMainPage();
        LOGGER.debug("Moving to catalogue page");
        mainPage.moveToCatalogue();
        CataloguePage cataloguePage = new CataloguePage(driver);
        LOGGER.debug("Attempting to search an ad");
        cataloguePage.searchAndMoveToAd("Title");
        AdPage adPage = new AdPage(driver);
        LOGGER.debug("Checking that ad has been found correctly");
        Assert.assertEquals(adPage.getTitle(), "Title");
    }
}