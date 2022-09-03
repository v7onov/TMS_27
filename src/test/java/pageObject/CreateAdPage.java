package pageObject;

import models.CreateAdModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAdPage extends BasePage {

    private By TITLE = By.id("name");
    private By DESCRIPTION = By.id("description");
    private By CATEGORY = By.xpath("//select");
    private By PRICE = By.id("price");
    private By PICTURE = By.id("picture");
    private By SAVE_BUTTON = By.id("save");

    public CreateAdPage(WebDriver driver) {
        super(driver);
    }

    public void clickSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
    }


    public void sendData(CreateAdModel createAdModel){
        Select select = new Select(driver.findElement(CATEGORY));
        select.selectByVisibleText(createAdModel.getCategory());
        driver.findElement(TITLE).sendKeys(createAdModel.getTitle());
        driver.findElement(DESCRIPTION).sendKeys(createAdModel.getDescription());
        driver.findElement(PRICE).sendKeys(createAdModel.getPrice());
//        driver.findElement(PICTURE).sendKeys(createAdModel.getPicture());
    }
}