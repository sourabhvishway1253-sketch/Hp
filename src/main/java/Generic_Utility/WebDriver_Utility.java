package Generic_Utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility {
	
	
	/**
	 * This method is used to maximize the window
	 * @author HP
	 * @param driver
	 */
	public void windowMaximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	
	/**
	 * This method is used to load the element
	 * @param driver
	 */
	
	public void PageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	/**
	 * This method is used to place cursor on specified element
	 * @author HP
	 * @param driver
	 * @param element
	 */
	public void MoveToElement(WebDriver driver,WebElement element)
	{
	                Actions act = new Actions(driver);
	                act.moveToElement(element).perform();
	}
	
	public void switchToWindow(WebDriver driver,String PartialWindowTitle)
	{
		Set<String> allWins = driver.getWindowHandles();
          
          Iterator<String> it = allWins.iterator();
          
        while (it.hasNext()) {
          String win = it.next();
          driver.switchTo().window(win);
          String title = driver.getTitle();

          if (title.contains("Products&action=Popup&html")) {
              
              driver.findElement(By.name("search_txt")).sendKeys(PartialWindowTitle);
              driver.findElement(By.name("search")).click();
              break;
          }
      }
	}
}

