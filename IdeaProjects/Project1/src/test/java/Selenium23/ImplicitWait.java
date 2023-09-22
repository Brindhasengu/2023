package Selenium23;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ImplicitWait {

           public static void main(String[] args) throws InterruptedException
        {

                    WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(40,
                    TimeUnit.SECONDS); // pageload timeout
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// Implicit Wait for 20 seconds
            driver.get("https://accounts.google.com/");

            //Finding element and  sending values
            driver.findElement(By.id("identifierId")).sendKeys("name@gmail.com");

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='login-signin']")).click(); //Clicking on the next button if element is located
        }
    }