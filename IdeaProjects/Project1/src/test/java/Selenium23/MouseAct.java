package Selenium23;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseAct {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement move = driver.findElement(By.id("windowhandling1"));
        WebElement move2 = driver.findElement(By.name("list_box_name[]"));
        WebElement dblclick = driver.findElement(By.id("doubleClickBtn"));
        WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
        Actions act = new Actions(driver);
        act.doubleClick(dblclick).build().perform();

        //Accept alert
        Thread.sleep(200);
        driver.switchTo().alert().accept();

		act.moveToElement(move).doubleClick(dblclick).build().perform();
        driver.switchTo().alert().accept();

        act.moveToElement(move2).doubleClick(dblclick).build().perform();
        driver.switchTo().alert().accept();

        act.doubleClick(dblclick).build().perform();

        WebElement email = driver.findElement(By.id("email"));
        WebElement right = driver.findElement(By.id("rightClickBtn"));

        //act.contextClick(email).build().perform();
        //Thread.sleep(8000);

        //act.contextClick(right).build().perform();
        //Thread.sleep(8000);
        }
    }


