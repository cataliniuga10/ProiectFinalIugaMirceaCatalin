package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage{
    public RadioButtonPage(WebDriver driver){
        super(driver);

    }
By CloseWindow = By.id("exit_popup_close");
    public void CloseWindow(){driver.findElement(CloseWindow).click();}
    By RadioButtonDemo = By.cssSelector("#__next > div.wrapper > section.mt-50 > div > div > div.w-3\\/12.smtablet\\:w-full > div.mb-10.sp__list.active > ul > li:nth-child(3) > a");
     public void RadioButtonDemo(){driver.findElement(RadioButtonDemo).click();}
 By radioButton = By.cssSelector("input[type='radio'][value='Male'][name='optradio']");
    public void radioButton(){driver.findElement(radioButton).click();}

}




