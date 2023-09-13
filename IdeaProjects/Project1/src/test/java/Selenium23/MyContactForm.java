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


        // Checkbox for marketing dept
        WebElement addressToCheckbox = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr[1]/td/div/input[1]"));
        addressToCheckbox.click();

        //choose Sub
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

        //dropdown pre defined US State
        Select USstate = new Select(driver.findElement(By.id("q8")));
        USstate.selectByVisibleText("AK");

        //dropdown select countries
        Select Countries = new Select(driver.findElement(By.id("q9")));
        Countries.selectByVisibleText("Belgium");
//pc
        // drop down select Title
        Select title = new Select(driver.findElement(By.name("q11_title")));
        title.selectByVisibleText("Mrs.");
        //Firstname
        WebElement Firstname=  driver.findElement(By.name("q11_first"));
       Firstname.sendKeys("sengu");

        WebElement Lastname=  driver.findElement(By.name("q11_last"));
       Lastname.sendKeys("Sen");

       //Select  DOB
        Select month = new Select(driver.findElement(By.name("q12_month")));
      month.selectByVisibleText("9");
      //Day
        Select day = new Select(driver.findElement(By.name("q12_day")));
        day.selectByVisibleText("9");
        //year
        Select year = new Select(driver.findElement(By.name("q12_year")));
        year.selectByVisibleText("2000");

        // Click choose file and Attached
        //WebElement chooseFileButton =  driver.findElement(By.name("attach4589"));
        //chooseFileButton.click();

        driver.findElement(By.id("attach4589")).sendKeys("c://temp//test.txt");
        //driver.findElement(By.name("file-submit")).submit();

        Thread.sleep(10000);

        WebElement submitButton = driver.findElement(By.name("submit"));
submitButton.click();

       /*if(driver.getPageSource().contains("File Uploaded!")) {
            System.out.println("file uploaded");
        }
        else{
            System.out.println("file not uploaded");
        }

        */
    }
}
