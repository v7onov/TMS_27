package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CataloguePage extends BasePage {

    private By SEARCH_BAR = By.xpath("//input");
    private By SEARCH_RESULT;


    public CataloguePage(WebDriver driver) {
        super(driver);
    }

    public void searchAndMoveToAd(String title){
        driver.findElement(SEARCH_BAR).sendKeys(title);
        driver.findElement(SEARCH_RESULT).click();
    }
}
