package stepDefinition;

import appPages.ClinicalManagementPage;
import appPages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.sql.DriverManager;

public class FirstTest {
LoginPage Lpage;
ClinicalManagementPage clinicalManagementPage;


 @Test
 public  void test() throws InterruptedException {

     driverManagement.DriverManager dm = new driverManagement.DriverManager();
     dm.initBrowser("Chrome");

    //Login
     Lpage=new LoginPage(driverManagement.DriverManager.getDriver());
     Lpage.loginToBahmni("superman","Admin123");

     //CM page
    clinicalManagementPage=new ClinicalManagementPage(driverManagement.DriverManager.getDriver());
    clinicalManagementPage.gotoClinicalManagementPage();


 }






}
