package TestNgpkg;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaywaitpgm
{
	public String baseurl;
	ChromeDriver driver =new ChromeDriver();
	@BeforeTest	
	public void beforetestmethod()
	{
		baseurl="https://www.ebay.com/";
	}	
	@BeforeMethod	
	public void beforetestrunmethod()
	{
		
		driver.get(baseurl);	
	}
	@Test
	public void waitpgm()
	{
		driver.manage().window().maximize();
		/*//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		driver.quit(); */
		
		/*Explicit wait*/
		
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
		WebElement smartphone;
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		smartphone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
		smartphone.click();
		driver.quit();
		
	}
}
