package Generic_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Object_Repository.Home_Page;
import Object_Repository.Vtiger_Login_Page;

public class Base_Class {
	public WebDriver driver;
	public static WebDriver sdriver;
	@BeforeSuite(groups={"smokeTest","regressionTest","sanityTest"})
	public void BS()
	{
		System.out.println("Database Open");
	}
	
	@BeforeTest(groups={"smokeTest","regressionTest","sanityTest"})
	public void BT()
	{
		System.out.println("Parellel Execution");
	}
	
	//@Parameters("BROWSER")
    @BeforeClass(groups={"smokeTest","regressionTest","sanityTest"})
	//public void BC(String BROWSER) throws Throwable{
    	public void BC() throws Throwable{
    	  File_Utility futi = new File_Utility();
    	 String BROWSER = futi.getKeyAndValueData("browser");
    	  if (BROWSER.equalsIgnoreCase("CHROME")) {
		       driver=new ChromeDriver();
		    } 
          else if (BROWSER.equalsIgnoreCase("Edge")) {
        	  
				 driver=new EdgeDriver();
			}
          
          else if (BROWSER.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
          else  {
       		driver=new FirefoxDriver();
		}
          
		System.out.println("Launching The Browser");
		sdriver=driver;
	}

    @BeforeMethod(groups={"smokeTest","regressionTest","sanityTest"})
	public void BM() throws Throwable
	{
    	  WebDriver_Utility wduti = new WebDriver_Utility();
          wduti.windowMaximize(driver);
          wduti.PageToLoad(driver);
       File_Utility futi = new File_Utility();
       String BROWSER = futi.getKeyAndValueData("browser");
        String URL = futi.getKeyAndValueData("url");
       String USERNAME= futi.getKeyAndValueData("username");
        String PASSWORD = futi.getKeyAndValueData("password");
                  
         driver.get(URL);
   
             Vtiger_Login_Page login = new Vtiger_Login_Page(driver);
             login.logintoVtiger(USERNAME, PASSWORD);
             
		System.out.println("Login To App");
	}
    @AfterMethod(groups={"smokeTest","regressionTest","sanityTest"})
	public void AM()
	{
        Home_Page home = new Home_Page(driver);
       
        home.ClickAdminImg();
	         home.SignOut();
		System.out.println("Logout To App");
	}
    @AfterClass(groups={"smokeTest","regressionTest","sanityTest"})
	public void AC()
	{
    	driver.quit();
		System.out.println("Closing The Browser");
	}
    @AfterTest(groups={"smokeTest","regressionTest","sanityTest"})
	public void AT()
	{
		System.out.println("Parellel Execution");
	}
     @AfterSuite(groups={"smokeTest","regressionTest","sanityTest"})
	public void AS()
	{
		System.out.println("Database Close");
	}


}
