package abc;

import org.testng.annotations.Test;

public class Testscrip extends Generic_Script_FB 
{
@Test
public void validLogin() throws InterruptedException
{
	POM p=new POM(driver);
	p.username("qsp");
	Thread.sleep(2000);
	p.pwd("rajaji");
	Thread.sleep(2000);
	p.Click_btn();
}
}
