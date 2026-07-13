package base;

import utilities.FileReadUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(FileReadUtilities.getConfigProperty("url"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
