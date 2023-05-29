package QSPselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		//WebElement ele=driver.findElement(By.tagName("a"));
		//ele.click();
		//driver.findElement(By.id("email")).sendKeys("Vijayalakshmi Goswami");
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Kannada songs");
	
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		//driver.findElement(By.xpath("//div[text()='Electronics']")).click();
		driver.findElement(By.xpath("//input[//input[@id='nav-search-submit-button']")).sendKeys("oneplus 11");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71DCZOdq92S._AC_UY218_.jpg']")).click();
		//driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();


		//driver.findElement(By.id("pass")).sendKeys("mrinal@2017");
		//driver.findElement(By.name("login")).click();
	}

}
