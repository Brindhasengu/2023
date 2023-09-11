package Selenium23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyContactForm {
    public static void main(String[] args)throws InterruptedException  {
WebDriver driver = new ChromeDriver();
driver.get("https://www.mycontactform.com/");
Thread.sleep(3000);
driver.manage().window().maximize();


//Click sample form


        WebElement sampleForms = driver.findElement(By.xpath("//*[@id=\"header\"]/ul/li[6]/a"));
        sampleForms.click();

        //Sub
WebElement subjectInput= driver.findElement(By.id("subject"));
subjectInput.sendKeys("SubjectHere");

//Mail id
        WebElement emailInput= driver.findElement(By.id("email"));
    emailInput.sendKeys("anbu@gmail.com");

    //
        WebElement textboxInput= driver.findElement(By.id("q1"));
       textboxInput.sendKeys("Text");

        //
        WebElement textboxMultilineInput= driver.findElement(By.id("q2"));
       textboxMultilineInput.sendKeys("Multipleline Text");

       //select Dropdown
        Select dropdown = new Select(driver.findElement(By.id("q3")));

         //WebElement radioButton1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr[7]/td/div[1]/input[1]"));
        // radioButton1.click();

       // WebElement radioButton2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr[7]/td/div[1]/input[2]"));
       // radioButton2.click();

        //
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr[7]/td/div[1]/input[3]"));
        radioButton3.click();

        //click check box
        WebElement checkbox = driver.findElement(By.id("q5"));
        checkbox.click();

        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[9]/td/div[1]/input[2]"));
        checkbox1.click();

        //select date picker
        WebElement Datepicker = driver.findElement(By.id("q7"));
                Datepicker.sendKeys("11-09-2023");
         //select countries
        Select countriesdropdown = new Select(driver.findElement(By.id("q8")));
        //


        //dropdown pre defined US State
        Select USstate = new Select(driver.findElement(By.id("q8")));
        USstate.selectByVisibleText("AK");

        //dropdown select countries
        Select Countries = new Select(driver.findElement(By.id("q9")));
        Countries.selectByVisibleText("Bel");
    }
}
