package SimpleFormTestCases;

import Pages.BasePage;

import Pages.RadioButtonPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class RadioButtonTest extends BasePage {
    private RadioButtonPage radioButton;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        radioButton = new RadioButtonPage(driver);}
   @Test
   public void clickOnMaleButton() throws InterruptedException{
       By radioButton = By.cssSelector("radioButton");
       var radioButton1 = driver.findElement(radioButton);
        Assert.assertEquals(radioButton1.isSelected(), true );

    }}


