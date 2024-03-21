package Junitpkg;
import java.io.File;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm
{
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test
	public void screenshot() throws IOException
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D://fbscreenshot1.png"));
		
		WebElement loginbutton=driver.findElement(By.name("login"));
		File src1=loginbutton.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshots/loginbutton.png"));
		
		WebElement createaccount=driver.findElement(By.xpath("//div[@id='globalContainer']/div/div/div[1]/div/div[2]/div[1]/div/form/div[5]/a"));
		File src2=createaccount.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("./Screenshots/createaccount.png"));
		
		WebElement forgotpassword=driver.findElement(By.xpath("//div[@id='globalContainer']/div/div/div[1]/div/div[2]/div[1]/div/form/div/a"));
		File src3= forgotpassword.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src3, new File("./Screenshots/ forgotpassword.png"));
		
	}
}
