package Webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcepgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		String baseurl="https://www.google.com";//launch browser
		driver.get(baseurl);//loaded url
		String src=driver.getPageSource();//loaded page source
		if(src.contains("Gmail"))
		{
		System.out.println("gmail text is present");
		}
		else
		{
		System.out.println("Text is not present");	
		}
		driver.quit();

	}
}
