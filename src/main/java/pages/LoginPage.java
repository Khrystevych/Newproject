package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    WebElement loginField = driver.findElement(By.xpath("//input[@id=\"login_field\"]"));
    WebElement passwordField = driver.findElement(By.xpath("//input[@id=\"password\"]"));
    WebElement signInButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public MainPage successfulLogin(String login, String password){
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        signInButton.click();
        return new MainPage(driver);
    }
}
