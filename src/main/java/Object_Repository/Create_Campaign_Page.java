package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Campaign_Page {
	
	public Create_Campaign_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement CampPlusSign;
	
	@FindBy(xpath = "//input[@name=\"campaignname\"]")
	private WebElement CampaignName;
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/select.gif\"]")
	private WebElement plusSignToNavigateProductPage;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement Savebutton;

	public WebElement getCampPlusSign() {
		return CampPlusSign;
	}

	public WebElement getCampaignName() {
		return CampaignName;
	}

	public WebElement getplusSignToNavigateProductPage() {
		return plusSignToNavigateProductPage;
	}

	public WebElement getSavebutton() {
		return Savebutton;
	}
	
    public void ClickCampPlusSign()
    {
    	CampPlusSign.click();
    }
    
    public void EnterCampaignName(String campname)
    {
    	CampaignName.sendKeys(campname);
    }
    
    public void ClickplusSignToNavigateProductPage()
    {
    	plusSignToNavigateProductPage.click();
    }
    
    public void ClickonSaveButton()
    {
    	Savebutton.click();
    }
    

}
