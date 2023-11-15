package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegistrationPage {
    public WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;

    }

    public void gotoRegistrationPage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("bahmni.registration")).click();
        Thread.sleep(3000);


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

        for(WebElement ele:elements){
            if(ele.get()name:textcontant).Contains("patient Name")){
                ele.click();
            }
        }



    }
}
