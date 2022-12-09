package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration for all webelements present on the homepage
		@FindBy(xpath = "//a[text()='Create new tasks']") private WebElement createNewTask;
		@FindBy(xpath = "//a[text()='Logout']") private WebElement logoutLink;
		@FindBy(xpath = "//a[text()='View Time-Track']") private WebElement viewTimeTrackTab;
		
		
		//initialization                        
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		//utilization
		public WebElement getCreateNewTask() {
			return createNewTask;
		}
		
		public WebElement getLogoutLink() {
			return logoutLink;
		}
		public WebElement getViewTimeTrackTab() {
			return viewTimeTrackTab;
		}
		
		
		//  logout method
		
		public void logOutmethod()
		{
			logoutLink.click();
		}


}
