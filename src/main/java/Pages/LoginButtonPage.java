package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginButtonPage extends BasePage{
        public LoginButtonPage(WebDriver driver){
            super(driver);
            driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();

            driver.findElement(By.id("email")).sendKeys("cataliniuga10@gmail.com");
            driver.findElement(By.id("password")).sendKeys("Mircea");
            driver.findElement(By.id("login-button")).click();
            driver.findElement(By.id("errors-email")).click();




        }
    By clickLogin = By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]");
    public WebElement Login(){return driver.findElement(clickLogin);}

    By ErorrMessage = By.id("errors-email");
    public WebElement Error(){return driver.findElement(ErorrMessage);}

}
