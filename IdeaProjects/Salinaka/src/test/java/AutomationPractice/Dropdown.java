package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.moneysavingexpert.com/");
        driver.manage().window().maximize();

        WebElement Acceptall = driver.findElement(By.id("banner-accept"));
        Acceptall.click();


        WebElement dd= driver.findElement(By.className("nav-tip-popup"));
    dd.click();
    }
}
