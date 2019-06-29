package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	By closeHighslide = By.xpath("//*[contains(text(),'NO THANKS')]");
	By login = By.cssSelector("a[href*='sign_in']");
	By title =By.xpath("//*[text()='Featured Courses']");
	By navigation = By.cssSelector("ul[class='nav navbar-nav navbar-right']");
	
	public LandingPage(WebDriver driver)
	{
		 this.driver = driver;
	}

	public WebElement highSlide()
	{
		WebElement e = driver.findElement(closeHighslide);
		return e;
	}
	public WebElement clickLink()
	{
	 WebElement e = driver.findElement(login);
	 return e;
		
	}
	public WebElement title()
	{
	 return driver.findElement(title);
	}
	
	
   public boolean navigation()
   {
	   WebElement e= driver.findElement(navigation);
	   boolean condition = e.isDisplayed();
	   return condition;
   }
	
	
	
	
	
	

}
