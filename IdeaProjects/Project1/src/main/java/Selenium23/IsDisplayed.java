package Selenium23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://salinaka-ecommerce.web.app/");
        driver.manage().window().maximize();
        WebElement searchbox= driver.findElement(By.xpath("//*[@id=\"app\"]/nav/div[2]/input"));

        //to verify search box is available
       System.out.println("Disply:" +searchbox.isDisplayed());
        System.out.println("Disply:" +searchbox.isEnabled());

//isSelected();
       // WebElement = driver.findElement(By.xpath("//*[@id=\"app\"]/nav/div[2]/input"));




    }

}
