package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationOPen {
    WebDriver driver = new ChromeDriver();

    public void Test1()
    {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }


}
