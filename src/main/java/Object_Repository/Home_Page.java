package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

    
	@FindBy(xpath = "//a[text()=\"Organizations\"]")
	private WebElement Organizationlink;
	
	@FindBy(xpath = "//a[text()=\"Products\"]")
	private WebElement ProductLink;
	
	@FindBy(xpath = "//a[text()=\"More\"]")
	private WebElement Morelink;
	
	@FindBy(name =  "Campaigns")
	private WebElement Campaignlink;
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement AdminImg;
	
	@FindBy(xpath = "//a[text()=\"Sign Out\"]")
	private WebElement SignOut;

	public WebElement getOrganizationlink() {
		return Organizationlink;
	}

	public WebElement getProductLink() {
		return ProductLink;
	}

	public WebElement getMorelink() {
		return Morelink;
	}

	public WebElement getCampaignlink() {
		return Campaignlink;
	}

	public WebElement getLogOutImg() {
		return AdminImg;
	}

	public WebElement getSignOut() {
		return SignOut;
	}
	
	//Business Logic
	
	public void ClickOrganizationlink()
	{
		Organizationlink.click();
	}
	
	public void ClickProductLink()
	{
		ProductLink.click();
	}
	
	public void ClickMorelinkk()
	{
		Morelink.click();
	}
	public void ClickCampaignlink()
	{
		Campaignlink.click();
	}
	public void ClickAdminImg()
	{
		AdminImg.click();
	}
	public void SignOut()
	{
		SignOut.click();
	}
	
}

