package pageObject;

import models.CreateAdModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAdPage extends BasePage {

    private By TITLE = By.xpath("//p[text()='Title']/following-sibling::input");
    private By DESCRIPTION = By.xpath("//p[text()='Description']/following-sibling::input");
    private By CATEGORY = By.xpath("//select");
    private By PRICE = By.xpath("//p[text()='Price']/following-sibling::input");
    private By PICTURE = By.xpath("//p[text()='Picture']/following-sibling::input");
    private By SAVE_BUTTON = By.xpath("//a[contains(text(), 'Добавить продукт']");

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
        driver.findElement(PICTURE).sendKeys(createAdModel.getPicture());
    }
}