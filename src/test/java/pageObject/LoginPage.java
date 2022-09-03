package pageObject;

import models.LoginModel;
import models.RegistrationModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By LOG_IN_BUTTON;
    private By REGISTRATION_BUTTON;
    private By USERNAME = By.xpath("//p[text()='User Name']/following-sibling::input");
    private By EMAIL = By.xpath("//p[text()='Email']/following-sibling::input");
    private By PASSWORD = By.xpath("//p[text()='Password']/following-sibling::input");
    private By FIRST_NAME = By.xpath("//p[text()='First Name']/following-sibling::input");
    private By LAST_NAME = By.xpath("//p[text()='Last Name']/following-sibling::input");
    private By PHONE_NUMBER = By.xpath("//p[text()='Phone Number']/following-sibling::input");
    private By CREATE_ACCOUNT_BUTTON;
    private By PERFORM_LOG_IN_BUTTON;
    private By REGISTRATION_CONFIRMATION;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton(){
        driver.findElement(LOG_IN_BUTTON).click();
    }

    public void clickRegistrationButton(){
        driver.findElement(REGISTRATION_BUTTON).click();
    }

    public void sendData(LoginModel loginModel){
        driver.findElement(EMAIL).sendKeys(loginModel.getEmail());
        driver.findElement(PASSWORD).sendKeys(loginModel.getPassword());
        driver.findElement(PERFORM_LOG_IN_BUTTON).click();
    }

    public void sendData(RegistrationModel registrationModel){
        driver.findElement(EMAIL).sendKeys(registrationModel.getEmail());
        driver.findElement(USERNAME).sendKeys(registrationModel.getUsername());
        driver.findElement(PASSWORD).sendKeys(registrationModel.getPassword());
        driver.findElement(FIRST_NAME).sendKeys(registrationModel.getFirstName());
        driver.findElement(LAST_NAME).sendKeys(registrationModel.getLastName());
        driver.findElement(PHONE_NUMBER).sendKeys(registrationModel.getPhoneNumber());
        driver.findElement(CREATE_ACCOUNT_BUTTON).click();
    }

    public String getRegistrationMessage(){
        return driver.findElement(REGISTRATION_CONFIRMATION).getText();
    }
}