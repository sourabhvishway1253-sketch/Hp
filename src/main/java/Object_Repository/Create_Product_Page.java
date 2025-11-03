package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Product_Page {
	
	public Create_Product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement productplusSign;
	
	@FindBy(name = "productname")
	private WebElement ProductName;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement Savebutton;

	public WebElement getProductplusSign() {
		return productplusSign;
	}

	public WebElement getProductName() {
		return ProductName;
	}

	public WebElement getSavebutton() {
		return Savebutton;
	}

	public void productplusSign()
	{
		productplusSign.click();
	}
	
	public void enterProductName(String prdname)
	{
		ProductName.sendKeys(prdname);
	}
	public void ClickSavebutton()
	{
		Savebutton.click();
	}
}
