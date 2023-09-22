package Selenium23;
import org.apache.poi.poifs.crypt.agile.KeyData;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
public class KeyboardActions {






            public static void main(String[] args) throws InterruptedException {

//        WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();

                driver.get("https://www.google.com");
                driver.manage().window().maximize();
                driver.findElement(By.id("L2AGLb")).click();
                Thread.sleep(2000);
                WebElement search = driver.findElement(By.name("q"));
                Actions act = new Actions(driver);

		act.keyDown(search, Keys.SHIFT).sendKeys("testing")
		.keyUp(search, Keys.SHIFT).build().perform();

        driver.findElement(By.name("q")).sendKeys("testing");

                act.sendKeys(search, "testing").build().perform();
                Thread.sleep(5000);
                act.keyDown(search, Keys.CONTROL).
                        sendKeys("a").keyUp(search, Keys.CONTROL).build().perform();
                Thread.sleep(5000);
                search.sendKeys(Keys.DELETE);
                Thread.sleep(3000);
                act.keyDown(search, Keys.SHIFT).sendKeys("selenium").build().perform();
                Thread.sleep(3000);
                search.sendKeys(" ");
                search.sendKeys(Keys.ENTER);

       act.keyDown(search, Keys.SHIFT).sendKeys("testing")
                .keyUp(search, Keys.SHIFT).keyDown(search, Keys.CONTROL).sendKeys("a")
                .keyUp(search, Keys.CONTROL).build().perform();
       Thread.sleep(3000);
        search.sendKeys(Keys.DELETE);

       search.sendKeys(Keys.ENTER);

            }

        }



