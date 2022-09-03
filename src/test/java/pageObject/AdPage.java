package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdPage extends BasePage {

    private By TITLE = By.id("title");
    private By DESCRIPTION = By.id("description");
    private By CATEGORY = By.id("category");
    private By PRICE = By.id("price");
    private By PICTURE = By.id("picture");
    private By LOCATION = By.id("location");
    private By CONTACTS = By.id("contacts");
    private By SEND_MESSAGE;
    private By MESSAGE_FIELD;
    private By SEND_BUTTON;
    private By POP_UP_MESSAGE_BAR;

    public AdPage(WebDriver driver) {
        super(driver);
    }

    public void sendMessage(String messageText){
        driver.findElement(SEND_MESSAGE).click();
        driver.findElement(MESSAGE_FIELD).sendKeys(messageText);
        driver.findElement(SEND_BUTTON).click();
    }

    public String getTitle(){
       return driver.findElement(TITLE).getText();
    }

    public String getNotificationText(){
        return driver.switchTo().alert().getText();
    }
}