package TestNgpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebayscrolldown
{
		public String baseurl;
		ChromeDriver driver =new ChromeDriver();
		@BeforeTest	
		public void beforetestmethod()
		{
			baseurl="https://www.ebay.com/";
		}	
		@BeforeMethod	
		public void beforetestrunmethod()
		{
			
			driver.get(baseurl);	
		}
		@Test
		public void scrolldownpgm() throws InterruptedException
		{
			driver.manage().window().maximize();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[1]/a")).click();
			Thread.sleep(1000);
			driver.quit();
		}
}
