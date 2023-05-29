package abc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript extends GenericScript
{
@Test
public void validlogin() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("admin");
	//Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("admin");
	//Thread.sleep(2000);
	driver.findElement(By.name("Login")).click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
}
}
