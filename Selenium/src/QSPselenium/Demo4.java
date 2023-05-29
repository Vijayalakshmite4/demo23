package QSPselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vijay/Desktop/default_value.html");
		Thread.sleep(2000);
		//WebElement ele=driver.findElement(By.tagName("a"));
		//ele.click();
		driver.findElement(By.tagName("input")).clear();
	}
}
