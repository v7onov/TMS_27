package pageObject;

import models.CreateAdModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAdPage extends BasePage {

    private By TITLE = By.xpath("//p[text()='Title']/following-sibling::input");
    private By DESCRIPTION = By.xpath("//p[text()='Description']/following-sibling::input");
    private By CATEGORY = By.xpath("//p[text()='Category']/following-sibling::input");
    private By PRICE = By.xpath("//p[text()='Price']/following-sibling::input");
    private By PICTURE = By.xpath("//p[text()='Picture']/following-sibling::input");
    private By LOCATION = By.xpath("//p[text()='Location']/following-sibling::input");
    private By CONTACTS = By.xpath("//p[text()='Contacts']/following-sibling::input");
    private By SAVE_BUTTON = By.xpath("//button[contains(text(), 'Добавить товар']");

    public CreateAdPage(WebDriver driver) {
        super(driver);
    }

    public void clickSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
    }


    public void sendData(CreateAdModel createAdModel){
        driver.findElement(TITLE).sendKeys(createAdModel.getTitle());
        driver.findElement(DESCRIPTION).sendKeys(createAdModel.getDescription());
        driver.findElement(CATEGORY).sendKeys(createAdModel.getCategory());
        driver.findElement(PRICE).sendKeys(createAdModel.getPrice());
        driver.findElement(PICTURE).sendKeys(createAdModel.getPicture());
        driver.findElement(LOCATION).sendKeys(createAdModel.getLocation());
        driver.findElement(CONTACTS).sendKeys(createAdModel.getContacts());
    }
}