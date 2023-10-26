package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://salinaka-ecommerce.web.app/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.moneysavingexpert.com/");


        WebElement Acceptall = driver.findElement(By.id("banner-accept"));
        Acceptall.click();


     driver.navigate().to ("https://www.nalli.com/");

    }
}



