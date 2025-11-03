package Organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Mutliple_Webelements.Vtiger_Login_Page;
import Object_Repository.Validation_Page;

public class Create_OrganizationTest extends Base_Class {

	@Test(groups="sanityTest")
	public void Create_OrganizationTest() throws Throwable {
		
		                 WebDriver   driver= new ChromeDriver();
		                 
		                 
//		  FileInputStream file = new FileInputStream("./src/test/resources/url httplocalhost8888.properties");
//		  
//		                            Properties pro = new Properties();
//		                            
//		                            pro.load(file);
//		                            
//		                            String BROWSER = pro.getProperty("browser");
//		                            String URL=pro.getProperty("url");
//		                            String USERNAME = pro.getProperty("username");
//		                            String PASSWORD= pro.getProperty("password");
//		                            
		                              
		                                File_Utility futi = new File_Utility();
		                                String URL = futi.getKeyAndValueData("url");
		                                String USERNAME = futi.getKeyAndValueData("username");
		                                String PASSWORD = futi.getKeyAndValueData("password");
		                                 driver.get(URL);
		                                 
		                                Vtiger_Login_Page login = new Vtiger_Login_Page(driver);
		                                login.getUserTextField().sendKeys(USERNAME);
		                                login.getPasswordTextfield().sendKeys(PASSWORD);
		                                login.getLoginButton().click();
//		                                 driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//		                                 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		                                 driver.findElement(By.id("submitButton")).click();
		                                 
		                                 driver.findElement(By.xpath("//a[text()=\"Organizations\"]")).click();
		                                 
		                                 driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();
		                                 
		                                             Java_Utility juti = new Java_Utility();
		                                            int rannum = juti.getRandumNumer();
		                                 
//		                                       Random ran = new Random();
//		                                       int rannum=ran.nextInt(1000);
//		                                       
//		                   FileInputStream file1 = new FileInputStream("./src/test/resources/Common_Data.xlsx");
//		                            
//		                      Workbook book = WorkbookFactory.create(file1);
//		                      
//		                                Sheet sheet = book.getSheet("Organization");
//		                                
//		                                   Row row = sheet.getRow(0);		
//		                                   
//		                                   Cell cell = row.getCell(0);
//		                                   
//		                                   
//		                                String Orgname = cell.getStringCellValue()+rannum;
		                                            
		                                  Excel_Utility exuti = new Excel_Utility();
		                                  String Orgname = exuti.getExcelData("Organization", 0, 0)+rannum;
		                                  System.out.println(Orgname);
		                                
		                                driver.findElement(By.name("accountname")).sendKeys(Orgname);
		                                
		                                
//		                                Row row1 = sheet.getRow(1); 
//		                                Cell cell1 = row1.getCell(0);
//		                                       
//		                                        DataFormatter format = new DataFormatter();
//		                                      String phnum = format.formatCellValue(cell1)+rannum;
		                                
		                               String phnum = exuti.getExcelDataUsingFormatter("Organization", 1, 0)+rannum;   
		                                
		                                      driver.findElement(By.id("phone")).sendKeys(phnum);
		                                      
		                                      String Emailid = exuti.getExcelData("Organization", 2, 0)+rannum;
//		                                      Row row2 = sheet.getRow(2); 
//				                                Cell cell2 = row2.getCell(0);  
//				                                
//				                                String Emailid = cell2.getStringCellValue()+rannum;
				                                driver.findElement(By.id("email1")).sendKeys(Emailid);
				                                
				                                driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
				                                
				                                Thread.sleep(2000);
				                                
//				    String actData = driver.findElement(By.id("dtlview_Organization Name")).getText();
//				    
//				    if (actData.contains(Orgname))
//				    {
//						System.out.println("Organization name is created");
//					} 
//				    
//				    else
//				    {
//				    	System.out.println("Organization name is not created");
//					}
//				                 
				                                Validation_Page validationpage = new Validation_Page(driver);
				                                validationpage.ValidateOrganizationPage(driver, Orgname);
				    
				           driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();                     
		                 driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();                     
		                                        
		   

	}

}
