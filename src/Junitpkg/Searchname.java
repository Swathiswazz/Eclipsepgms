package Junitpkg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Searchname {
ChromeDriver driver;
String baseurl="https://www.google.com";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void searchkey() throws InterruptedException
{
	
	WebElement search=driver.findElement(By.name("q"));
	//search.sendKeys("books");  //another way
	//search.submit();
	Thread.sleep(1000);
	search.sendKeys("books",Keys.ENTER);  //another way
	Thread.sleep(1000);
	
}
@After
public void tearDown()
{
	driver.quit();
}
}
