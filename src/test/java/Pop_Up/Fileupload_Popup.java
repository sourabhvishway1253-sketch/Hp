package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload_Popup {

	public static void main(String[] args) throws Throwable {
		
		    WebDriver driver= new ChromeDriver();
		    
		    driver.get("https://www.foundit.in/uploadResume");
		    
		    driver.findElement(By.xpath("//div[contains(text(),\"Upload Resume\")]")).click();
		    
		    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\HP\\Desktop\\httpsgithub.comsourabh7772Framework.txt");
		    
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//input[@id=\"pop_upload\"]")).click();
		    
		    

	}

}
