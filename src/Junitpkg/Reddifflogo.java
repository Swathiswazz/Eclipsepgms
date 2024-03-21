package Junitpkg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddifflogo
{
ChromeDriver driver;
String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void logovalidation() throws InterruptedException 
{
	driver.manage().window().maximize();
	boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed(); //to check it is displayed or not
	if(logo)
	{
		System.out.println("Logo is displayed");
	}
	else
	{
		System.out.println("Logo is not displayed");
	}
	
}

@After
public void tearDown()
{
	driver.quit();
}
}
