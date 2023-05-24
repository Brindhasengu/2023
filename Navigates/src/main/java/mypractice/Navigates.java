package mypractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Navigates {

	public Navigates() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.co.uk/");
Thread.sleep(3000);
driver.get("https://www.bbc.co.uk/");
Thread.sleep(3000);
driver.navigate().refresh();
	}

}
