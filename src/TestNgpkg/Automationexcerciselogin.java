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

	public class Automationexcerciselogin
	{
		public String baseurl;
		ChromeDriver driver =new ChromeDriver();
		
		@BeforeTest	
		public void beforetestmethod()
		{
			baseurl="https://automationexercise.com/login";
		}	
		@BeforeMethod	
		public void beforetestrunmethod()
		{
			
			driver.get(baseurl);	
		}
		
		@Test
		public void datadriven() throws IOException, InterruptedException 
		{
			FileInputStream fi=new FileInputStream("D://Book2.xlsx");
			try (XSSFWorkbook wb = new XSSFWorkbook(fi)) {
				XSSFSheet sh=wb.getSheet("Sheet1");
				int rowcount=sh.getLastRowNum();
				System.out.println(rowcount);
				for(int i=1;i<=rowcount;i++)
				{
				String emailaddress=sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println("emailaddress="+emailaddress);
				String password=sh.getRow(i).getCell(1).getStringCellValue();
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).clear();
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys(emailaddress);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys(password);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
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
