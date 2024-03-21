package TestNgpkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser 
{
		WebDriver driver;
		String baseurl="https://facebook.com";
		@BeforeTest	
		@Parameters({"browser"})
		public void cross(String browser)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver =new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver =new FirefoxDriver();
			}
			else 
			{
				driver =new EdgeDriver();
			}
		}
		@Test
		public void aftertest()
		{	
			driver.get(baseurl);
			System.out.println("browser closed");
			driver.quit();
		}

	}



