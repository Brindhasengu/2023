package Mypractice.NextAutomation;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
WebElement searchbox = driver.findElement(By.id("header-big-screen-search-box"));
searchbox.sendKeys("Mens Jenes");
searchbox.sendKeys(Keys.ENTER);
WebElement image= driver.findElement(By.xpath("//*[@id=\"platform_modernisation_product_summary_A13022\"]//div//div[1]//div[1]//div//div//div[1]//a//img"));
image.click();

//System.out.println(searchBox1);

//System.out.println(searchBox2);
	}

}

