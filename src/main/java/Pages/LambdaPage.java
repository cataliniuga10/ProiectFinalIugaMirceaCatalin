package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaPage extends BasePage{
    public LambdaPage(WebDriver driver){
        super(driver);
        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/div/div/div[1]/div[1]/div[2]/div/div[1]/span")).click();
    }
    By ClickLambaButton = (By.xpath("/html/body/div[1]/header/nav/div/div/div[1]/div/div/a/img"));
    public void ClickLambdaButton1(){driver.findElement(ClickLambaButton);}
             By LearnMoreButton = By.xpath("/html/body/div[1]/div[1]/section[1]/div/div/div[1]/div[1]/div[2]/div/div[1]/span");
    public void ClickOnLearnMoreButton(){ driver.findElement(LearnMoreButton);}}

