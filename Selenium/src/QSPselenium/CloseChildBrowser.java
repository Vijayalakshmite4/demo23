package QSPselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser 
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
	    int c1=allwh.size();
	    System.out.println(c1);
	    allwh.remove(p_id);
	    int c2=allwh.size();
	    System.out.println(c2);
	    for(String wh:allwh)
	    {
	    	driver.switchTo().window(wh);
	    	String title=driver.getTitle();
	    	System.out.println(title);
	    	Thread.sleep(2000);
	    	driver.close();
	    }
	}
	    }

