package qa.PageObj;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.Base;

public class HomePageGuest extends Base {

	

	@FindBy(id="q")
	WebElement searchBar;
	@FindBy(xpath="//button[@type='submit']")
	WebElement go;
	
	
	public HomePageGuest() throws IOException {
		//super();
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement returnSearchBar()
	{
		return searchBar;
	}
	
	public void goSubmit()
	{
		go.click();
	}
	
	
	
	
	

}
