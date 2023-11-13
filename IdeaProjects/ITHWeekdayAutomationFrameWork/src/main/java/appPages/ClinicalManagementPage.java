package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ClinicalManagementPage {
    public WebDriver driver;
    public ClinicalManagementPage(WebDriver driver){
        this.driver=driver;

    }
    public  void gotoClinicalManagementPage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("bahmni.clinical")).click();
        Thread.sleep(3000);


        // Check that we have a home button
        WebElement homeButton = driver.findElement( By.className("back-btn"));
        Assert.assertNotNull(homeButton);

        // Check that we have an "All" tab
        WebElement allTab = driver.findElement( By.xpath("//*[@id=\"view-content\"]/div[2]/div/div[1]/div/ng-transclude/ul/li[2]/a/span"));
        Assert.assertEquals(allTab.getText(), "All");

        // Check that we have an "Active" tab
        WebElement activeTab = driver.findElement( By.xpath("//*[@id=\"view-content\"]/div[2]/div/div[1]/div/ng-transclude/ul/li[1]/a/span[1]"));
        Assert.assertEquals(activeTab.getText(), "Active");

        //check that we have an input box tab
        WebElement inputBox = driver.findElement( By.id("patientIdentifier"));
        Assert.assertNotNull(inputBox);

    }
}
