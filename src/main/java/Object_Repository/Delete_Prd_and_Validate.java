package Object_Repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_Prd_and_Validate {
	
	public Delete_Prd_and_Validate(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Products\"]")
	private WebElement ProductLink;
	
	@FindBy(xpath = "//input[@class=\"crmbutton small delete\"]")
	private WebElement DeleteLink;
	
	public void ClickProductLink()
	{
		ProductLink.click();
	}
	
	public void ClickDeleteLink()
	{
		DeleteLink.click();
	}
	
	public void clickProductName(WebDriver driver,String Productname)
	{
		 driver.findElement(By.xpath("//table[@class=\"lvt small\"]/tbody/tr//td//a[text()='"+Productname+"']/../preceding-sibling::td//input[@type=\"checkbox\"]")).click();
	}
	
	public void ValidatePrdDelete(WebDriver driver,String Productname)
	{
		 List<WebElement> productlist = driver.findElements(By.xpath("(//table[@class=\"lvt small\"]/tbody/tr//td[3])[position()>1]"));
	      
	      boolean flag=false;
	      
	      for (WebElement Productname1 : productlist) {
	    	  
	    	  String actdata = Productname1.getText();
	    	  
	    	  if (actdata.contains(Productname)) {
				flag=true;
				break;
			}
			
		}
	       
	      if (flag==false)
	      {
			System.out.println("PRODUCT DATA IS DELETED");
		  } 
	      
	      else {
	    	  System.out.println("PRODUCT DATA IS NOT  DELETED");
		}
	       
	}
}
