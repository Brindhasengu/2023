package MavenProject.MavenProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium;
public class Alert {

	public Alert() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Brindha\\Chrome Driver\\chromedriver.exe");
        //WebDriver Commands
WebDriver driver = new ChromeDriver(); 
driver.get("file:///C://Users//brind//Downloads//Telegram%20Desktop//popup.html");
driver.manage().window().maximize();
WebElement courseElement = driver.findElement(By.id("Course_Selection")); 
//courseElement.select("Java");
driver.switchTo().alert().accept();  
driver.switchTo().alert().dismiss();
driver.switchTo().alert().sendKeys("abcd");
	}

}
