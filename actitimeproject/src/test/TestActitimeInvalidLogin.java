package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListener;
import generic.Flib;
import page.LoginPage;

@Listeners(CustomListener.class)
public class TestActitimeInvalidLogin extends BaseTest {
	
	@Test
	public void invalidlogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.getRowCountMethod(EXCEL_PATH, "invaliddata");
		for (int i = 1; i < rc; i++) 
		{
			String username = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 1);
			lp.invalidLoginToActiTime(username, password);
		}
	}

}
