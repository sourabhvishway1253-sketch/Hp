package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insert_Data_Into_Properties_File {

	public static void main(String[] args) throws Throwable {
		
		
		                          Properties pro = new Properties();
		                          pro.setProperty("BROWSER", "CHROME");
		                          pro.setProperty("USERNAME", "performance_glitch_user");
		                          pro.setProperty("PASSWORD", "secret_sauce");
		                          pro.setProperty("URL", "https://www.saucedemo.com/v1/");
		                          
		                     FileOutputStream fot = new FileOutputStream("./src/test/resources/sAUCEDEMO.properties");
		                     pro.store(fot, "CommonData");
		                     
	
		               FileInputStream file = new FileInputStream("./src/test/resources/sAUCEDEMO.properties");
		               
		                       Properties pro1 = new Properties();
		                       pro1.load(file);
		                       
		                      String BROWSER = pro1.getProperty("BROWSER");
		                      String URL = pro1.getProperty("URL");
		                      String USERNAME = pro1.getProperty("USERNAME");
		                      String PASSWORD = pro1.getProperty("PASSWORD");
		                      
		                              WebDriver driver = new ChromeDriver();
		                              
		                              driver.get(URL);
		                              
		                              driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		   		                   driver.findElement(By.id("password")).sendKeys(PASSWORD);
		   		                   driver.findElement(By.id("login-button")).click();
		                 
		                        

	}

}
