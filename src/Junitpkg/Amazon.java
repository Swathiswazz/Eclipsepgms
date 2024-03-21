package Junitpkg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
ChromeDriver driver;
String baseurl="https://www.amazon.in";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void searchkey() throws InterruptedException
{
	
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

	search.sendKeys("mobiles",Keys.ENTER);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='nav-main']/div/a")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
	Thread.sleep(1000);
}
@After
public void tearDown()
{
	driver.quit();
}
}
