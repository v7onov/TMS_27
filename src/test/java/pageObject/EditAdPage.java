package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAdPage extends BasePage {

    private By TITLE;
    private By DESCRIPTION;
    private By CATEGORY;
    private By PRICE;
    private By PICTURE;
    private By LOCATION;
    private By CONTACTS;
    private By SAVE_BUTTON;

    public EditAdPage(WebDriver driver) {
        super(driver);
    }

    public void editPrice(String price){
        driver.findElement(PRICE).clear();
        driver.findElement(PRICE).sendKeys(price);
    }

    public void saveChanges(){
        driver.findElement(SAVE_BUTTON).click();
    }
}