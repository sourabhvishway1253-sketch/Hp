package Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;

import Object_Repository.Create_Campaign_Page;
import Object_Repository.Create_Product_Page;
import Object_Repository.Home_Page;
import Object_Repository.Validation_Page;
import Object_Repository.Vtiger_Login_Page;

@Listeners(Generic_Utility.ListenerImplementation.class)
public class Create_CampaignTest extends Base_Class {

	@Test(retryAnalyzer =Generic_Utility.RetryImp.class )
	public void Create_CampaignTest() throws Throwable {
		// Pulling Back
         //Push Two
		//Pull Two


                           Home_Page home = new Home_Page(driver);
                           home.ClickMorelinkk();
                           home.ClickCampaignlink();

                           
                              Create_Campaign_Page campPage = new Create_Campaign_Page(driver);
                              campPage.ClickCampPlusSign();
                         
                             Java_Utility juti = new Java_Utility();
                             int rannum = juti.getRandumNumer();
                             
                            
                             

   		                                
                                      Excel_Utility exuti = new Excel_Utility();
                                      String Campname = exuti.getExcelData("Campaign", 0, 0)+rannum;
                                      System.out.println(Campname);
                                      
                                      campPage.EnterCampaignName(Campname);
   		                              
                                      campPage.ClickonSaveButton();
   		                           
   		                             
   		                             
   		                             
   		                             Thread.sleep(2000);
   		                             
//   		                          Validation_Page validationpage = new Validation_Page(driver);
//   		                          validationpage.ValidateCampPage(driver, Campname);
                                      
   		          String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_Campaign Name\"]")).getText();
   		          Assert.assertEquals(actData, Campname);
   		                             
//   		         home.ClickAdminImg();
//   		         home.SignOut();
   		                          
   		                          
   		                          
          

	
	   
	         
	}
	

}
