package QSPselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//WebElement ele=driver.findElement(By.tagName("a"));
		//ele.click();
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("santhosh");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("santhosh");
		driver.findElement(By.cssSelector("input[class='login']")).click();
		

	}
}
