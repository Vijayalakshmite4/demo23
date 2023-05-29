package QSPselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locationofelement 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//a[@title='Urdu']"));
		Thread.sleep(2000);
		Point locn = ele.getLocation();
		System.out.println(locn);
		int x=locn.getX();
		System.out.println(x);
		int y = locn.getY();
		System.out.println(y);
	}
	
}

