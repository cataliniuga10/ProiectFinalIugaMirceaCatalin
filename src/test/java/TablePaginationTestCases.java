import Pages.BasePage;
import Pages.TablePaginationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TablePaginationTestCases extends BasePage {
    private TablePaginationPage tablePaginationPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        tablePaginationPage= new TablePaginationPage(driver);
}
    @Test
    public void ForPage2() throws InterruptedException {
        tablePaginationPage.ClickPage2();


        WebElement Page2 = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/nav/ul/li[3]/span"));
        Assert.assertEquals(Page2.isDisplayed(),true );
}}