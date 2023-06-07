package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TablePaginationPage extends BasePage {
    public TablePaginationPage(WebDriver driver) {
        super(driver);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[3]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/nav/ul/li[3]/span")).click();



    }
    By ClickOnTitlePagination = By.xpath("\"//*[@id=\\\"__next\\\"]/div/section[2]/div/div/div[3]/div[1]/ul/li[1]/a\"");
public void TitlePagination (){driver.findElement(ClickOnTitlePagination);}
    By ClickOnPage2 = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/nav/ul/li[3]/span");

    public void ClickPage2() {
        driver.findElement(ClickOnPage2);
    }

}
