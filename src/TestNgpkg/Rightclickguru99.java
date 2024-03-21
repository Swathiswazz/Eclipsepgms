package TestNgpkg;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	
	public class Rightclickguru99
	{
			public String baseurl;
			ChromeDriver driver =new ChromeDriver();
			@BeforeTest	
			public void beforetestmethod()
			{
				baseurl="https://demo.guru99.com/test/simple_context_menu.html";
			}	
			@BeforeMethod	
			public void beforetestrunmethod()
			{
				
				driver.get(baseurl);	
			}
			@Test
			public void copypaste() throws InterruptedException
			{
				driver.manage().window().maximize();
				Thread.sleep(1000);
				// Right click the button to launch right click menu options
				Actions action = new Actions(driver);
				WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
				action.contextClick(rightclick).perform();
				Thread.sleep(1000);
				WebElement optionclick=driver.findElement(By.xpath("//*[@id='authentication']/ul/li[3]"));
				optionclick.click();
				Thread.sleep(1000);
				// Accept the alert displayed
				driver.switchTo().alert().accept();
				Thread.sleep(1000);
				WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
				action.doubleClick(doubleclick).perform();
				Thread.sleep(1000);
				Alert alert = driver.switchTo().alert(); // switch to alert.
				String alertMessage= driver.switchTo().alert().getText(); // capture alert message.
				System.out.println(alertMessage); // Print Alert Message.
				alert.accept();// Accept the alert displayed
				Thread.sleep(1000);
				
			} 
			
			@AfterTest	
			public void Aftertestmethod()
			{
				driver.quit();
				
			}	
	}

