package Maven;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.BaseClass;

public class HomePage extends BaseClass {

	@BeforeTest
	public void basePageNavigateion() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
@Test(dataProvider="getData")
public void fillDetails(String name, String password, String text)
{
	driver.get(prop.getProperty("url"));
	LandingPage l = new LandingPage(driver);
	//l.highSlide().click();
	l.clickLink().click();
	LoginPage lp = new LoginPage(driver);
	lp.getEmail().sendKeys(name);
	lp.getPassword().sendKeys(password);
	
    lp.getLogin().click();
	
}

@DataProvider
public Object[][] getData()
{
	// Row stands for how many different data types test should run
	//coloumn stands for how many values per each test
	
	// Array size is 2
	// 0,1
	Object[][] data=new Object[2][3];
	//0th row
	data[0][0]="nonrestricteduser@qw.com";
	data[0][1]="123456";
	data[0][2]="Restrcited User";
	//1st row
	data[1][0]="restricteduser@qw.com";
	data[1][1]="456788";
	data[1][2]= "Non restricted user";
	
	return data;
}
@AfterTest
public void closeBrowser()
{
	driver.close();
}


}
