package Selenium23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyAlert {




            public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {

                //WebDriver driver = new ChromeDriver();



                // System Property for Gecko Driver


                // Initialize Gecko Driver using Desired Capabilities Class
                  //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                //capabilities.setCapability("marionette",true);
                WebDriver driver= new FirefoxDriver();


                // Launch Website
                driver.navigate().to("https://www.bbc.com");

                //Handling alert boxes
                //Click on generate alert button
                driver.findElement(By.linkText("Generate Alert Box")).click();

                //Using Alert class to first switch to or focus to the alert box
                Alert alert = (Alert) driver.switchTo().alert();

                //Using accept() method to accept the alert box
                alert.accept();

                //Handling confirm box
                //Click on Generate Confirm Box
                driver.findElement(By.linkText("Generate Confirm Box")).click();


                Alert confirmBox = (Alert) driver.switchTo().alert();

                //Using dismiss() command to dismiss the confirm box
                //Similarly accept can be used to accept the confirm box
                ((Alert) confirmBox).dismiss();



            }

}