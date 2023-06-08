import Pages.BasePage;
import Pages.LoginButtonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestCase extends BasePage {
    private LoginButtonPage loginButtonPage;


    @BeforeMethod
    public void setUp() {
        super.setUp();
         loginButtonPage = new LoginButtonPage(driver);

    }


    @Test
    public void clickLogin() throws InterruptedException {
        loginButtonPage.Error();
       WebElement Error1= driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]"));
        Assert.assertEquals(Error1.isDisplayed(),"Please enter a correct username and password. Note that the password is case-sensitive");


    }}
      