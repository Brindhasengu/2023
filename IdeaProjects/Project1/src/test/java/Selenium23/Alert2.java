package Selenium23;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert2 {


        public static void main(String[] args) throws InterruptedException {
//       WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();

            driver.get("http://demo.guru99.com/test/delete_customer.php");
            driver.manage().window().maximize();
//        driver.findElement(By.xpath("//*[contains(@class,'mat-focus-indicator solo-button mat-button mat-button-base mat-raised-button')]")).click();

            Thread.sleep(3000);

            WebElement Frame = driver.findElement(By.cssSelector("iframe#gdpr-consent-notice"));
            driver.switchTo().frame(Frame);
            driver.findElement(By.id("save")).click();

            Thread.sleep(3000);
            driver.findElement(By.name("cusid")).sendKeys("38327463");
            driver.findElement(By.name("submit")).submit();    //click();
            Thread.sleep(3000);
            driver.switchTo().alert().dismiss();
//        driver.switchTo().alert().accept();

        }

    }

