package Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Mutliple_Webelements.Vtiger_Login_Page;
import Object_Repository.Delete_Prd_and_Validate;
import Object_Repository.Validation_Page;

public class Create_Product_and_Delete_The_ProductTest extends Base_Class {

	@Test(groups={"smokeTest","regressionTest","sanityTest"})
	public void Create_Product_and_Delete_The_ProductTest() throws Throwable {
		
		 WebDriver   driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//		 FileInputStream file = new FileInputStream("./src/test/resources/url httplocalhost8888.properties");
//		  
//         Properties pro = new Properties();
//         
//         pro.load(file);
//         
//         String BROWSER = pro.getProperty("browser");
//         String URL=pro.getProperty("url");
//         String USERNAME = pro.getProperty("username");
//         String PASSWORD= pro.getProperty("password");
         
		                          File_Utility futi = new File_Utility();
		                         String URL = futi.getKeyAndValueData("url");
		                         String USERNAME = futi.getKeyAndValueData("username");
		                         String PASSWORD = futi.getKeyAndValueData("password");
		                         
             
              
             
              
              driver.get(URL);
              
                            Vtiger_Login_Page login = new Vtiger_Login_Page(driver);
                            login.getUserTextField().sendKeys(USERNAME);
                            login.getPasswordTextfield().sendKeys(PASSWORD);
                            login.getLoginButton().click();
//              driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//              driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//              driver.findElement(By.id("submitButton")).click();
              
              driver.findElement(By.xpath("//a[text()=\"Products\"]")).click();
              
              driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
              
              Java_Utility juti = new Java_Utility();
              int rannum = juti.getRandumNumer();
              
//              Random ran = new Random();
//              int rannum=ran.nextInt(1000);

                          Excel_Utility exuti = new Excel_Utility();
                          String Productname = exuti.getExcelData("Product", 0, 0)+rannum;
//          FileInputStream file1 = new FileInputStream("./src/test/resources/Common_Data.xlsx");
//   
//          Workbook book = WorkbookFactory.create(file1);
//
//       Sheet sheet = book.getSheet("Product");
//       
//          Row row = sheet.getRow(0);		
//          
//          Cell cell = row.getCell(0);
//          
//          
//       String Productname = cell.getStringCellValue()+rannum;
       System.out.println(Productname);
       
       driver.findElement(By.name("productname")).sendKeys(Productname);
       
       driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
       
       Thread.sleep(2000);
       
                     Delete_Prd_and_Validate deleteprd = new Delete_Prd_and_Validate(driver);
                    		 deleteprd.ClickProductLink();
       //driver.findElement(By.xpath("//a[text()=\"Products\"]")).click();
       
     //  driver.findElement(By.xpath("//table[@class=\"lvt small\"]/tbody/tr//td//a[text()=\"Product No\"]/../preceding-sibling::td//input[@type=\"checkbox\"]")).click();
       
                     deleteprd.clickProductName(driver, Productname);
     //  driver.findElement(By.xpath("//table[@class=\"lvt small\"]/tbody/tr//td//a[text()='"+Productname+"']/../preceding-sibling::td//input[@type=\"checkbox\"]")).click();
       
                     deleteprd.ClickDeleteLink();
     //  driver.findElement(By.xpath("//input[@class=\"crmbutton small delete\"]")).click();
       
       Alert alt = driver.switchTo().alert();
       alt.accept();
       
       Thread.sleep(2000);
       
       driver.navigate().refresh();
       
       deleteprd.ValidatePrdDelete(driver, Productname);            
//      List<WebElement> productlist = driver.findElements(By.xpath("(//table[@class=\"lvt small\"]/tbody/tr//td[3])[position()>1]"));
//      
//      boolean flag=false;
//      
//      for (WebElement Productname1 : productlist) {
//    	  
//    	  String actdata = Productname1.getText();
//    	  
//    	  if (actdata.contains(Productname)) {
//			flag=true;
//			break;
//		}
//		
//	}
//       
//      if (flag==false)
//      {
//		System.out.println("PRODUCT DATA IS DELETED");
//	  } 
//      
//      else {
//    	  System.out.println("PRODUCT DATA IS NOT  DELETED");
//	}
//       
       
                    
      driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();                     
      driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();         
	}

}
