package QSPselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capturescreenshot
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
	    //Step1
	    
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    //Step2
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    //Step3
	    File dst=new File("D:\\failedTC\\tc1.jpeg");
	    //step4
	    FileHandler.copy(src, dst);
    }
}
