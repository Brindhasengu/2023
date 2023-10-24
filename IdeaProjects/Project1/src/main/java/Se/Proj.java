package Se;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proj {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://salinaka-ecommerce.web.app/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }
}