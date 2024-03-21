package Webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumwebdriver {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();//to launch chrome browser
	driver.get("https://www.google.com");	//url loaded
	
	String expectedtitle="Google";
	String actualtitle=driver.getTitle();
	
	if(expectedtitle.equals(actualtitle))
			{
		System.out.println("Pass");
			}
	else
	{
		System.out.println("Fail");
	}
	
driver.quit();
	}

}
