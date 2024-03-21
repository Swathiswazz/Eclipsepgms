package TestNgpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadinputguru99
{
	public String baseurl;
	ChromeDriver driver =new ChromeDriver();
	@BeforeTest	
	public void beforetestmethod()
	{
		baseurl="https://demo.guru99.com/test/upload/";
	}	
	@BeforeMethod	
	public void beforetestrunmethod()
	{
		
		driver.get(baseurl);	
	}
	@Test
	public void fileupload() throws InterruptedException
	{
		driver.manage().window().maximize();
		WebElement fileInput = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
		// enter the file path onto the file-selection input field
		fileInput.sendKeys("D://demo.txt");
		// check the "I accept the terms of service" check box
        driver.findElement(By.xpath("//*[@id='terms']")).click();
     // click the "UploadFile" button
        driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
        WebElement s = driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
  		System.out.println(s.getText());
  		Thread.sleep(1000);
	}
	@AfterTest	
	public void aftertest()
	{
		
		driver.quit();	
	}
}
		
		
		