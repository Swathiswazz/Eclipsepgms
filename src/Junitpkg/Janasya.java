package Junitpkg;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya
{
ChromeDriver driver;
String baseurl="https://janasya.com";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void task() throws InterruptedException
{
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
    String expectedTitle = "Ethnic Wear -Shop Online Indian Ethnic Wear for Women & Girl | Janasya – Janasya.com";
    String title = driver.getTitle();
    if (title.equalsIgnoreCase(expectedTitle)) {
        System.out.println("Title Matched");
    } else {
        System.out.println("Not a match");
    }
	driver.findElement(By.xpath("//span[@class='text p-relative']")).click();
	Thread.sleep(1000);
	WebElement search=driver.findElement(By.xpath("//input[@id='Search-In-Modal']"));
	search.sendKeys("kurtha",Keys.ENTER);	
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//*[@id='halo-sidebar']/div[2]/div[1]/div[1]/h3]")).click();
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='halo-sidebar']/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@id='cart-icon-bubble']")).click();
	Thread.sleep(1000);
	List<WebElement> linkcount =driver.findElements(By.tagName("a"));
	System.out.println("Total link count on the webpage is=" +linkcount.size());
	
	
}
@After
public void tearDown()
{
	driver.quit();
}
}

