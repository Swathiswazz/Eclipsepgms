package Junitpkg;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.Test;
public class Linkvalidation
{
String link="https://google.com";
@Test
public void test()
{
	try
	{
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
		if(code==200)
		{
			System.out.println("Response code 200--successful");
		}
		else
		{
			System.out.println("Response code not expected");
		}
	}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
