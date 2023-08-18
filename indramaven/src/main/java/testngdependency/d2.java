package testngdependency;

import org.testng.annotations.Test;

public class d2 {
	
	//depends onGroups: create connection between test case and groups
	
	@Test(priority=0, groups="T")
	public void user()
	{
		System.out.println("username");
	}
	
	@Test(priority=1, groups="T")
	public void pass()
	{
		System.out.println("password");
	}
	
	@Test(priority=2, groups="T")
	public void lg()
	{
		System.out.println("login");
	}
	
	@Test(priority=3, dependsOnGroups="T")
	public void home()
	{
		System.out.println("home");
	}
	
	//Group T: all passs   home: pass
	// even 1 fails        home; skipp 
	

}
