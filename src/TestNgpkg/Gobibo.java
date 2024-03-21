package TestNgpkg;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	
	public class Gobibo
	
	{
		public String baseurl;
		ChromeDriver driver =new ChromeDriver();
		@BeforeTest	
		public void beforetestmethod()
		{
			baseurl="https://www.goibibo.com/";
		}	
		@BeforeMethod	
		public void beforetestrunmethod()
		{
			
			driver.get(baseurl);	
		}
		@Test
		public void datepicker()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.navigate().refresh();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]")).click();
			driver.findElement(By.xpath("//*[@id='root']/div[2]/p[1]")).click();
	
			while(true)
			{
				WebElement month=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"));
				String monthnext=month.getText();
				System.out.println(monthnext);	
				
				if(monthnext.equals("August 2024"))
					{
					break;
					}
				else
				{
					driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
				}
				
			}
			
			List<WebElement>li=driver.findElements(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div/div/p"));
			for(WebElement ele:li)
			{
				String date=ele.getText();
				if(date.equals("16"))
				{
					ele.click();
					driver.findElement(By.xpath("//*[@id='root']/div[3]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
				}
			
			}
		
		}
		
	}
