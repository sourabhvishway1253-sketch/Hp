package Data_Provider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;

public class Data_Provider_Ex02 {
	
	@Test(dataProvider = "readData")
	public void organization_module_Test(String orgname,String phoneNo,String email) throws Throwable
	{
		                    WebDriver driver = new ChromeDriver();
		                    
		                    driver.get("http://localhost:8888/");
		                    
		                    driver.findElement(By.name("user_name")).sendKeys("admin");
                            driver.findElement(By.name("user_password")).sendKeys("admin");
                            driver.findElement(By.id("submitButton")).click();
                            
                            driver.findElement(By.xpath("//a[text()=\"Organizations\"]")).click();
                            
                            driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();
                            
                            driver.findElement(By.name("accountname")).sendKeys(orgname);
                            
                            driver.findElement(By.id("phone")).sendKeys(phoneNo);
                            
                            driver.findElement(By.id("email1")).sendKeys(email);
                            driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
                            
                            Thread.sleep(2000);
                            
                                 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"))).click();
           
                        
           
                   WebElement sign_out = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=\"Sign Out\"]")));
   		                 
                   sign_out.click();
   		                
   		                                        
	}
	
	                     @DataProvider
                         public Object[][]readData()
                        {
       	                           Object[][] obj = new Object[3][3];
       	                           
       	                                   Java_Utility juti = new Java_Utility();
       	                                     int ranNum = juti.getRandumNumer();
       	                                     
       	                                  obj[0][0]="AAA"+ranNum;
       	                                  obj[0][1]="8888888888";
       	                                  obj[0][2]="abc@gmail.com";
       	                                  
       	                                  obj[1][0]="BBB"+ranNum;
    	                                  obj[1][1]="7777777777";
    	                                  obj[1][2]="DEF@gmail.com";
    	                                  
    	                                  obj[2][0]="CCC"+ranNum;
       	                                  obj[2][1]="9999999999";
       	                                  obj[2][2]="GHI@gmail.com";
       	                                  
       	                           
								return obj;
                        }

}
