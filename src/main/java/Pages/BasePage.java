package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
public class BasePage {
    protected WebDriver driver;
    private String baseUrl ="https://www.lambdatest.com/selenium-playground/";
    public BasePage(){}
    public BasePage(WebDriver driver){
            this.driver = driver;
        }
          @BeforeClass
                  public void setUp() {
              System.setProperty("web-driver.chrome.driver", "C:\\Users\\Catalin\\Desktop\\chromedriver_win32\\chromedriver.exe");
              driver = new ChromeDriver ();
              this.driver.get(baseUrl);
          }
          @AfterMethod
    public void tearDown(){// driver.quit();
         }
        }


