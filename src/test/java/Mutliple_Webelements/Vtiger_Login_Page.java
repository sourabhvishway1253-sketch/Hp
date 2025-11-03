package Mutliple_Webelements;

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
	private WebElement userTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextfield;
	
	@FindBy(id="submitButton")
	private WebElement LoginButton;

	public WebElement getUserTextField() {
		return userTextField;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void loginToApp(String uSERNAME, String pASSWORD) {
		// TODO Auto-generated method stub
		
	}
	
	
}
