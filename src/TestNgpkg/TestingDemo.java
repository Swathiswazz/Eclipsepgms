package TestNgpkg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingDemo {

@BeforeTest
public void open()
{
	System.out.println("URL open");
}
@BeforeMethod
public void brforetestrunmethod()
{
	System.out.println("URL loading");
}
@Test(priority=2)
public void test1()

{
	System.out.println("test1");
}
@Test(priority=1)
public void test2()
{
	System.out.println("test2");
}
@Test(priority=3)
public void test3()
{
	System.out.println("test3");
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
}
}
