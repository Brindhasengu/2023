package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.bbc.co.uk/");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        WebElement signin= driver.findElement(By.xpath("//*[@id=\"header-content\"]/nav/div[1]/div/div[2]/ul[1]/li[1]/a"));

      signin.click();


        WebElement email = driver.findElement(By.id("user-identifier-input"));
         email.sendKeys("brindhasengu@gmail.com");

        WebElement next = driver.findElement(By.id("submit-button"));
        next.click();


//Get the Web Element corresponding to the Password Field
        WebElement password = driver.findElement(By.id("password-input"));
        password.sendKeys("Anga1234!");
Thread.sleep(3000);
//Find the Sign me in button
        WebElement done = driver.findElement(By.id("submit-button"));
        done.click();
        Thread.sleep(3000);

/*
        email.sendKeys("brindhasengu@gmail.com");
        password.sendKeys("Anga1234!");

        login.click();
        System.out.println("Signed in with Click");
        driver.close();

         */

        WebElement weather = driver.findElement(By.xpath("//*[@id=\"header-content\"]/nav/div[1]/div/div[2]/ul[2]/li[4]/a/span"));
        weather.click();






    }
}
