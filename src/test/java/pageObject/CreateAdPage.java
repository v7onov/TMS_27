package pageObject;

import models.CreateAdModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAdPage extends BasePage {

    private By TITLE;
    private By DESCRIPTION;
    private By CATEGORY;
    private By PRICE;
    private By PICTURE;
    private By LOCATION;
    private By CONTACTS;
    private By SAVE_BUTTON;

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