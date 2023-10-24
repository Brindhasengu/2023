package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Checkout {
    WebDriver driver;

    @Then("Able to add item to shopping")
    public void able_to_add_item_to_shopping() throws InterruptedException {


    }
    @Given("The user has logged in")
    public void the_user_has_logged_in() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://salinaka-ecommerce.web.app/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement signinButton = driver.findElement(By.xpath("//*[@id=\"app\"]/nav/ul[2]/li[2]/a[2]"));
        signinButton.click();
        Thread.sleep(1000);
        String title = driver.getTitle();
        Assert.assertEquals(title,"Sign In | Salinaka");

        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("brindhasengu@gmail.com");

        WebElement passwordTextbox = driver.findElement(By.id("password"));
        passwordTextbox.sendKeys("Asdf1234");

        WebElement doSignInButton = driver.findElement(By.className("auth-button"));
        Assert.assertEquals(doSignInButton.getText(), "Sign In ");

        doSignInButton.click();
    }
    @Then("Can select an item to see detail")
    public void can_select_an_item_to_see_detail() throws InterruptedException {
        Thread.sleep(3000);
        WebElement burnikkItem = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/div[2]/div[1]/div/div[2]/h2"));

        burnikkItem.click();
    }
    @Then("Can select required size")
    public void can_select_required_size() {

    }

    @Then("user can select the colour")
    public void user_can_select_the_colour() throws InterruptedException {
        Thread.sleep(1000);
        WebElement colour= driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[1]/div[3]/div[3]/div/div[2]"));
        colour.click();
    }


    @Then("Can add to shopping bag")
    public void can_add_to_shopping_bag() throws InterruptedException {
        Thread.sleep(3000);

        WebElement addToBagButton = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[1]/div[3]/div[4]/button"));
        addToBagButton.click();
    }
    @Then("user can able to view the bag")
    public void user_can_able_to_view_the_bag() throws InterruptedException {
        Thread.sleep(3000);

        WebElement viewbag = driver.findElement(By.xpath("//*[@id=\"app\"]/nav/ul[2]/li[1]/button"));
        viewbag.click();
    }

    @Given("The user is at home page.")
    public void the_user_is_at_home_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Can checkout the item")
    public void can_checkout_the_item() throws InterruptedException {
        Thread.sleep(3000);
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/button"));
        checkout.click();
    }

    @Then("Can view order summary")
    public void can_view_order_summary() throws InterruptedException {
        Thread.sleep(3000);
        WebElement orderSummaryText = driver.findElement(By.className("text-center"));
        Assert.assertEquals(orderSummaryText.getText(), "Order Summary");
    }
    @Then("can click Next step to enter shipping details")
    public void can_click_next_step_to_enter_shipping_details() throws InterruptedException {
        Thread.sleep(3000);
        WebElement nextStepButton = GetButtonElement("Next Step");
        nextStepButton.click();
    }
    @Then("Shipping details can be entered")
    public void shipping_details_can_be_entered() throws InterruptedException {
        Thread.sleep(3000);
        WebElement addressTextField = driver.findElement(By.id("address"));
        addressTextField.sendKeys("My address here");

        WebElement telephoneTextField = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[2]/form/div[1]/div/div[2]/div[2]/div/div/input"));
        telephoneTextField.sendKeys("12345678");

   }

    @Then("Can click Next step to view payment screen")
    public void can_click_next_step_to_view_payment_screen() throws InterruptedException {

        Thread.sleep(3000);
        WebElement nextStepButton = GetButtonElement("Next Step");
        nextStepButton.click();

        Thread.sleep(3000);
        WebElement orderSummaryText = driver.findElement(By.className("text-center"));
        Assert.assertEquals(orderSummaryText.getText(), "Payment");
    }

    @Then("user  can confirm the payment")
    public void user_can_confirm_the_payment() throws InterruptedException {
        Thread.sleep(3000);
        WebElement confirmButton = GetButtonElement("Confirm");
        confirmButton.click();
        Thread.sleep(3000);
    }
    private WebElement GetButtonElement(String searchString) {
        List<WebElement> elements = driver.findElements(By.className("button"));
        for(WebElement element : elements){
            if(element.getText().contains(searchString))
            {
                return element;
            }
        }

        return null;
    }

}
