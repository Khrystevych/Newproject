import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HopePage;
import pages.IssuesPage;
import pages.LoginPage;
import pages.MainPage;

public class FirstTest extends BaseTest{

@Test
public void someChecks (){
    HopePage hopePage = new HopePage(driver);
    hopePage.goToLoginPage();
    LoginPage loginPage = new LoginPage(driver);
    loginPage.successfulLogin("Khrystevych", "VladKH999");
    MainPage mainPage = new MainPage(driver);
    mainPage.goToIssuesPage();

    IssuesPage issuesPage = new IssuesPage(driver);
    issuesPage.checkText();
    String expectedResult = "No results matched your search.";
    String actualResult = new String(issuesPage.result);
    Assertions.assertTrue(actualResult.equals(expectedResult));

}
}