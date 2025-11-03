package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetching_Single_Data_into_ExcelFile {

	public static void main(String[] args) throws Throwable {
		
		                     FileInputStream file = new FileInputStream("./src/test/resources/job.xlsx");
		                     
		                          Workbook book = WorkbookFactory.create(file);
		                          
		                              Sheet sheet = book.getSheet("Sheet1");
		                              
		                              Row row = sheet.getRow(1);
		                              
		                              Cell cell = row.getCell(0);
		                              
		                              DataFormatter format = new DataFormatter();
		                              
		                              
		                             String Exceldata =format.formatCellValue(cell);
		                              System.out.println(Exceldata);

	}

}
