import Pages.BasePage;
import Pages.DownloadFileDemoPage;
import Pages.LambdaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LambdaTestCases extends BasePage {
    private LambdaPage lambdaPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        lambdaPage = new LambdaPage(driver);

    }
    @Test
    public void ClickOnLearnMore(){
        lambdaPage.ClickOnLearnMoreButton();
        WebElement Video = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/div/div/div[1]/div[1]/div[2]/div/div[1]/span"));
        Assert.assertEquals(Video.isDisplayed(), true);
    }}