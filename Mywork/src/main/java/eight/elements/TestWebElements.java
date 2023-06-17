package eight.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebElements {

	public TestWebElements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\brindha\\Chrome Driver\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.bbc.co.uk/");
		WebElement signinButton = driver.findElement(By.xpath("//*[@id=\"header-content\"]/nav/div[1]/div/div[2]/ul[1]/li[1]/a"));
		//click the login button

		signinButton.click();
		//click signin
		WebElement username=driver.findElement(By.id("user-identifier-input"));

		//Enter user name
		username.sendKeys("brindhasengu@gmail.com");

		//Enter password
		WebElement password= driver.findElement(By.id("password-input"));
		password.sendKeys("Anga1234!");
		Thread.sleep(3000);
		
		//Click submit
		WebElement submit= driver.findElement(By.id("submit-button"));
		submit.click();
		
		//Click home
		WebElement home=driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/header/nav/div[1]/div/div[2]/ul[2]/li[1]/a/span"));
		home.click();
		
		//Click weather
		WebElement weather=driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/header/nav/div[1]/div/div[2]/ul[2]/li[4]/a/span"));
		weather.click();
		
		driver.quit();
	}

}
