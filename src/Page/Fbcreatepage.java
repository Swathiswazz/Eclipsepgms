package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage 
{
By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
By signup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
private WebDriver driver;

public Fbcreatepage(WebDriver driver) 
{
	this.driver=driver;
}

public void createpage()
{
	driver.findElement(createpage).click();
}
public void signup()
{
	driver.findElement(signup).click();
}
public String titleverification()
{
	String title=driver.getTitle();
	return title;
	
}
}
