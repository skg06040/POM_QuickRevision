package qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties props;
	
	public Base() throws IOException 
	{
		FileInputStream fis;
		
			fis = new FileInputStream("C:\\Users\\Sumit\\eclipse-workspaceNew\\Revision\\src\\main\\java\\qa\\resourc\\props.properties");
		
		
		props = new Properties();
		
			props.load(fis);
		
		
		
	}
	
	
	@SuppressWarnings("deprecation")
	public static void initiateBrowser()
	{
		String browserName = props.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(props.getProperty("url"));
		
		
		
		
	}

}
