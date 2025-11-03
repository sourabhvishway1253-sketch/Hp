package Data_Driven_Testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.tess4j.Tesseract;

public class Handling_CaptchaEx {

	public static void main(String[] args) throws Throwable {
	
		                   ChromeOptions opt = new ChromeOptions();
		                   opt.addArguments("--disable-notifications");
		        
		                  WebDriver driver= new ChromeDriver(opt);
		                  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		                  driver.get("https://www.irctc.co.in/nget/train-search");
		                  driver.manage().window().maximize();
		                  
		                  driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();
		        
		                 driver.findElement(By.xpath("//a[text()=\" LOGIN \"]")).click(); 
		                 
		      WebElement captch = driver.findElement(By.xpath("//img[@class=\"captcha-img\"]"));
		      
		              TakesScreenshot ts = (TakesScreenshot)captch;
		             File src = ts.getScreenshotAs(OutputType.FILE);
		             File dest = new File("./Captcha.png");
		             FileUtils.copyFile(src, dest);
		             
		                       Tesseract test = new Tesseract();
		                       test.setDatapath("C:\\Users\\HP\\Downloads\\Tess4J-3.4.8-src (1)\\Tess4J\\tessdata");
		                       String tss = test.doOCR(dest);
		                       String img = tss.replace(" ", "");
		                       System.out.println(img);
		                       driver.findElement(By.xpath("//input[@id=\"captcha\"]")).sendKeys(img);
	}

}
