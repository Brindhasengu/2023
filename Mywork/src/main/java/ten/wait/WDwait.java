package ten.wait;
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.ExpectedConditions;  
import org.openqa.selenium.support.ui.WebDriverWait; 
public class WDwait {

	public WDwait() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\brindha\\Chrome Driver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

		
		driver.manage().timeouts().pageLoadTimeout(9, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS); 
		
		driver.get("https://www.facebook.com/");  
		WebElement declineoptionalcookies=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[4]/button[1]"));
		declineoptionalcookies.click();
		
		
		WebElement Email= driver.findElement(By.id("email"));  
		WebElement password= driver.findElement(By.id("pass")); 
		
		//Sendkeys
		sendKeys(driver, Email, 10, "brindhasengu@gmail.com");  
		sendKeys(driver, password,10, "xx") ;
		
		//click login
		WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		login.click();
		
		driver.findElement(By.linkText("Forgotten account?"));  
		//clickOn(driver,forgotAccount, 10);  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		}  
		public static void sendKeys(WebDriver driver1, WebElement element,   
		int timeout, String value){  
		new WebDriverWait(driver1,   
		timeout).until(ExpectedConditions.visibilityOf(element));  
		element.sendKeys(value);  
		}  
		public static void clickOn(WebDriver driver1, WebElement element,   
		int timeout)  
		{  
		new WebDriverWait(driver1,   
		timeout).until(ExpectedConditions.elementToBeClickable(element));  
		element.click();  
		  
	}

}
