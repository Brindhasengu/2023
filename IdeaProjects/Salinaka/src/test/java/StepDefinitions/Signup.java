package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Signup {
    WebDriver driver;

    @Given("The user is at the web app.")
    public void the_user_is_at_the_web_app() {
        driver= new ChromeDriver();
        driver.get("https://salinaka-ecommerce.web.app/");
    }

    @Then("signup button is available")
    public void signup_button_is_available() throws InterruptedException {
        Thread.sleep(3000);
        WebElement signupButton = driver.findElement(By.xpath("//*[@id=\"app\"]/nav/ul[2]/li[2]/a[1]"));
        Assert.assertEquals(signupButton.getText(), "Sign Up");
    }
    @When("clicking on signup button")
    public void clicking_on_signup_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement signupButton = driver.findElement(By.xpath("//*[@id=\"app\"]/nav/ul[2]/li[2]/a[1]"));
        signupButton.click();
    }
    @Then("Signup page is loaded")
    public void signup_page_is_loaded() throws InterruptedException {
        Thread.sleep(3000);
        String title = driver.getTitle();
        Assert.assertEquals(title,"Sign Up | Salinaka");
    }
    @Then("signup page has name,email,password")
    public void signup_page_has_name_email_password() {
        WebElement fullnameTextbox = driver.findElement(By.id("fullname"));
        WebElement emailTextbox = driver.findElement(By.id("email"));
        WebElement passwordTextbox = driver.findElement(By.id("password"));

        Assert.assertNotNull(fullnameTextbox);
        Assert.assertNotNull(emailTextbox);
        Assert.assertNotNull(passwordTextbox);
    }

    @Given("The user is in Sign Up page.")
    public void the_user_is_in_sign_up_page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://salinaka-ecommerce.web.app/");
        WebElement signupButton = driver.findElement(By.xpath("//*[@id=\"app\"]/nav/ul[2]/li[2]/a[1]"));
        signupButton.click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        Assert.assertEquals(title,"Sign Up | Salinaka");
    }

    @When("Fullname is left blank")
    public void fullname_is_left_blank() {
        WebElement fullnameTextbox = driver.findElement(By.id("fullname"));
        fullnameTextbox.clear();

        WebElement doSignUpButton = driver.findElement(By.className("auth-button"));
        Assert.assertEquals(doSignUpButton.getText(), "Sign Up ");

        doSignUpButton.click();


    }



    @Then("Fullname required error is diplayed")
    public void fullname_required_error_is_diplayed() {
        WebElement errorText = GetErrorTextElement("Full name is required.");
        Assert.assertNotNull(errorText);
    }
    @When("Email id is blank")
    public void email_id_is_blank() {
        WebElement emailTextbox = driver.findElement(By.id("email"));
        emailTextbox.clear();

        WebElement doSignUpButton = driver.findElement(By.className("auth-button"));
        Assert.assertEquals(doSignUpButton.getText(), "Sign Up ");

        doSignUpButton.click();
    }
    @Then("Email is required error is displayed")
    public void email_is_required_error_is_displayed() {
        WebElement errorText = GetErrorTextElement("Email is required.");
        Assert.assertNotNull(errorText);
    }
    @When("Password is left blank")
    public void password_is_left_blank() {
        WebElement passwordTextbox = driver.findElement(By.id("password"));
        passwordTextbox.clear();

        WebElement doSignUpButton = driver.findElement(By.className("auth-button"));
        Assert.assertEquals(doSignUpButton.getText(), "Sign Up ");

        doSignUpButton.click();
    }
    @Then("Password is required error is displayed")
    public void password_is_required_error_is_displayed() {
        WebElement errorText = GetErrorTextElement("Password is required.");
        Assert.assertNotNull(errorText);
    }

    @Given("Fullname, email and password are entered")
    public void fullname_email_and_password_are_entered() {
        WebElement fullname = driver.findElement(By.id("fullname"));
        fullname.click();
        fullname.sendKeys("Brindha");

        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("brindhasengu@gmail.com");

        WebElement passwordTextbox = driver.findElement(By.id("password"));
        passwordTextbox.sendKeys("Asdf1234");

        WebElement doSignUpButton = driver.findElement(By.className("auth-button"));
        Assert.assertEquals(doSignUpButton.getText(), "Sign Up ");

        doSignUpButton.click();
    }
    @Then("Signup is successful")
    public void signup_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement this");
    }

    private WebElement GetErrorTextElement(String searchString) {
        List<WebElement> elements = driver.findElements(By.className("label-error"));
        for(WebElement element : elements){
            if(element.getText().contains(searchString))
            {
                return element;
            }
        }

        return null;
    }
}
