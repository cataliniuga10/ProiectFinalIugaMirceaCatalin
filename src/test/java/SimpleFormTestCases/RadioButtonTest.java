package SimpleFormTestCases;

import Pages.BasePage;
import Pages.RadioButton;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest extends BasePage {
    private RadioButton radioButton;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        radioButton = new RadioButton(driver);
    }
   @Test
   public void clickOnMaleButton() throws InterruptedException{
       driver.findElement(By.xpath("//*[@id=\"buttoncheck\"]"));
     var RadioButton = driver.findElement(By.xpath("//*[@id=\"buttoncheck\"]"));
       Assert.assertEquals (  true , RadioButton.isSelected());
}}
