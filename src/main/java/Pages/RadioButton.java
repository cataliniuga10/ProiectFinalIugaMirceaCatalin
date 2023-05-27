package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton extends BasePage{
    public RadioButton(WebDriver driver){
        super(driver);

    }
    By DoubleRadioButton = By.xpath("//*[@id=\"__next\"]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/label[1]");
    public void DoubleRadioButton(){ driver.findElement(DoubleRadioButton).click();}
    By DoubleRadioButton2 = By.xpath("//*[@id=\"__next\"]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/label[1]/input");
    public void DoubleRadioButton2(){driver.findElement(DoubleRadioButton2);
    }
}
