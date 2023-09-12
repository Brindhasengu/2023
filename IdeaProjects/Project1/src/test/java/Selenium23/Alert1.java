package Selenium23;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver(); driver.get("https://www.browserstack.com/users/sign_up");

        driver.findElement(By.id("user_full_name")).sendKeys("username");
        driver.findElement(By.id("user_email_login")).sendKeys("username.xyz.net");
        driver.findElement(By.id("user_password")).sendKeys("Your_Password");
        driver.findElement(By.id("user_submit")).click();

        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert(); // switch to alert

        String alertMessage= driver.switchTo().alert().getText(); // capture alert message

        System.out.println(alertMessage); // Print Alert Message
        Thread.sleep(5000);
        alert.accept();
    }
}
