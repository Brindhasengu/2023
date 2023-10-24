package Selenium23;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelReading {
    public static void main(String[] args) {
        String filename = "C:\\Brindha\\Excel reading file.xlsx";
        System.out.println(filename);
        File file = new File(filename);
        Workbook wb;
        try (FileInputStream fis = new FileInputStream(file)) {
            // Create a excel workbook from the file stream
            wb = WorkbookFactory.create(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Get the sheet within the workbook we are interested in.
        org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("sheet1");

        // Read rows and columns from the sheet
        int rowsCount  =  sheet.getLastRowNum() + 1;
        Row row0 = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0);
        int columnsCount = row0.getLastCellNum();
        System.out.println(rowsCount);
        System.out.println(columnsCount);

        //DataFormatter Gets the value from the cell in a required format
        DataFormatter formatter = new DataFormatter();

        String[][] testData = new String[rowsCount][columnsCount];

        for(int i = 0; i < rowsCount ; i++){
            System.out.println(" ");
            for(int j = 0 ; j < columnsCount ; j++)	{
                Cell temp = sheet.getRow(i).getCell(j);
                testData[i][j] = formatter.formatCellValue(temp);

                String paddedData = padRightSpace(testData[i][j], 10);
                System.out.print( paddedData);
            }
        }

    }

    public static String padRightSpace(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append(' ');
        }
        sb.append(inputString);

        return sb.toString();
    }
}
