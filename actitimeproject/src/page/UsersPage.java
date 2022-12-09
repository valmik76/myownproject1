package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	//declaration for all webelements on userpage
		@FindBy(linkText="Users") private WebElement usersTab;
		@FindBy(xpath = "//input[@value='Create New User']") private WebElement createNewUser;
		
		
		//initialization
		public UsersPage(WebDriver driver)
		{
		PageFactory.initElements(driver, this);	
		}
		
		//utilization
		public WebElement getUsersTab() {
			return usersTab;
		}
		
		public WebElement getCreateNewUser() {
			return createNewUser;
		}


}
