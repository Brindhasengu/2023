
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPage {





        @Given("user launch the web app on browser")
        public void user_launch_the_web_app_on_browser() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://dev.lite.mybahmni.in/");
            driver.manage().window().maximize();


        }

        @Given("user is on the login page")
        public void user_is_on_the_login_page() {
            // Write code here that turns the phrase above into concrete actions

            throw new io.cucumber.java.PendingException();
        }

        @Given("user enter the user name and password")
        public void user_enter_the_user_name_and_password() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Given("user clicks on the login CTA")
        public void user_clicks_on_the_login_cta() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("user should be able to login to the app")
        public void user_should_be_able_to_login_to_the_app() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
    }

