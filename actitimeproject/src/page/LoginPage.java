package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declare all the webelements on login page
	
		@FindBy(name="username") private WebElement usn;
		@FindBy(name="pwd") private WebElement pass;
		@FindBy(id ="loginButton") private WebElement loginbtn;
		@FindBy(id ="keepLoggedInCheckBox") private WebElement keepMeLoginCheckBox;
		@FindBy(id ="licenseLink") private WebElement licenseLink;
		
		//initialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public WebElement getUsn() {
			return usn;
		}

		public WebElement getPass() {
			return pass;
		}
		public WebElement getLoginbtn() {
			return loginbtn;
		}
		public WebElement getKeepMeLoginCheckBox() {
			return keepMeLoginCheckBox;
		}
		public WebElement getLicenseLink() {
			return licenseLink;
		}
		
		//valid login method
		public void validLoginToActiTime(String validUsername, String validPassword)
		{
			usn.sendKeys(validUsername);
			pass.sendKeys(validPassword);
			loginbtn.click();
		}
		
		//invalid login method
		
		public void invalidLoginToActiTime(String username, String password) throws InterruptedException
		{
			usn.sendKeys(username);
			pass.sendKeys(password);
			loginbtn.click();
			Thread.sleep(3000);
			usn.clear();
		}


}
