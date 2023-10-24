package Selenium23;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.support.ui.Select;


import java.io.*;
import java.lang.reflect.Array;
import java.time.Duration;
public class AnnaExcelreading {



        public static void main(String[] args) throws IOException {
            FileInputStream fis;
            FileOutputStream fos;
            XSSFWorkbook workbook1;
            String path = "C:\\Brindha\\Excel reading file.xlsx";
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            fis = new FileInputStream(path);
            workbook1 = new XSSFWorkbook(fis);
            XSSFSheet sheet1 = workbook1.getSheetAt(0);
            String url = sheet1.getRow(1).getCell(20).getStringCellValue();
            driver.get(url.trim());
            driver.findElement(By.linkText("Sample Forms")).click();
            // clicking send to
            String sendto = sheet1.getRow(1).getCell(0).getStringCellValue();
            String sendtoarray[] = sendto.split(",");
            for (int i = 0; i < sendtoarray.length; i++) {
                {
                    driver.findElement(By.xpath("//input[@name='email_to[]'][@value='" + i + "']")).click();
//
                }
                //subject taking value
                String subject = sheet1.getRow(1).getCell(1).getStringCellValue();
                String email = sheet1.getRow(1).getCell(2).getStringCellValue();
                String txtboxfield = sheet1.getRow(1).getCell(3).getStringCellValue();
                String txtboxmultiline = sheet1.getRow(1).getCell(4).getStringCellValue();
                String dropdownopt = sheet1.getRow(1).getCell(5).getStringCellValue();
                String radiobtn = sheet1.getRow(1).getCell(6).getStringCellValue();
                String checkboxsingle = sheet1.getRow(1).getCell(7).getStringCellValue();
                String checkboxmultiple = sheet1.getRow(1).getCell(8).getStringCellValue();
                String DateSelect = sheet1.getRow(1).getCell(9).getStringCellValue();
                String usstates = sheet1.getRow(1).getCell(10).getStringCellValue();
                String country = sheet1.getRow(1).getCell(11).getStringCellValue();
                String province = sheet1.getRow(1).getCell(12).getStringCellValue();
                String title = sheet1.getRow(1).getCell(13).getStringCellValue();
                String firstname = sheet1.getRow(1).getCell(14).getStringCellValue();
                String lastname = sheet1.getRow(1).getCell(15).getStringCellValue();
                String dobmonth = sheet1.getRow(1).getCell(16).getStringCellValue();
                String dobday = sheet1.getRow(1).getCell(17).getStringCellValue();
                String dobyear = sheet1.getRow(1).getCell(18).getStringCellValue();
                String attachfile = sheet1.getRow(1).getCell(19).getStringCellValue();

                Select s = new Select(driver.findElement(By.xpath("//select[@id='q3']")));
                Select s2=new Select(driver.findElement(By.name("q8")));
                Select s3=new Select(driver.findElement(By.id("q9")));
                Select s4=new Select(driver.findElement(By.id("q10")));
                Select s5=new Select(driver.findElement(By.name("q11_title")));

                Select s6=new Select(driver.findElement(By.name("q12_month")));
                Select s7=new Select(driver.findElement(By.name("q12_day")));
                Select s8=new Select(driver.findElement(By.name("q12_year")));

                driver.findElement(By.id("subject")).sendKeys(subject.trim());
                driver.findElement(By.id("email")).sendKeys(email.trim());
                driver.findElement(By.id("q1")).sendKeys(txtboxfield.trim());
                driver.findElement(By.name("q2")).sendKeys(txtboxmultiline.trim());
                s.selectByVisibleText(dropdownopt.trim());

                driver.findElement(By.xpath("//input[@name='q4'][@value='"+radiobtn.trim()+"']")).click();
                WebElement sing= driver.findElement(By.id("q5"));
                sing.sendKeys(checkboxsingle);
                if (sing.isDisplayed()&&(!(sing.isSelected()))){
                    sing.click();
                }

                String muticheckbox[]= checkboxmultiple.split(",");
                for (int j=0;j<muticheckbox.length;j++)
                {
                    driver.findElement(By.xpath("//input[@name='checkbox6[]'][@value='"+muticheckbox[i].trim()+"']")).click();
                }
                driver.findElement(By.id("q7")).sendKeys(DateSelect.trim());
                driver.findElement(By.id("q7")).sendKeys(Keys.ESCAPE);
                s2.selectByValue(usstates.trim());
                s3.selectByVisibleText(country.trim());
                s4.selectByValue(province.trim());
                s5.selectByVisibleText(title.trim());
                driver.findElement(By.name("q11_first")).sendKeys(firstname.trim());
                driver.findElement(By.name("q11_last")).sendKeys(lastname.trim());
                s6.selectByVisibleText(dobmonth.trim());
                s7.selectByValue(dobday.trim());
                s8.selectByVisibleText(dobyear.trim());
                // driver.findElement(By.name("attach4589")).sendKeys("C:\\Users\\vasan\\OneDrive\\Documents\\fileupload\\"+attachfile.trim()+".txt");
                driver.findElement(By.name("attach4589")).sendKeys("C:\\Users\\vasan\\IdeaProjects\\vasanthiselenium\\src\\Attachment\\"+attachfile.trim()+".txt");

                TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
                File src=takesScreenshot.getScreenshotAs(OutputType.FILE);
                File tgt=new File(".\\screenms\\mspage.png");
                FileUtils.copyFile(src,tgt);


            }
        }
    }



