package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vtiger_Login_Page {

	public Vtiger_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement UserTextField;
	
	@FindBy(name="user_password")
	private WebElement PasswordTextfield;
	
	@FindBy(id="submitButton")
	private WebElement LoginButton;

	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//Business Logic
	
	/**
	 * This method is used to launch the application
	 * @param username
	 * @param password
	 */
	public void logintoVtiger(String username,String password)
	{
		UserTextField.sendKeys(username);
		PasswordTextfield.sendKeys(password);
		LoginButton.click();
		
		
	}
}
