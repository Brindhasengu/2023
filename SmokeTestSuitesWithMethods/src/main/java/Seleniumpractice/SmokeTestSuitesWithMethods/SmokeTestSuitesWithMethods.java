package Seleniumpractice.SmokeTestSuitesWithMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SmokeTestSuitesWithMethods {
    //test data
    static String baseURL = "https://qamasters-trials641.orangehrmlive.com";
    static String adminUserName = "admin", adminPassword = "Srikanth99@";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
    SmokeTestSuitesWithMethods sm1 = new SmokeTestSuitesWithMethods();

    sm1.openBrowserAndUrl();
    sm1.loginAs(adminUserName,adminPassword);
    sm1.closeBrowser();

    // testcase-1
        sm1.openBrowserAndUrl();
        sm1.loginAs(adminUserName,adminPassword);
        sm1.closeBrowser();

    // testcase-2
        sm1.openBrowserAndUrl();
        sm1.loginAs(adminUserName,adminPassword);
        sm1.addEmployee();
        sm1.logout();
        sm1.closeBrowser();
    // testcase-3
        sm1.openBrowserAndUrl();
        sm1.loginAs(adminUserName,adminPassword);
        sm1.editEmployee();
        sm1.logout();
        sm1.closeBrowser();

    // testcase-4
        sm1.openBrowserAndUrl();
        sm1.loginAs(adminUserName,adminPassword);
        sm1.deleteEmployee();
        sm1.logout();
        sm1.closeBrowser();
    }

    // ------ Re-usable Methods

    public void addEmployee() {
        System.out.println("Employee Added");
    }
    public void deleteEmployee() {
        System.out.println("Employee Deleted");
    }
    public void editEmployee() {
        System.out.println("Employee Edited");
    }


    public void logout() {
        System.out.println("User logged out");
    }

    public void openBrowserAndUrl() throws InterruptedException {
        //open the browser, provide the driver profile name and provide the path for browser file
        System.setProperty("webdriver.chrome.driver", "src/browserFiles/chromedriver.exe");
        //Instantiating the chrome driver object
        driver = new ChromeDriver();

        //open the url
        driver.get("https://www.bbc.co.uk/");
        Thread.sleep(3000);
        // wait for page to load
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //maximise your screen
        driver.manage().window().fullscreen();
    }


    public void loginAs(String username, String password) {
        //type the username
        //identify the webelement of username text field
        WebElement usernameTextField = driver.findElement(By.id("txtUsername"));
        //enter the username into username text field webelement
        usernameTextField.sendKeys(username);

        //type the password
        //identify the webelement of password text field
        WebElement passwordtextField = driver.findElement(By.id("txtPassword"));
        //enter the password into password text field webelement
        passwordtextField.sendKeys(password);

        //click the login button
        //identify the webelement of login button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        //click the login button
        loginButton.click();
    }

    public void closeBrowser() {
        //close the browser
        driver.close();
    }



}
