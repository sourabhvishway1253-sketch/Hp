package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Validation_Page {
	
	public Validation_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateCampPage(WebDriver driver,String Campname)
	{
		   String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_Campaign Name\"]")).getText();
		         
		         if (actData.contains(Campname))
		         {
				System.out.println("The Campaign is created");
			}
		         
		         else 
		         {
		        	System.out.println("The Campaign is not created");
			}
		         
	}
	
	public void ValidateProductPage(WebDriver driver,String Productname)
	{
		 String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_Product Name\"]")).getText();
	        
	        if (actData.contains(Productname)) {
				System.out.println("The Product name is created");
			} else {
	           System.out.println("The Product name is not created");
			}
	}
	
	public void ValidateOrganizationPage(WebDriver driver,String Orgname)
	{
		 String actData = driver.findElement(By.id("dtlview_Organization Name")).getText();
		    
		    if (actData.contains(Orgname))
		    {
				System.out.println("Organization name is created");
			} 
		    
		    else
		    {
		    	System.out.println("Organization name is not created");
			}
		                 
	}
	
	      

}
