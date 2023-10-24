package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class Launch {
    WebDriver driver;

    @Then("User enters url.")
    public void user_enters_url() {
        driver = new ChromeDriver();
        driver.get("https://salinaka-ecommerce.web.app/");
        driver.manage().window().maximize();

    }
    @Then("verify the title of window")
    public void verify_the_title_of_window() throws InterruptedException {

        //WebDriverWait wait = new WebDriverWait(driver,30);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
       Thread.sleep(3000);

         String title = driver.getTitle();
         Assert.assertEquals(title,"Salinaka | Home");
    }
    @Then("verify home page")
    public void verify_home_page() {


        WebDriverWait wait;
        wait = new WebDriverWait(driver,  Duration.ofSeconds(3, 1) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/h1")));
       // WebElement featureProductsHeader = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/h1"));
        //Assert.assertNotNull(featureProductsHeader);
    }
}
