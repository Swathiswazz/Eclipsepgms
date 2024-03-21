package TestNgpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Fblogin 
{	
	
	public String baseurl;
	ChromeDriver driver =new ChromeDriver();
	
	@BeforeTest	
	public void beforetestmethod()
	{
		baseurl="https://facebook.com";
	}	
	@BeforeMethod	
	public void beforetestrunmethod()
	{
		
		driver.get(baseurl);	
	}
	@Parameters({"username","password"})
	@Test
	public void login(String username,String password)
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		//driver.findElement(By.xpath("//*[@id='u_0_5_m0']")).click();
		driver.findElement(By.name("login")).click();
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("test closing");
	}
	@AfterTest
	public void aftertest()
	{	
		System.out.println("All tests closed");
		driver.quit();
	}

}


