package TestNgpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragguru99 
	{

		public String baseurl;
		ChromeDriver driver =new ChromeDriver();
		@BeforeTest	
		public void beforetestmethod()
		{
			baseurl="https://demo.guru99.com/test/drag_drop.html";
		}	
		@BeforeMethod	
		public void beforetestrunmethod()
		{
			
			driver.get(baseurl);	
		}
		@Test
		public void copypaste() throws InterruptedException
		{			driver.manage().window().maximize();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(1000);
			WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
			WebElement account=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
			WebElement fivethousand=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
			WebElement amount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
			WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
			WebElement fivethousand1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
			WebElement account1=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
			WebElement amount1=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	        //Using Action class for drag and drop.		
	         Actions act=new Actions(driver);					

		//Dragged and dropped.		
	         act.dragAndDrop(bank,account).build().perform();  
	         Thread.sleep(1000);
	         act.dragAndDrop(fivethousand,amount).build().perform();	
	         Thread.sleep(1000);
	         act.dragAndDrop(sales,account1).build().perform();
	         Thread.sleep(1000);
	         act.dragAndDrop(fivethousand1,amount1).build().perform();
	         Thread.sleep(1000);
		} 
		
		
	}


