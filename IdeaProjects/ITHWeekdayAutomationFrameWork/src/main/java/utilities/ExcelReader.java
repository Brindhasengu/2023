package utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) throws IOException {
        //Read xlsx path
        String fullPath = (System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\RegPatients.xlsx");
        FileInputStream input = new FileInputStream(fullPath);
//provide file path to workbook as a reference
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        //Read sheet
        Sheet sheet = workbook.getSheetAt(0);

        System.out.println("Number of Rows in Excel data::" + sheet.getPhysicalNumberOfRows());
        // System.out.println("Number of colums::" + row.getPhysicalNumberOfCells());


        }
    }
