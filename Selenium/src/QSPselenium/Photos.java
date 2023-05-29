package QSPselenium;

import java.util.Date;

//import java.io.IOException;
//import java.util.Date;
//import java.sql.Date;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Photos 
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d);
		String d1=d.toString();
		System.out.println(d1);
		String d2=d1.replaceAll(":", "-");
		System.out.println(d2);
	}
}
