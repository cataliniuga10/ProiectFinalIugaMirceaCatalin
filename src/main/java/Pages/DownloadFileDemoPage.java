package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadFileDemoPage extends BasePage {
    public DownloadFileDemoPage(WebDriver driver) {
        super(driver);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[10]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div/a/button")).click();
    }

     By WebElementDownloadFileDemo = By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div/a/button");

    public  WebElement WebElementDownloadDemo1() {return driver.findElement(WebElementDownloadFileDemo);}
}