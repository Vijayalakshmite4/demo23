package QSPselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickAction 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://demo.guru99.com/test/simple_context_menu.html\r\n"
				+ "");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
}
