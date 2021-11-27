package qa.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import qa.PageObj.HomePageGuest;
import qa.base.Base;

public class HomePageGuestTest extends Base {
	
	HomePageGuestTest hpgt;
	HomePageGuest hpg;
	
	public HomePageGuestTest() throws IOException {
		super();
	}

	
	
	@BeforeTest
	public void initialize() throws Throwable
	{
		initiateBrowser();
		hpgt=new HomePageGuestTest();
		hpg=new HomePageGuest();
			
	}
	
	@Test(priority=1)
	public void guestSearchJobTest() throws InterruptedException
	{
	    WebElement sb= hpg.returnSearchBar();
	    sb.sendKeys("jobs");
	    hpg.goSubmit();
	    Assert.assertEquals(true, driver.findElement(By.tagName("jobs")).isEnabled());
	   // driver.wait(1000);
	    Thread.sleep(1000);
	    //driver.navigate().back();
		
	}
	
	@Test(priority=2)
	public void BackToHome()
	{
		//driver.navigate().back();
	}
	
	
	@AfterTest
	public void closeSession()
	{
		driver.quit();
	}
}
