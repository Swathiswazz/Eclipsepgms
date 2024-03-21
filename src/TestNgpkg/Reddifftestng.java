package TestNgpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Reddifftestng 
{	
public String baseurl;
ChromeDriver driver =new ChromeDriver();
@BeforeTest(groups= { "SmokeTest" })	
public void beforetestmethod()
{
	baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
}	
@BeforeMethod(groups= { "SmokeTest" })	
public void beforetestrunmethod()
{
	
	driver.get(baseurl);	
}

@Test
public void titleverification()
{
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
    String expectedTitle = "Rediffmail Free Unlimited Storage";
    String title = driver.getTitle();
    if (title.equalsIgnoreCase(expectedTitle)) {
        System.out.println("Title Matched");
    } else {
        System.out.println("Not a match");
    }
}
@Test
public void logoverification()
{
	driver.manage().window().maximize();
	boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed(); //to check it is displayed or not
	if(logo)
	{
		System.out.println("Logo is displayed");
	}
	else
	{
		System.out.println("Logo is not displayed");
	}
	
}
@Test(groups= { "SmokeTest" })	
public void buttonverification()
{
	String buttontext=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
	if(buttontext.equals("Create my account >>"))
	{
		System.out.println("Create My account button is present");	
	}
	else
	{
		System.out.println("Create My account button is not present");	
	}
}
@Test(groups= { "SmokeTest" })	
public void buttonenableddisabledverification()
{
	if(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isEnabled()) 
	{
		System.out.println("Radio button for male is enabled");
	}
	else if(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).isEnabled())
	{
		System.out.println("Radio button for female is disabled");	
	}
}
//@Test(enabled=false)
@Test
public void labelverification()
{
	String label=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[1]")).getText();
	if (driver.getPageSource().contains(label)) {
        System.out.println("Text: " + label + " is present. ");
    } else {
        System.out.println("Text: " + label + " is not present. ");
    }
}
@AfterMethod
public void aftermethod()
{
	System.out.println("test closing");
}
@AfterTest
public void aftertest()
{	
	System.out.println("All tests closed");
	driver.quit();
}
}


