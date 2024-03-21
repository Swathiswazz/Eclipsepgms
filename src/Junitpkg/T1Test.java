package Junitpkg;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
public class T1Test {
  private WebDriver driver;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  
  public void t1() {
    driver.get("https://www.facebook.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("swathi");
    driver.findElement(By.id("pass")).click();
    driver.findElement(By.id("pass")).sendKeys("swathy123");
    driver.findElement(By.id("u_0_5_PD")).click();
  }
}
