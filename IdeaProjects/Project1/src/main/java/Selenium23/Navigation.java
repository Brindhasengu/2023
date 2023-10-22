package Selenium23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation {
    public static void main(String[] args)throws Exception
    {
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     Thread.sleep(3000);

     driver.get("https://www.amazon.co.uk/");
     Thread.sleep(3000);
     driver.navigate().to("https://www.bbc.co.uk/");

     driver.navigate().back();
     Thread.sleep(3000);
     driver.navigate().forward();
     //driver.navigate().refresh(); This is changed today




    }
}
