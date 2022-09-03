package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage {

    private String EXACT_AD = "//*[contains(text(), '";
    private String POSTFIX = "')]";

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public void openExactAd(String title){
        driver.findElement(By.xpath(EXACT_AD + title + POSTFIX));
    }

    public String getNotificationText(){
        return driver.switchTo().alert().getText();
    }
}