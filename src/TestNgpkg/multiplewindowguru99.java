package TestNgpkg;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	public class multiplewindowguru99
	{
		public String baseurl;
		ChromeDriver driver =new ChromeDriver();
		@BeforeTest	
		public void beforetestmethod()
		{
			baseurl="https://demo.guru99.com/popup.php";
		}	
		@BeforeMethod	
		public void beforetestrunmethod()
		{
			
			driver.get(baseurl);	
		}
		@Test
		public void multiplewindow() throws InterruptedException
		{
			driver.manage().window().maximize();
			String parentwindow=driver.getWindowHandle(); //current window
			System.out.println("Parent Window Title"+ driver.getTitle());
			driver.findElement(By.xpath("/html/body/p/a")).click();
			
			Set<String> allWindowHandles=driver.getWindowHandles();
			for(String handle:allWindowHandles)
			{
				if(!handle.equalsIgnoreCase(parentwindow))
				{
					driver.switchTo().window(handle);
					driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("swa@gmail.com");
					Thread.sleep(1000);
					driver.close();
				}
			}
		}
	}
	
			
	
