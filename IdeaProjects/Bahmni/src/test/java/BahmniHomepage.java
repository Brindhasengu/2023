import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BahmniHomepage
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo-lite.mybahmni.in/");
        driver.manage().window().maximize();

    }
}
