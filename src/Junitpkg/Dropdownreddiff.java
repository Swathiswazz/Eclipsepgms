package Junitpkg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownreddiff 
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
public void dropdown() throws InterruptedException 
{
	driver.manage().window().maximize();
	WebElement day=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
	Select daydetails=new Select (day);
	daydetails.selectByValue("02");
	Thread.sleep(1000);
	WebElement month=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
	Select monthdetails=new Select (month);
	monthdetails.selectByValue("04");
	Thread.sleep(1000);
	WebElement year=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
	Select yeardetails=new Select (year);
	yeardetails.selectByValue("2022");
	Thread.sleep(1000);
}
@After
public void tearDown()
{
	driver.quit();
}
}
