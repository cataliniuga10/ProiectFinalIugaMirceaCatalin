import Pages.BasePage;
import Pages.BootStrapAlertsPage;
import Pages.DownloadFileDemoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.Message;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BootStrapAlertsTestCases extends BasePage {
    private BootStrapAlertsPage bootStrapAlertsPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        bootStrapAlertsPage = new BootStrapAlertsPage(driver);}

 @Test
     public void NormalSuccessMessage(){
        bootStrapAlertsPage.ClickNormalSuccesMessage();
     WebElement Message = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/button[2]"));
     Assert.assertTrue(Message.isDisplayed(), "I'm a normal success message. To close use the appropriate button.");
 }
}