package abc;

import org.testng.annotations.Test;

public class Data2
{
@Test(groups= {"Sanity"})
public void test1()
{
	System.out.println("hello India");
}
@Test(groups= {"Sanity","Smoke"})
public void test2()
{
	System.out.println("hello asia");
}
@Test(groups= {"Smoke"})
public void test3()
{
	System.out.println("hello World");
}
}
