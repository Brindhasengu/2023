package Selenium23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyNext {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement Acceptall = driver.findElement(By.id("onetrust-accept-btn-handler"));
        Acceptall.click();
        WebElement Clearance = driver.findElement(By.id("meganav-link-12"));
        Clearance.click();
        //Click women
        WebElement Women = driver.findElement(By.id("meganav-link-0"));
        Women.click();
    }
}
