package Mypractice.NextAutomation;
import java.util.List;
import java.util.Set;
import org .openqa.selenium.By;
import org .openqa.selenium.By.ById;
import org .openqa.selenium.WebDriver;
import org .openqa.selenium.WebDriver.Window;
import org .openqa.selenium.WebElement;
import org .openqa.selenium.chrome.ChromeDriver;
//import org .openqa.selenium.remote.server.handler.CloseWindow;

public class LaunchPage {

	public LaunchPage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c:\\Brindha\\Chrome Driver\\ChromeDriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.next.co.uk/");
Thread.sleep(3000);
WebElement AcceptAll=driver.findElement(By.id("onetrust-accept-btn-handler"));
AcceptAll.click();

//System.out.println(searchBox1);
//System.out.println(searchBox2);
	}

}

