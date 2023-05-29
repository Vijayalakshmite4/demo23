package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginScript 
{
@Test
public void ValidLogin() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	POMScript p = new POMScript(driver);
	p.ClickLogin();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	p.ClickLogin();
	

}
}
