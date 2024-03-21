package TestNgpkg;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexcercise
{
	public String baseurl;
	ChromeDriver driver =new ChromeDriver();
	@BeforeTest	
	public void beforetestmethod()
	{
		baseurl="https://automationexercise.com/";
	}	
	@BeforeMethod	
	public void beforetestrunmethod()
	{
		
		driver.get(baseurl);	
	}
	@Test
	public void login() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
		WebElement name=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
		name.sendKeys("swathikrishna",Keys.ENTER);
		
		WebElement email=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
		email.sendKeys("swa@gmail.com",Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
		driver.quit();
		
	}
}
