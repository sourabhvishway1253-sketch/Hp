package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Pop_up {

	public static void main(String[] args) {
	
		     WebDriver  driver= new ChromeDriver();
		     
		     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		     
		    // driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		     
//		            Alert alt = driver.switchTo().alert();
//		         //   alt.accept();
//		            alt.dismiss();
////		            String txt = alt.getText();
////		            System.out.println(txt);
//		            
//                  driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
//		     
//		                 Alert alt = driver.switchTo().alert();
//		                 
//		                 //alt.accept();
//		                 alt.dismiss();
		     
		     
		            driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		             Alert alt = driver.switchTo().alert();
		             alt.sendKeys("Qspiders");
		             alt.accept();
	}

}
