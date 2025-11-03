package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Multiple_Data_From_Excel {

	public static void main(String[] args) throws Throwable {

		                 FileInputStream FileIn = new FileInputStream("./src/test/resources/job.xlsx");
		                 
		                    Workbook book = WorkbookFactory.create(FileIn);
		                    
		                    Sheet sheet = book.getSheet("Sheet3");
		                    
		                    int rownum= sheet.getLastRowNum();
		                    System.out.println(rownum);
                            
		                    
		                    for (int i = 0; i <rownum; i++) {
								    Row row = sheet.getRow(i);
								    
								    for (int j = 0; j < row.getLastCellNum(); j++) {
										
								    	    Cell cell = row.getCell(j);
								    	    String links = cell.getStringCellValue();
								    	    System.out.println(links);
									}
							}
	}

}
