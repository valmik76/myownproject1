package test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListener;
import generic.Flib;
import page.HomePage;
import page.LoginPage;

@Listeners(CustomListener.class)
public class TestActitimeLogout extends BaseTest{
	
	@Test
	public void logOut() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String username = flib.readPropertyData(PROP_PATH, "username");
		String password = flib.readPropertyData(PROP_PATH, "password");
		lp.validLoginToActiTime(username,password );
		
		HomePage hp = new HomePage(driver);
		hp.logOutmethod();

	}
}
