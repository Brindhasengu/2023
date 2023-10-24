package Selenium23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.pinterest.co.uk/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.moneysavingexpert.com/");
        driver.manage().window().maximize();
        //click Accept all
        WebElement Acceptall = driver.findElement(By.id("banner-accept"));
        Acceptall.click();
    }
}
