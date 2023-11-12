import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
  public WebDriver driver;
  public Login(WebDriver driver){
      this.driver=driver;

    }
    public  void loginToBahmni(String username,String password){
      driver.findElement(By.id("username")).sendKeys("superman");
        driver.findElement(By.id("password")).sendKeys("Admin123");
    }
}
