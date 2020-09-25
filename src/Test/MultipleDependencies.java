package Test;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleDependencies {

	@Test()
	public void login() 
	{	
		System.out.println("login");
	}
	
	@Test(dependsOnMethods = "login") 
	public void creatework() 
	{
		Assert.fail();
		System.out.println("work is created");	
	}

	@Test (dependsOnMethods = {"login","creatework"})
	public void editwork() 
	{
		System.out.println("work is edited");
	}

	@Test(dependsOnMethods = {"login","creatework"})
	public void deletework() 
	{
		System.out.println("work is deleted");	
	}
	
	/*@Test(invocationCount=1)
	public void gaby() 
	{
		System.out.println("gaby");	
	}

	@Test(invocationCount=5)
	public void micah() 
	{
		System.out.println("micah");*/
	
}


