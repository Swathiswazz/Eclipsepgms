package TestNgpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	public class Tsc
	{	public String baseurl;
				ChromeDriver driver =new ChromeDriver();
				@BeforeTest	
				public void beforetestmethod()
				{
					baseurl="https://www.tractorsupply.com/";
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
					WebElement we=driver.findElement(By.xpath("//*[@id=\"searchbar-d322f9d0-3340-4faf-95a0-daf81206902c\"]"));
					we.sendKeys("dogfood",Keys.ENTER);
					Thread.sleep(1000);
					driver.quit();
				}
				
		}
