package Generic_Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{

	
	public void onTestFailure(ITestResult result) {
		
		     
		
		         TakesScreenshot ts = (TakesScreenshot)Base_Class.sdriver;
		         File src = ts.getScreenshotAs(OutputType.FILE);
		         File dest = new File("Failed.png");
		         try {
					FileUtils.copyFile(src, dest);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
	}
	
	
	

}
