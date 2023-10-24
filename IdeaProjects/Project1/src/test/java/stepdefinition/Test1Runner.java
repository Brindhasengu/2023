package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( features = "src//test//resources//feature//Test1.feature", glue = {"stepdefinition"})
public class Test1Runner extends AbstractTestNGCucumberTests {
    @Given("user open the Browser")
    public void user_open_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User enters url {string}")
    public void user_enters_url(String string) {

        throw new io.cucumber.java.PendingException();
    }
    @And("verify the title of window")
    public void verify_the_title_of_window() {

        throw new io.cucumber.java.PendingException();
    }
    @Then("Close the browser")
    public void close_the_browser() {

        throw new io.cucumber.java.PendingException();
    }


}
