package QSPselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecifictab
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(4000);
	    String p_id=driver.getWindowHandle();
	    Set<String> allwh=driver.getWindowHandles();
	    for(String wh:allwh)
	    {
	    	driver.switchTo().window(wh);
	    	String title=driver.getTitle();
	    	System.out.println(title);
	    	T
	    	
	    	hread.sleep(2000);
	    	if(title.equals("Page not found - qavalidation"))
	    	{
	    		driver.close();
	    	}
	    }
}
}