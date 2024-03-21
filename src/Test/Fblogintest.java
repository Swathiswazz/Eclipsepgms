package Test;
import org.testng.annotations.Test;

import Page.Fbloginpage;

public class Fblogintest extends Baseclass
{

@Test
public void testlogin()
{
	Fbloginpage ob=new Fbloginpage(driver);
	ob.setvalues("swa@gmail.com","swa@123");
	ob.login();
	
}
}
