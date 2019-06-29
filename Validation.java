package Maven;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.BaseClass;

public class Validation extends BaseClass {
	
	@BeforeTest
	public void initializeBrowser() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basePageNavigateion() throws IOException
	{
		
	LandingPage l1= new LandingPage(driver);
	Assert.assertEquals(l1.title().getText(), "FEATURED COURSES");
	Assert.assertTrue(l1.navigation());
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}



}
