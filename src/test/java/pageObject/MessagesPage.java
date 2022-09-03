package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MessagesPage extends BasePage {

    private By SEND_BUTTON;
    private By MESSAGE_FIELD;


    public MessagesPage(WebDriver driver) {
        super(driver);
    }
}
