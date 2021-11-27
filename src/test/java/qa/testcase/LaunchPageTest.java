package qa.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import qa.base.Base;

public class LaunchPageTest extends Base {
	
	LaunchPageTest lp;
	
	public LaunchPageTest() throws IOException
	{
		super();
	}
	
	@BeforeTest
	public void initialize() throws Throwable
	{
		initiateBrowser();
		lp=new LaunchPageTest();
			
	}
	
	@Test(priority=1)
	public void CheckIfSiteCorrectTest()
	{
		String title =driver.getTitle();
		System.out.println("Title is :"+title);
		Assert.assertEquals(title, "Gumtree | Free classified ads from the #1 classifieds site in the UK");
		
	}
	
	
	@AfterTest
	public void closeSession()
	{
		driver.quit();
	}
	

}
