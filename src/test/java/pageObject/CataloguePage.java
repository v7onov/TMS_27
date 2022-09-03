package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CataloguePage extends BasePage {

    private By SEARCH_BAR = By.xpath("//input");
    private String SEARCH_RESULT = "//h2[contains(text(), '";
    private String POSTFIX = "')]";
    private By CLOSE_BUTTON = By.xpath("//button");
    private By MODAL = By.id("modal-photo");

    public CataloguePage(WebDriver driver) {
        super(driver);
    }

    public void searchAndMoveToAd(String title){
        driver.findElement(SEARCH_BAR).sendKeys(title);
        driver.findElement(By.xpath(SEARCH_RESULT + title + POSTFIX)).click();
    }
}
