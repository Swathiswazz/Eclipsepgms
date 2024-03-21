package Junitpkg;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alllinkvalidation 
{
	ChromeDriver driver;
	String baseurl="https://google.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
@Test
public void test()
{
	
	List<WebElement>li=driver.findElements(By.tagName("a"));//to store webelements in list
	System.out.println("Total link count=" + li.size());
	for(WebElement ele:li) //pass li to ele 
	{
		String  link=ele.getAttribute("href"); //to take href details of all links one by one
		verify(link);//created our own method
	}
}
private void verify(String link) 
{
	try
	{
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();	
		con.connect(); //established connection
		if(con.getResponseCode()==200)
		{
			System.out.println("Response code successful 200");
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("Response code broken 404");
		}
		else
		{
			System.out.println("Response code not expected");
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
