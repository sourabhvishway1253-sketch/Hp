package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insert_Multiple_Data_To_ExcelSheet {

	public static void main(String[] args) throws Throwable {
	
		                     FileInputStream file = new FileInputStream("./src/test/resources/job.xlsx");
		                     
		                    Workbook book = WorkbookFactory.create(file);
		                    
		                   Sheet sheet = book.createSheet("Sheet3");
		                   
		                              WebDriver driver= new ChromeDriver();
		                              
		                              driver.get("https://www.amazon.in");
		                              
		                     List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		                     
		                     for (int i = 0; i <alllinks.size(); i++) {
								         Row row = sheet.createRow(i);
								         Cell cell = row.createCell(0);
								         cell.setCellValue(alllinks.get(i).getAttribute("href"));
							}
		                              
		               FileOutputStream foutput = new FileOutputStream("./src/test/resources/job.xlsx");
		               book.write(foutput);
		               book.close();
		                              
							
		                      
		                      

	}

}
