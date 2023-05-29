package QSPselenium;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GooglenewKannadaTab 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		
		Actions a=new Actions(driver);
		Actions builder=a.moveToElement(link).contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click();
		builder.perform();
		//act.contextClick(ele).perform();
		Thread.sleep(2000);
		Set<String> windowid=driver.getWindowHandles();
		/*Robot r=new Robot();
		Object KeyEvent;
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);*/
		Iterator<String> itr=windowid.iterator();
		String mainwindow=itr.next();
		String childwindow=itr.next();
		System.out.println(mainwindow);
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		driver.get(childwindow);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	}
}
