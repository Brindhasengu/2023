package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class RegistrationPage {
    public WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;

    }

    public void gotoRegistrationPage() throws InterruptedException {
        //Thread.sleep(3000);
        driver.findElement(By.id("bahmni.registration")).click();
        //Thread.sleep(3000);


        WebElement homeButton = driver.findElement( By.className("back-btn"));
        Assert.assertNotNull(homeButton);


        WebElement SearchTab = driver.findElement( By.xpath("//span[@class='nav-link' and text()='S']"));
        Assert.assertEquals(SearchTab.getText(), "Search");




       // WebElement CreateNew = driver.findElement( By.xpath("//span[@class='nav-link' and text()='Create']"));
       // Assert.assertEquals(CreateNew.getText(), "Create New");

        WebElement CreateNew = driver.findElement(By.xpath("//*[@id=\"view-content\"]/div[1]/header/ul/li[2]/a/span"));
        Assert.assertEquals(CreateNew.getText(), "Create New");


        WebElement IdBox = driver.findElement( By.id("registrationNumber"));
        Assert.assertNotNull(IdBox);


        WebElement patientname= driver.findElement( By.id("name"));
        Assert.assertNotNull(patientname);


        WebElement phoneNumber= driver.findElement( By.id("customAttribute"));
        Assert.assertNotNull(phoneNumber);

        // Create new patient
        CreateNew.click();

        WebElement patientIdentifierDropDown = driver.findElement( By.id("identifierPrefix"));
        Assert.assertNotNull(patientIdentifierDropDown);

        WebElement patientIdentifierText= driver.findElement( By.xpath ("//label[@class='control-label' and @for = 'patientID']"));
        Assert.assertEquals(patientIdentifierText.getText(),"Patient Identifier");


        WebElement patientNameText= driver.findElement( By.xpath ("//label[@for='patientName']"));
        Assert.assertEquals(patientNameText.getText(),"Patient Name*");

/*
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        wait.until(d -> {
            System.out.println("Checking......");
            String enteredName = driver.findElement(By.id("givenName")).getAttribute("value");
            return enteredName.equals("Peter");
        });

        driver.findElement(By.id("givenName")).sendKeys(" Working");
*/
        WebElement patientMiddleNameText = driver.findElement( By.id("middleName"));
        Assert.assertNotNull(patientMiddleNameText);


        WebElement patientLastNameText = driver.findElement( By.id("familyName"));
        Assert.assertNotNull(patientLastNameText);


        //Gender text
        WebElement genderText = driver.findElement( By.xpath("//label[@for='gender']"));
        Assert.assertEquals(genderText.getText(),"Gender *");


        WebElement genderDropDown = driver.findElement( By.id("gender"));
        Assert.assertNotNull(genderDropDown);


        WebElement AgeText = driver.findElement( By.xpath("//label[@for='ageYears']"));
        Assert.assertEquals(AgeText.getText(),"Age*");
//Thread.sleep(3000);
        WebElement yearsText = driver.findElement( By.xpath("//span[@class='add-on']"));
        Assert.assertEquals(yearsText.getText(),"Years");

        WebElement yearsDropDown = driver.findElement( By.id("ageYears"));
        Assert.assertNotNull(yearsDropDown);



        //CALL Create new patient
        CreateAndTestNewPatient("Sri","Ram","jayaram","Male","20","5","13");
        //Create new patient
        CreateAndTestNewPatient("kannan","yasodha","Krishna","Male","20","5","13");

    }

    private void CreateAndTestNewPatient(String firstName,String middleName,String familyName,String gender,String ageYears, String ageMonth,String ageDays  ) throws InterruptedException {
       /* String firstName = "Sri";
       // String middleName = "Sai";
       // String familyName = "Krishna";

        String gender = "Male";
        String ageYears = "20";
        String ageMonth = "5";
        String ageDays = "12";
*/
        WebElement CreateNew = driver.findElement(By.xpath("//span[@class='nav-link' and contains(text(),'Create ') ] "));
        CreateNew.click();
        Thread.sleep(2000);
        // Enter first name
        driver.findElement(By.id("givenName")).sendKeys(firstName);
        driver.findElement(By.id("middleName")).sendKeys(middleName);
        driver.findElement(By.id("familyName")).sendKeys(familyName);

        Select objSelect = new Select(driver.findElement(By.id("gender")));
        objSelect.selectByVisibleText(gender);

        driver.findElement(By.id("ageYears")).sendKeys(ageYears);
        driver.findElement(By.id("ageMonths")).sendKeys(ageMonth);
        driver.findElement(By.id("ageDays")).sendKeys(ageDays);

        // Save
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement PatientIdentifier = driver.findElement( By.id("patientIdentifierValue"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(d -> {
                         String newPatientId = PatientIdentifier.getText();
                         return !newPatientId.isBlank();
        });

        //System.out.println(newPatientId.get());
       // System.out.println("Something here");

        // Search patient by firstName
        // Open the patient
        // Check values are matching with entered values
    }
}
