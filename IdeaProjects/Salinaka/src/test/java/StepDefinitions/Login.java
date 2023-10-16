package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {
    WebDriver driver;

    @Given("I navigate to the Website")
    public void i_navigate_to_the_website() {
        driver=new ChromeDriver();
        driver.get("https://salinaka-ecommerce.web.app/");
        driver.manage().window().maximize();

    }

    @Given("I am in sign in page")
    public void i_am_in_sign_in_page() throws InterruptedException {
        driver.get("https://salinaka-ecommerce.web.app/");
        WebElement signinButton = driver.findElement(By.xpath("//*[@id=\"app\"]/nav/ul[2]/li[2]/a[2]"));
        signinButton.click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        Assert.assertEquals(title,"Sign In | Salinaka");
    }

    @When("I enter {string} and {string} to login Page")
    public void i_enter_email_and_password_to_login_page(String email, String password) {
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys(email);

        WebElement passwordTextbox = driver.findElement(By.id("password"));
        passwordTextbox.sendKeys(password);
    }

    @When("User click on sign-in button")
    public void user_click_on_sign_in_button() {
        WebElement doSignInButton = driver.findElement(By.className("auth-button"));
        Assert.assertEquals(doSignInButton.getText(), "Sign In ");

        doSignInButton.click();
    }

    @Then("Validate the user logo after login")
    public void Validate_the_user_logo_after_login() throws InterruptedException {
        Thread.sleep(3000);
        WebElement userImage = driver.findElement(By.xpath("/html/body/div[1]/nav/ul[2]/li[2]/div/div[1]/img"));
        Assert.assertNotNull(userImage);
    }
}








