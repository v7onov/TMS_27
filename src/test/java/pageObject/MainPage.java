package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static staticdata.WebUrls.*;

public class MainPage extends BasePage {

    private By USER_BUTTON = By.xpath("//a[@href='/profile']");
    private By SIGN_IN_BUTTON = By.xpath("//a[@href='/profile']");
    private By SEARCH_BAR;
    private By SEARCH_BUTTON;
    private By EGGS_CATEGORY;
    private By MILK_CATEGORY;
    private By MEAT_CATEGORY;
    private By VEGETABLES_CATEGORY;
    private By HONEY_CATEGORY;
    private By CREATE_AD_BUTTON;
    private By POP_UP_MESSAGE_BAR;
    private By SEARCH_RESULT;
    private By CATALOGUE_BUTTON = By.xpath("//a[@href='/catalog']");


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage(){
        driver.get(MAIN_PAGE);
    }

    public void clickSignInButton(){
        driver.findElement(SIGN_IN_BUTTON).click();
    }

    public boolean getLoginStatus(){
       return  driver.findElement(CREATE_AD_BUTTON).isDisplayed();
    }
    public void clickCreateAdButton(){
        driver.findElement(CREATE_AD_BUTTON).click();
    }

    public void moveToProfile(){
        driver.findElement(USER_BUTTON).click();
    }

    public void moveToCatalogue(){
        driver.findElement(USER_BUTTON).click();
    }

    public String getNotificationText(){
        return driver.switchTo().alert().getText();
    }

    public void searchAndMoveToAd(String title){
        driver.findElement(SEARCH_BAR).sendKeys(title);
        driver.findElement(SEARCH_RESULT).click();
    }
}