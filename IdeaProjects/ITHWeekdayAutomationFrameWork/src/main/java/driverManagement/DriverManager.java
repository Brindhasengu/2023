package driverManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class DriverManager {
    public static ThreadLocal<WebDriver> localDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return localDriver.get();
    }

    public static void setDriver(WebDriver driver) {
        localDriver.set(driver);
    }

    public void initBrowser(String browserType) {
        WebDriver driver = null;
        switch (browserType) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }

        driver.get("https://demo-lite.mybahmni.in/");
        driver.manage().window().maximize();
        setDriver(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
}