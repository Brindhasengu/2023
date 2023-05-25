package Mypractice.webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;

public class WebElements {

	public WebElements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.bbc.co.uk/");
WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/header/nav/div[1]/div/div[3]/div[2]/a"));
searchButton.click();

WebElement searchbox = driver.findElement(By.id("search-input"));
searchbox.sendKeys("Hi");

//driver.findElement(By.ByXPath)
	}

}
