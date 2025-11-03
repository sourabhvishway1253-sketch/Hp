package Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
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
import Object_Repository.Create_Product_Page;
import Object_Repository.Home_Page;
import Object_Repository.Validation_Page;

public class Create_ProductTest extends Base_Class{

	@Test(groups={"sanityTest","smokeTest"})
	public void Create_ProductTest() throws Throwable {

		
		WebDriver   driver= new ChromeDriver();
//		  FileInputStream file = new FileInputStream("./src/test/resources/url httplocalhost8888.properties");
//		  
//          Properties pro = new Properties();
//          
//          pro.load(file);
//          
//          String BROWSER = pro.getProperty("browser");
//          String URL=pro.getProperty("url");
//          String USERNAME = pro.getProperty("username");
//          String PASSWORD= pro.getProperty("password");
		
		                  File_Utility futi = new File_Utility();
		                 String URL = futi.getKeyAndValueData("url");
		                 String USERNAME= futi.getKeyAndValueData("username");
		                 String PASSWORD = futi.getKeyAndValueData("password");
		                 
          
                        Home_Page home = new Home_Page(driver);
                       
               driver.get(URL);
                   Vtiger_Login_Page login = new Vtiger_Login_Page(driver);
                   login.getUserTextField().sendKeys(USERNAME);
                   login.getPasswordTextfield().sendKeys(PASSWORD);
                   login.getLoginButton().click();
               
//               driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//               driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//               driver.findElement(By.id("submitButton")).click();
                     Create_Product_Page prdPage = new Create_Product_Page(driver);
                     home.ClickProductLink();
              // driver.findElement(By.xpath("//a[text()=\"Products\"]")).click();
               prdPage.productplusSign();
              // driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
               
                   Java_Utility juti = new Java_Utility();
                   int rannum = juti.getRandumNumer();
               
//               Random ran = new Random();
//               int rannum=ran.nextInt(1000);
               
//           FileInputStream file1 = new FileInputStream("./src/test/resources/Common_Data.xlsx");
//    
//           Workbook book = WorkbookFactory.create(file1);
//
//        Sheet sheet = book.getSheet("Product");
//        
//           Row row = sheet.getRow(0);		
//           
//           Cell cell = row.getCell(0);
//           
//           
//        String Productname = cell.getStringCellValue()+rannum;

                          Excel_Utility exuti = new Excel_Utility();
                      
                          String Productname = exuti.getExcelData("Product",0 , 0)+rannum;
                          prdPage.enterProductName(Productname);   
       // driver.findElement(By.name("productname")).sendKeys(Productname);
        prdPage.ClickSavebutton();
       // driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
        
        Thread.sleep(2000);
        
                             Validation_Page validationpage = new Validation_Page(driver);
                             validationpage.ValidateProductPage(driver, Productname);
        
//        String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_Product Name\"]")).getText();
//        
//        if (actData.contains(Productname)) {
//			System.out.println("The Product name is created");
//		} else {
//           System.out.println("The Product name is not created");
//		}
        
         home.ClickAdminImg();
         home.SignOut();
        
//        driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();                     
//        driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();         
	}

}
