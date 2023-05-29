package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScript
{
	/*@Test
	public void validlogin() throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver","./QSP/chromedriver.exe");*/
	//declaration
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginBtn;
	//initialization
	public POMScript(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    //Utilization
	public void ClickLogin()
	{
		loginBtn.click();
	}
}