package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.bbc.co.uk/");
        driver.manage().window().maximize();

        WebElement youracc = driver.findElement(By.className("ssrcss-qgttmg-AccountText e1gviwgp4"));
        youracc.click();


        WebElement email = driver.findElement(By.id("user-identifier-input"));
        WebElement next = driver.findElement(By.id("submit-button"));
        next.click();

//Get the Web Element corresponding to the Password Field
        WebElement password = driver.findElement(By.id("user_password"));

//Find the Sign me in button
        WebElement login = driver.findElement(By.id("user_submit"));

        email.sendKeys("brindhasengu@gmail.com");
        password.sendKeys("Anga1234!");

        login.click();
        System.out.println("Signed in with Click");
        driver.close();
    }
}
