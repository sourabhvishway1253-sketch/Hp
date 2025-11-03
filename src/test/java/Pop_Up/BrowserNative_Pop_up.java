package Pop_Up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNative_Pop_up {

	public static void main(String[] args) {
		
		
		                  ChromeOptions opt = new ChromeOptions();
		                  opt.addArguments("--disable-notifications");
	
		          WebDriver  driver= new ChromeDriver(opt);
		          
		          driver.get("https://www.irctc.co.in/nget/train-search");
		          
		          

	}

}
