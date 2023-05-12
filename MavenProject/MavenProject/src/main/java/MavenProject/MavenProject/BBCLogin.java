package MavenProject.MavenProject;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.Assert;
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.w3c.dom.events.EventException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class BBCLogin {

	
	
	
	public static void main(String args[]) throws EventException, IOException
	{
		LoadTestData();
	}
	
		private static void LoadTestData() throws EventException, IOException {
		// Work out the location of the xls file
		String filename = "C:\\Brindha\\Excel reading Data.xlsx";
		System.out.println(filename);
		
		// Open the file into a stream
		File file = new File(filename);
		FileInputStream fis = new FileInputStream(file);
		
		// Create a excel workbook from the file stream
		Workbook wb = WorkbookFactory.create(fis);
		
		// Get the sheet within the workbook we are interested in.
		Sheet sheet = wb.getSheet("sheet1");
		
		// Read rows and columns from the sheet
		int maxRowNumber = sheet.getLastRowNum() + 1;
		Row row0 = sheet.getRow(0);
		int maxColumnNumber = row0.getLastCellNum();
		System.out.println(maxRowNumber);
		System.out.println(maxColumnNumber);
		
		DataFormatter formatter = new DataFormatter();
		
		String[][] testData = new String[maxRowNumber + 1][maxColumnNumber + 1];
		
		for(int i = 1; i <= maxRowNumber ; i++){
			for(int j = 0 ; j < maxColumnNumber ; j++)	{
				
				testData[i][j] = formatter.formatCellValue(sheet.getRow(i).getCell(j));
				
				System.out.println(testData[i][j]);
			}
		}
		
	}

	

}

