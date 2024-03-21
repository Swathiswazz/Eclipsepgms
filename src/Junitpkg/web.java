package Junitpkg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {

ChromeDriver driver;
String baseurl="file:///C:/Users/SWATHY/Desktop/web.html";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
		
}
	@Test
	public void weblogin() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(1000);
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		Thread.sleep(1000);
		System.out.println("The content of alert is:"+alerttext);
		a.accept();
		//a.dismiss(); //to cancel
		WebElement al=driver.findElement(By.xpath("//input[@name='firstname']"));
		al.sendKeys("swathi",Keys.ENTER);
		Thread.sleep(1000);
		WebElement al1=driver.findElement(By.xpath("//input[@name='lastname']"));
		al1.sendKeys("krishna",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	}

