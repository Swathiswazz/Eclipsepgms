package TestNgpkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;


public class Notificationblocked
{
	WebDriver driver;
	@BeforeTest	
	public void beforetestmethod()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
	}	
	@Test
	public void notificationblocked()
	{
		driver.get("https://www.justdial.com/");
	}

}
