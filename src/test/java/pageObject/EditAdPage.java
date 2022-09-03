package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAdPage extends BasePage {

    private By TITLE = By.xpath("//p[text()='Title']/following-sibling::input");
    private By DESCRIPTION = By.xpath("//p[text()='Description']/following-sibling::input");
    private By CATEGORY = By.xpath("//p[text()='Category']/following-sibling::input");
    private By PRICE = By.xpath("//p[text()='Price']/following-sibling::input");
    private By PICTURE = By.xpath("//p[text()='Picture']/following-sibling::input");
    private By LOCATION = By.xpath("//p[text()='Location']/following-sibling::input");
    private By CONTACTS = By.xpath("//p[text()='Contacts']/following-sibling::input");
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