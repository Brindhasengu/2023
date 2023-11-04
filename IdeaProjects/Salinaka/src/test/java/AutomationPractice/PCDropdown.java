package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PCDropdown {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();
        driver.findElement(By.id("justAnInputBox")).click();
        //selectChoiceValues(driver,"choice");
        //selectChoiceValues(driver,"choice 2","choice 2 3","choice 5");
        //selectChoiceValues(driver,"all"
    }
 public static  void selectChoiceValues(WebDriver driver,String...value)
 {
     List<WebElement> choiceList=driver.findElements(By.xpath("//span[@class-'comboTreeItemTitle']"));
     if(!value[0].equalsIgnoreCase("all"));
     {
         for(WebElement item:choiceList)
         {
             String text=item.getText();
             for(String val:value)
             {
                 if(text.equals(val))
                 {
                     item.click();
                     break;

                 }
             }
         }
     }



 }
}