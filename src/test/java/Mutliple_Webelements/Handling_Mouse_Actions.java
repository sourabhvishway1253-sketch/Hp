package Mutliple_Webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Mouse_Actions {

	public static void main(String[] args) throws Throwable {
		
		      WebDriver  driver= new ChromeDriver();
		      
		     // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		      
		      driver.get("https://www.amazon.in");
		      
		    //  driver.manage().window().maximize();
		      
		      WebElement productname = driver.findElement(By.id("twotabsearchtextbox"));
		      
		                  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		                  wait.until(ExpectedConditions.elementToBeClickable(productname));
		                  productname.sendKeys("puma");
		      
		     
		      
		      
		     
		      
		   

		      
	    
	     
		
		
		
              
			
	
		
		
		
			
		      
	
		      
		      
		      
		     
		   
                                  
	     
	}

}






