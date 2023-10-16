package Se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectItem
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.smartbazaar.co.uk/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //click x mark
        WebElement popup = driver.findElement(By.xpath("//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img"));
    popup.searchbox.sendKeys("Fresh Fruits");click();
    //
        WebElement searchbox= driver.findElement(By.className( "aws-search-field"));


        //click list of item
        Thread.sleep(3000);
        List<WebElement> itemlist = driver.findElements(By.className("aws_result_item"));
        for(int i=0 ; i<itemlist.stream().count() ; i++) {
            if (itemlist.get(i).getText().contains("Fresh Peanuts in Shell (250g)"))
            {
                itemlist.get(i).click();
            }

        }
       // WebElement subjectInput= driver.findElement(By.id("subject"));
      //  subjectInput.sendKeys("SubjectHere");
    }
}
