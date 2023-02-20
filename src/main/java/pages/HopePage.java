package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HopePage extends BasePage{
    WebElement signInButton = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
    public HopePage(WebDriver driver) {
        super(driver);
    }
    public LoginPage goToLoginPage (){
        signInButton.click();
        return new LoginPage(driver);
    }
}
