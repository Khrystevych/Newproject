package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{
    WebElement issuesButton = driver.findElement(By.xpath("//a[contains(text(),'Issues')]"));
    public MainPage(WebDriver driver) {
        super(driver);
    }
    public IssuesPage goToIssuesPage (){
        issuesButton.click();
        return new IssuesPage(driver);
    }
}