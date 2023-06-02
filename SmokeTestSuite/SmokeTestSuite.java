package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 18/09/2017.
 */
public class SmokeTestSuite {

    public static void main(String[] args) {

        //test data
        String baseURL = "https://qamasters-trials641.orangehrmlive.com";
        String adminUserName = "admin", adminPassword = "Srikanth99@";

        //open the browser, provide the driver profile name and provide the path for browser file
        System.setProperty("webdriver.chrome.driver", "src/browserFiles/chromedriver");
        //Instantiating the chrome driver object
        WebDriver driver = new ChromeDriver();

        //open the url
        driver.get(baseURL);
        // wait for page to load
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //maximise your screen
        driver.manage().window().fullscreen();

        //type the username
        //identify the webelement of username text field
        WebElement usernameTextField = driver.findElement(By.id("txtUsername"));
        //enter the username into username text field webelement
        usernameTextField.sendKeys(adminUserName);
        //type the password
        //identify the webelement of password text field
        WebElement passwordtextField = driver.findElement(By.id("txtPassword"));
       //enter the password into password text field webelement
        passwordtextField.sendKeys(adminPassword);

        //click the login button
        //identify the webelement of login button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        //click the login button
        loginButton.click();

        //close the browser
        driver.close();



    }

}
