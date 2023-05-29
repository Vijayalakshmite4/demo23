package QSPselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchandlogintofb 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	//WebElement ele=driver.findElement(By.tagName("a"));
	//ele.click();
	//driver.findElement(By.id("email")).sendKeys("Vijayalakshmi Goswami");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vijayalakshmi Goswami");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mrinal@2017");
	driver.findElement(By.xpath("//button[@name='login']")).click();


	//driver.findElement(By.id("pass")).sendKeys("mrinal@2017");
	//driver.findElement(By.name("login")).click();

}
}
