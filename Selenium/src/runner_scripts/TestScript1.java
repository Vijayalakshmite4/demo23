package runner_scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import abc.POM;
import generic_scripts.Base_Page;
import pom_scripts.Pom1;

public class TestScript1 extends Base_Page{
	@Test(dataProvider="testdata")
	public void test1(String d1,String d2) throws InterruptedException
	{
		Pom1 p=new Pom1(driver);
		p.passUn("d1");
		//Thread.sleep(2000);
		p.passPwd("d2");
		Thread.sleep(2000);
		p.clickBtn();
	}
@DataProvider(name="testdata")
public Object[][] createData1(){
	return new Object[][] {
		{"Santhosh","1234"},
		{"Pradeeo","5678"},
	};
}
}
