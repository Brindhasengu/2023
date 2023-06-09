
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
driver.manage().window().maximize();

driver.get("https://www.next.co.uk/");
Thread.sleep(3000);
WebElement AcceptAll=driver.findElement(By.id("onetrust-accept-btn-handler"));
AcceptAll.click();

// Search for mens jeans
WebElement searchbox = driver.findElement(By.id("header-big-screen-search-box"));
searchbox.sendKeys("Men Jenes");
searchbox.sendKeys(Keys.ENTER);

// Select the first item returned in the seach
WebElement image= driver.findElement(By.xpath("//*[@id=\"platform_modernisation_product_summary_530205\"]/div/div[1]/div[1]/div/div/div[1]/a/img"));
image.click();
Thread.sleep(3000);
// Click in the size dropdown to expand the drop down selection
WebElement dropdownsize=driver.findElement(By.xpath("/html/body/section[1]/section[1]/div/div[2]/div[2]/div/section[2]/article/section/div[5]/div[6]/div/div"));
                                                    // /html/body/section[1]/section[1]/div/div[2]/div[2]/div/section[2]/article/section/div[5]/div[6]/div/div/a                                                   
dropdownsize.click();
Thread.sleep(3000);
// Select the required size
//WebElement dropdown=driver.findElement(By.id("\"dk_container_Size-530-205\""));
WebElement requiredSize=driver.findElement(By.xpath("/html/body/section[1]/section[1]/div/div[2]/div[2]/div/section[2]/article/section/div[5]/div[6]/div/div/div/ul/li[4]/a"));
requiredSize.click();
Thread.sleep(4000);
//  
//WebElement dropdown_option=driver.findElement(By.xpath("//*[@id=\"dk_container_Size-530-205\"]/div/ul/li[3]/a"));
//dropdown_option.click();

WebElement addToBag =driver.findElement(By.xpath("/html/body/section[1]/section[1]/div/div[2]/div[2]/div/section[2]/article/section/div[5]/div[7]/div[3]/div/a[1]"));
addToBag.click();
Thread.sleep(2000);
// Click on shopping bag icon at the top bar
WebElement shoppingbag=driver.findElement(By.xpath("/html/body/div[2]/div/section/header/div[1]/nav/div[2]/div[4]/div[2]/a/div"));
shoppingbag.click();
Thread.sleep(2000);
//Click on viewbag
WebElement viewbag=driver.findElement(By.xpath("/html/body/div[2]/div/section/header/div[1]/nav/div[2]/div[4]/div[2]/div/div/div[2]/div/div/div[3]/div[1]"));

System.out.println(viewbag);
viewbag.click();
Thread.sleep(2000);
//Click on checkout
WebElement checkout=driver.findElement(By.xpath("/html/body/section[1]/section[1]/div[1]/section/div[2]/div[5]/div[2]/a[3]"));
checkout.click();
Thread.sleep(2000);

//System.out.println(searchBox1);

//System.out.println(searchBox2);
	}

}

