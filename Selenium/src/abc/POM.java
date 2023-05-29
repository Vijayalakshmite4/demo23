package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM 
{
@FindBy(id="email")
private WebElement USname;
@FindBy(name="pass")
private WebElement pass;
@FindBy(name="Login")
private WebElement login_btn;
public POM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void username(String data)
{
	USname.sendKeys(data);
	
}
public void pwd(String data1)
{
	pass.sendKeys(data1);
}
public void Click_btn()
{
	login_btn.click();
}
}
