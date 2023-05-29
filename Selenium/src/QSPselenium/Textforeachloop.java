package QSPselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textforeachloop 
{
	private static final String Delete = null;

	public static void main(String[] args) throws InterruptedException
	{
		//int i=0
		System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/vijay/Desktop/text.html");
		
		Thread.sleep(2000);
		List<WebElement> CB =driver.findElements(By.xpath("//input"));
		int count=CB.size();
		
		
		//System.out.println(count);
		//if(i<count)
	//	{
		/*for(int i=0;i<count;i++)
		{
			WebElement we=CB.get(i);
			we.sendKeys("a");
			//System.out.println(t);
		}*/
		for(WebElement we:CB)
		{
			we.sendKeys("a");
		}
		Thread.sleep(2000);
	for(int i=count-1;i>=0;i--)
	{
		WebElement we=CB.get(i);
		//we.sendKeys(Delete);
		we.clear();
	}
	}
}
