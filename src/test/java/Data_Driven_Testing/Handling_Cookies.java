package Data_Driven_Testing;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Cookies {

	public static void main(String[] args) {
		
		                  WebDriver   driver= new ChromeDriver();
		                  driver.get("https://www.facebook.com");
		                  driver.manage().window().maximize();
		                  
		                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		                
		                            Set<Cookie> cookies = driver.manage().getCookies();
		                            
		                            for (Cookie cookie : cookies) 
		                            {
										System.out.println("Cookies_Name"+cookie.getName()+"\t"+"Cookies_Value"+cookie.getValue());
									}
		                            
		                            
		                            driver.manage().deleteAllCookies();
		                            
		                            if (driver.manage().getCookies().isEmpty()) 
		                            {
										System.out.println("Cookies are deleted");
									} 
		                            else 
		                            {
                                        System.out.println("Cookies are not deleted");
									}
	}

}
