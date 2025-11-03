package Campaign;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import Generic_Utility.Base_Class;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Mutliple_Webelements.Vtiger_Login_Page;
import Object_Repository.Create_Campaign_Page;
import Object_Repository.Home_Page;

public class Create_Campaign_With_ProductTest extends Base_Class {
//Pulling_Back
//Pull_One
	//Push_TWo
	//pULLING_bACK
	//Push_Three
	@Test(groups="regressionTest")
	public void Create_Campaign_With_ProductTest()  throws Throwable {
		
//	    FileInputStream file = new FileInputStream("./src/test/resources/Commandata.properties");
//      
//      Properties pro = new Properties();
//      
//      pro.load(file);
//      
//     String BROWSER = pro.getProperty("browser");
//     String URL = pro.getProperty("url");
//     String USERNAME = pro.getProperty("username");
//     String PASSWORD = pro.getProperty("password");
//     
		
		                 File_Utility futi = new File_Utility();
		                 Excel_Utility exuti = new Excel_Utility();
		                 Java_Utility juti = new Java_Utility();
		           
		                 
		                 String BROWSER = futi.getKeyAndValueData("browser");
		                 String URL = futi.getKeyAndValueData("url");
		                 String USERNAME = futi.getKeyAndValueData("username");
		                 String PASSWORD = futi.getKeyAndValueData("password");
		               
		                 
    
     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.get(URL);
     
//                Vtiger_Login_Page vti = new Vtiger_Login_Page(driver);
//                vti.getUserTextField().sendKeys(USERNAME);
//                vti.getPasswordTextField1().sendKeys(PASSWORD);
//                vti.getLoginButton().click();
     
     
                  Vtiger_Login_Page vti = new Vtiger_Login_Page(driver);
                  vti.loginToApp(USERNAME, PASSWORD);
     
//     driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//      driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//      driver.findElement(By.id("submitButton")).click();
      
    
              
              driver.findElement(By.xpath("//a[text()=\"Products\"]")).click();
              driver.findElement(By.xpath("//img[@alt=\"Create Product...\"]")).click();
              
              
              
                      //  Random ran = new Random();
                       //  int rannum = ran.nextInt(1000);
              
                                
                                
              
//              FileInputStream file1 = new FileInputStream("./src/test/resources/SingleData.xlsx");
//              
//                       Workbook book = WorkbookFactory.create(file1);
//                       
//                      Sheet sheet = book.getSheet("Product");
//                      
//                     Row row = sheet.getRow(0);
//                     
//                     Cell cell = row.getCell(0);
//                     
//                      String productname = cell.getStringCellValue()+rannum;
                                 
                                int rannum = juti.getRandumNumer();
                              String productname = exuti.getExcelData("Product", 0, 0)+rannum;
//                      
                      driver.findElement(By.name("productname")).sendKeys(productname);
                      
                      driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
                      
                      WebElement morelink = driver.findElement(By.linkText("More"));
                      
                  Actions act = new Actions(driver);
                  act.moveToElement(morelink).perform();
                   
                         
                      
                      driver.findElement(By.linkText("Campaigns")).click();
                      
                      driver.findElement(By.xpath("//img[@alt=\"Create Campaign...\"]")).click();
                      
                      
                      Excel_Utility exuti1 = new Excel_Utility();
                      
                      String Campaign = exuti1.getExcelData("Campaign", 0, 0)+rannum;
//                      FileInputStream filr = new FileInputStream("./src/test/resources/SingleData.xlsx");
//   
//                      Workbook book1 = WorkbookFactory.create(filr);
//  
//                        Sheet sheet1 = book1.getSheet("Campaign");
//  
//                      Row row1 = sheet1.getRow(0);
//  
//                      Cell cell1 = row1.getCell(0);
//  
//                      String Campaign = cell1.getStringCellValue()+rannum;
//                      System.out.println(Campaign);
 
                      driver.findElement(By.name("campaignname")).sendKeys(Campaign);
 
                      driver.findElement(By.xpath("//img[@src=\"themes/softed/images/select.gif\"]")).click();
                                                 
                    
                               Set<String> allwins = driver.getWindowHandles();
						           Iterator<String> it = allwins.iterator();
						           
							           while (it.hasNext()) {
									String win=it.next();
									
									driver.switchTo().window(win);
									
									String title=driver.getTitle();
									
									if (title.contains("Products&action"))
									{
										break;
									}
										
                                       									}
							           
							           driver.findElement(By.name("search_text")).sendKeys(productname);
							           driver.findElement(By.name("search")).click();
							           
							           driver.findElement(By.xpath("//a[text()='"+productname+"']")).click();
							           
							           
							           Set<String> allwins1 = driver.getWindowHandles();
							           
							          Iterator<String> it1 = allwins1.iterator();
							          
							         while (it1.hasNext()) {
							        	 String win1=it1.next();
							        	 driver.switchTo().window(win1);
							        	 String title1=driver.getTitle();
									
										
										if (title1.contains("Campaigns&action")) {
											break;
										}
									}
							         
							         driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
			                       
//			                            driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
//			                            
//			                            driver.findElement(By.linkText("Sign Out")).click();
		                   
     }
  		                               
                                 
                                
	}


