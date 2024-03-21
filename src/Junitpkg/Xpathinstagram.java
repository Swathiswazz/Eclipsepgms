package Junitpkg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpathinstagram 
{
	
ChromeDriver driver;
String baseurl="https://www.instagram.com";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void instalogin() throws InterruptedException
{
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");
	driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).click();
}
@After
public void tearDown()
{
	driver.quit();
}
}
