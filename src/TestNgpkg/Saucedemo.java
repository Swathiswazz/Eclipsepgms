package TestNgpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saucedemo 
{
ChromeDriver driver;
String baseurl="https://www.saucedemo.com/";
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void fblogin() throws InterruptedException
{
	driver.manage().window().maximize();
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	Thread.sleep(1000);
	WebElement a=driver.findElement(By.name("password"));
	a.sendKeys("secret_sauce",Keys.ENTER);
	Thread.sleep(1000);
	}
}


