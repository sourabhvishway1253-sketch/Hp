package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	public String getExcelData(String sheetname,int rowNum, int cellNum) throws Throwable
	
	{
		
		  FileInputStream file1 = new FileInputStream(IpathConstant.ExcelPath);
		    
          Workbook book = WorkbookFactory.create(file1);

       Sheet sheet = book.getSheet(sheetname);
       
          Row row = sheet.getRow(rowNum);		
          
          Cell cell = row.getCell(cellNum);
          
          
       String ExcelData = cell.getStringCellValue();
	       return ExcelData;
       
	}
	
	public String getExcelDataUsingFormatter(String sheetname,int rowNum, int cellNum) throws Throwable
	{
		 FileInputStream file1 = new FileInputStream(IpathConstant.ExcelPath);
		    
         Workbook book = WorkbookFactory.create(file1);

          Sheet sheet = book.getSheet(sheetname);
      
		 Row row1 = sheet.getRow(rowNum); 
         Cell cell1 = row1.getCell(cellNum);
                
                 DataFormatter format = new DataFormatter();
               String excelData = format.formatCellValue(cell1);
			return excelData;
               
	}

}
