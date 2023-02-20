package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesPage extends BasePage {
    public String result;
    WebElement text = driver.findElement(By.xpath("//h3[contains(text(),'No results matched your search.')]"));
    public IssuesPage(WebDriver driver) {
        super(driver);

    }
    public IssuesPage checkText(){
        result = text.getText();
        return new IssuesPage(driver);
    }
}



