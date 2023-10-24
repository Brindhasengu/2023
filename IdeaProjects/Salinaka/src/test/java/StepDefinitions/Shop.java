package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shop {
    WebDriver driver;

    @Given("User enters url of app.")
    public void user_enters_url_of_app() {
        driver = new ChromeDriver();
        driver.get("https://salinaka-ecommerce.web.app/");
        driver.manage().window().maximize();
    }

    @When("user click the shop page")
    public void user_click_the_shop_page() throws InterruptedException {
        Thread.sleep(2000);
        WebElement shop = driver.findElement(By.xpath("//*[@id=\"app\"]/nav/ul[1]/li[2]/a"));
        shop.click();
    }
    @Then("shopping page is loaded")
    public void shopping_page_is_loaded() throws InterruptedException {
        Thread.sleep(3000);
        String title = driver.getTitle();
        Assert.assertEquals(title,"Shop | Salinaka");
    }

}
