package Junitpkg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Radiovalidation
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
public void radiovalidation() throws InterruptedException 
{
	driver.manage().window().maximize();
	boolean logo=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected(); //to check it is displayed or not
	boolean logo1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).isSelected(); //to check it is displayed or not
	if(logo || logo1)
	{
		System.out.println("radio botton is selected");
	}
	else
	{
		System.out.println("Radio button is not selected");
	}
	Thread.sleep(1000);
}
@After
public void tearDown()
{
	driver.quit();
}
}
