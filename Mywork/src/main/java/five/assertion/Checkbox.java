package five.assertion;
import org.junit.Assert;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox {

	public Checkbox() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  
		    // TODO Auto-generated method stub  
		        System.setProperty("webdriver.chrome.driver","C:\\Brindha\\Chrome Driver");  
		  WebDriver driver = new ChromeDriver();  
		  driver.navigate().to("https://www.amazon.co.uk/"); 
		       // driver.navigate().to("https://www.britishairways.com"); 
		     Thread.sleep(3000);
		       // Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
		       // System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
		          
		    }  
	}


