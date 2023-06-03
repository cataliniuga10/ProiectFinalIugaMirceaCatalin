import Pages.BasePage;
import Pages.DownloadFileDemoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 public class DownloadFileDemoTestCases extends BasePage{
    private DownloadFileDemoPage downloadFileDemoPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        downloadFileDemoPage = new DownloadFileDemoPage(driver);

    }
    @Test
    public void download(){
        downloadFileDemoPage.WebElementDownloadDemo1();
        WebElement download = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[2]/div/div/div/div/a/button"));
        Assert.assertEquals(download.isEnabled(), true);
    }


}
