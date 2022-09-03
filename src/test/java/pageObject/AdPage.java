package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdPage extends BasePage {

    private By TITLE;
    private By DESCRIPTION;
    private By CATEGORY;
    private By PRICE;
    private By PICTURE;
    private By LOCATION;
    private By CONTACTS;
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