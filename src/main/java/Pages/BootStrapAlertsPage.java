package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BootStrapAlertsPage extends BasePage{
    public BootStrapAlertsPage(WebDriver driver){
        super(driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/button[2]")).click();
    }
      By BootStrapButton = By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[2]/div[1]/ul/li[1]/a");
    public void ClickBootStrapButton(){driver.findElement(BootStrapButton);}
     By NormalSuccesMessage = By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/button[2]");
    public void ClickNormalSuccesMessage(){driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/button[2]"));}
}
