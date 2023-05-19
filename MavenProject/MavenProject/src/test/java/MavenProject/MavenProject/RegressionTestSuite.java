package MavenProject.MavenProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegressionTestSuite {
    //Test Data
    static String baseURL = "http://automationpractice.com/index.php";
    static String email1 = "srikanth123@gmail.com";
    static String email2 = "srikanth@gmail.com";
    static String email3 = "srikanth@gmail.com";
    static String firstName = "srikanth";
    static String title = "Mr";
    static String dobDay = "2  ";
    static String dobMonth = "April "; 
    static String dobYear = "2005  ";
    static String stateName = "Alaska";

    //Instantiating the webDirver variable and assign the webDriver object
    static WebDriver driver;

    //ReUsable Methods
    @BeforeClass
    public static void openBrowser() {
//   i. Open browser
//  create the browser profile and provide the path
//        System.setProperty("webdriver.chrome.driver", "src/browserFiles/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        ii. Enter url
        driver.get(baseURL);
//        iii. Wait for page load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void closeBrowser() {
        driver.close();
    }

    @Before
    public void navigateToRegisterPage() {
        //        iv. Select signIn link
        WebElement signInLink = driver.findElement(By.cssSelector(".login"));
        signInLink.click();
//        v. Wait for page load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void verifyUserCannorRegisterWithInvalidData() {
        //        vi. Verify that user is on the Authentication page - TODO
        Assert.assertTrue(isCreateAccountPanelDisplayed());
        enterEmailAndContinue(email1);
//        ix. Verify that user is on the registration page
        Assert.assertTrue(isUserOnRegistrationPage());
        selectTitle(title);
        enterFirstName(firstName);
        enterDOB(dobDay, dobMonth, dobYear);
        selectNewsLetter();
        selectState(stateName);
        submitRegistrationForm();
    }

    @Test
    public void testcase2() {
        //        vi. Verify that user is on the Authentication page - TODO
        Assert.assertTrue(isCreateAccountPanelDisplayed());
        enterEmailAndContinue(email2);
//        ix. Verify that user is on the registration page
        Assert.assertTrue(isUserOnRegistrationPage());
        selectTitle("Mrs");
        enterFirstName("venu");
        enterDOB("2  ", "May ", "1999  ");
        selectNewsLetter();
        selectState("Alabama");
        submitRegistrationForm();
//        xii.  Verify that user will see validation messages on the page

    }


    //Re-Usable Methods
    public boolean isCreateAccountPanelDisplayed() {
        WebElement createAccountForm  = driver.findElement(By.cssSelector("#create-account_form"));
        boolean createAccountFormStatus = createAccountForm.isDisplayed();
        return createAccountFormStatus;
    }

    public boolean isUserOnRegistrationPage() {
        WebElement registrationForm = driver.findElement(By.cssSelector("#account-creation_form"));
        boolean registrationFormStatus = registrationForm.isDisplayed();
        return registrationFormStatus;
    }

    public void enterEmailAndContinue(String userEmail) {
        //        vii. Enter the email address and select create account button
        WebElement newAccountEmail = driver.findElement(By.cssSelector("#email_create"));
        newAccountEmail.sendKeys(userEmail);

        WebElement createAccountButton = driver.findElement(By.cssSelector("#SubmitCreate"));
        createAccountButton.click();
        //        viii. Wait for page load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void selectTitle(String title) {
        //        x. Select the title
        if (title == "Mr") {
            WebElement title1 = driver.findElement(By.cssSelector("#id_gender1"));
            title1.click();
        } else if (title == "Mrs") {
            WebElement title2 = driver.findElement(By.cssSelector("#id_gender2"));
            title2.click();
        }
    }

    public void enterFirstName(String firstname) {
        //        Enter the first name
        WebElement firsrNameField = driver.findElement(By.cssSelector("[name='customer_firstname']"));
        firsrNameField.sendKeys(firstname);
    }

    public void enterDOB(String day, String month, String year) {
        //        select DOBDate(day and month and year)
        WebElement DOBDate = driver.findElement(By.cssSelector("#days"));
        Select dayList = new Select(DOBDate);
        dayList.selectByVisibleText(day);

//        select DOBMonth(day and month and year)
        WebElement DOBMonth = driver.findElement(By.cssSelector("#months"));
        Select monthList = new Select(DOBMonth);
        monthList.selectByVisibleText(month);

//        select DOBYear(day and month and year)
        WebElement DOBYear = driver.findElement(By.cssSelector("#years"));
        Select yearList = new Select(DOBYear);
        yearList.selectByVisibleText(year);

    }


    public void selectState(String state) {
        //        Select the state
        WebElement stateField = driver.findElement(By.cssSelector("#id_state"));
        Select stateList = new Select(stateField);
        stateList.selectByVisibleText(state);
    }

    public void submitRegistrationForm() {
        //        xi.  click register button
        WebElement registerButton = driver.findElement(By.cssSelector("#submitAccount"));
        registerButton.click();
    }

    public void selectNewsLetter() {
        WebElement newsLetterCheckBox = driver.findElement(By.cssSelector("#newsletter"));
        newsLetterCheckBox.click();
    }

}
