package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Insert_Data_Into_Excel {

	public static void main(String[] args) throws Throwable {
	
		
		                FileInputStream file = new FileInputStream("./src/test/resources/job.xlsx");
		                
		                      Workbook book = WorkbookFactory.create(file);
		                      
		                     Sheet sheet = book.createSheet("Sheet2");
		                     
		                     Row row = sheet.createRow(0);
		                     
		                     Cell cell = row.createCell(0);
		                     
		                      cell.setCellValue("Software_Engineer");
		                      
		                 FileOutputStream fole = new FileOutputStream("./src/test/resources/job.xlsx");
		                 
		                 book.write(fole);
		                 book.close();
		                 

	}

}
