package Se;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousBrowsers {
    public static void main(String[] args)throws Exception {
       WebDriver driver= new ChromeDriver();
       driver.get("https://www.bbc.co.uk/");
      Thread.sleep(3000);
       driver.manage().window().maximize();


    }
}
