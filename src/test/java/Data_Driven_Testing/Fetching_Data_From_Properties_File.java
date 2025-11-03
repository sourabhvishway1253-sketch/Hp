package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetching_Data_From_Properties_File {

	public static void main(String[] args) throws Throwable {
		 
		      
		        
		                  FileInputStream file = new FileInputStream("./src/test/resources/sAUCEDEMO.properties");
		                  
		                  Properties pro = new Properties();
		                  
		                  pro.load(file);
		                  
		                    String BROWSER = pro.getProperty("browser");
		                    String URL = pro.getProperty("URL");
		                    String USERNAME = pro.getProperty("USERNAME");
		                   String PASSWORD = pro.getProperty("PASSWORD");
		                   
		                   WebDriver driver;
		                   
		                   if (BROWSER.equalsIgnoreCase("chrome")) {
						       driver=new ChromeDriver();
						    } 
		                   else if (BROWSER.equalsIgnoreCase("Edge")) {
								 driver=new EdgeDriver();
							}
		                   
		                   else if (BROWSER.equalsIgnoreCase("Firefox")) {
							driver=new FirefoxDriver();
						}
		                   else  {
		                		driver=new FirefoxDriver();
						}
		                   
		                   driver.get(URL);
		                   
		                   driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		                   driver.findElement(By.id("password")).sendKeys(PASSWORD);
		                   driver.findElement(By.id("login-button")).click();
		        
	}

}
