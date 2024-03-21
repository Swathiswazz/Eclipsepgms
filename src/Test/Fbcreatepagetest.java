package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass
{
	@Test
	public void testcreatepage()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.createpage();
		String actualtitle=ob.titleverification();
		Assert.assertEquals(actualtitle, "Createpage");
		ob.signup();
		
	}

}
