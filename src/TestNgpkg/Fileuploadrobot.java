package TestNgpkg;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobot 
{
		public String baseurl;
		ChromeDriver driver =new ChromeDriver();
		@BeforeTest	
		public void beforetestmethod()
		{
			baseurl="https://www.ilovepdf.com/pdf_to_word";
			
			driver.get(baseurl);	
		}
		@Test
		public void fileuploadpgm()throws Exception
		{
			driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();//button click
			fileUpload("file://D:/1_postcard_2.pdf");
			
		}
		@Test
		public void fileUpload(String p) throws AWTException
		{
			driver.manage().window().maximize();
			StringSelection strselection=new StringSelection(p);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
			Robot robot=new Robot();
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.delay(2000);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(2000);
			
		}
		@AfterTest	
		public void aftertest()
		{
			driver.quit();	
		}
}
		
