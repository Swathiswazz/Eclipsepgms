package Junitpkg;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Getlinks {

		ChromeDriver driver;
		String baseurl="https://www.facebook.com";
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
			
		}
		@Test
		public void linkcount()
		{
			 //Get list of web-elements with tagName  - a
			List <WebElement> linklist =driver.findElements(By.tagName("a"));
			System.out.println("Total link count on the webpage is=" +linklist.size());
			  // Iterating through all the Links and printing link 
		    // text 
			System.out.println("The link name are");
			for (WebElement link : linklist)
			{ 
				String lin=link.getAttribute("href");
				String linkname=link.getText();
		        System.out.println(lin+"-----" +linkname); 
		    } 
	
		}
		@After
		public void tearDown()
		{
			driver.quit();
		}
		}


