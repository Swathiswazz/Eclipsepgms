package TestNgpkg;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
public class Amazonemultiplewindow
	{
			public String baseurl;
			ChromeDriver driver =new ChromeDriver();
			@BeforeTest	
			public void beforetestmethod()
			{
				baseurl="https://www.amazon.in/";
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
				WebElement we=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
				we.sendKeys("mobilephones",Keys.ENTER);
				String actualtitle=driver.getTitle();
				String expectedtitle="Amazon,.in : mobile phones";
				if(actualtitle.equalsIgnoreCase(expectedtitle))
				{
					System.out.println("Title matched");
				}
				else
				{
					System.out.println("Title not matched");
				}

				
				driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
				
				String parentwindow=driver.getWindowHandle(); //current window
				Set<String> allWindowHandles=driver.getWindowHandles();
				for(String handle:allWindowHandles)
				{
					if(!handle.equalsIgnoreCase(parentwindow))
					{
						driver.switchTo().window(handle);
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,350)", "");
						
						driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				    	Thread.sleep(3000);
						//driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();
				    	driver.close();
				    	driver.switchTo().window(parentwindow);
					}
				}
			}
			
	}

