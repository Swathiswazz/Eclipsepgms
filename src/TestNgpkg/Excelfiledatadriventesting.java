package TestNgpkg;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Excelfiledatadriventesting
{

	public String baseurl;
	ChromeDriver driver =new ChromeDriver();
	
	@BeforeTest	
	public void beforetestmethod()
	{
		baseurl="https://facebook.com";
	}	
	@BeforeMethod	
	public void beforetestrunmethod()
	{
		
		driver.get(baseurl);	
	}
	
	@Test
	public void datadriven() throws IOException, InterruptedException 
	{
		FileInputStream fi=new FileInputStream("D://Book1.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(fi)) {
			XSSFSheet sh=wb.getSheet("Sheet1");
			int rowcount=sh.getLastRowNum();
			System.out.println(rowcount);
			for(int i=1;i<=rowcount;i++)
			{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password="+password);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='email']")).clear();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(1000);
			}
		}
	}
	@AfterTest
	public void aftertest()
	{	
		driver.quit();
	}

}
