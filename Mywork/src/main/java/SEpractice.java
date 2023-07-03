import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEpractice {

	public SEpractice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\Brindha\\Chrome Driver\\ChromeDriver.exe");
         WebDriver driver= new ChromeDriver();
         
         driver.manage().window().maximize();
         
         driver.get("https://www.amazon.co.uk/");
	}

}
