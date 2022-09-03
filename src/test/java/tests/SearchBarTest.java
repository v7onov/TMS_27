package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.AdPage;
import pageObject.CataloguePage;
import pageObject.MainPage;

public class SearchBarTest extends BaseTest {

    @Test
    public void searchBarTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.moveToCatalogue();
        CataloguePage cataloguePage = new CataloguePage(driver);
        cataloguePage.searchAndMoveToAd("Title");
        AdPage adPage = new AdPage(driver);
        Assert.assertEquals(adPage.getTitle(), "Title");
    }
}