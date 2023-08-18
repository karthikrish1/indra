package testngattributes;

import org.testng.annotations.Test;

public class t11 {
	
	//Testng=> Test next generation
	//testing framework
	// inspired from junit
	// test cases 
	//annotations, assertions, waits,
	
	// test cases
	// nonstatic
	// @Test
	// defaultorder: alphabetical order 
	
	//priority: arrange the test case in a particular order 
	//description: adding short note on the test case
	//groups
	// invocation count : run the same test case for multiple time
	// enabled=false; disable
	///time out: fix time limit for test case 
	
	
	@Test(priority=0, description="First",groups="Dhivya", invocationCount=5,enabled=false)
	public void m1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,description="Second",groups="Indhu")
	public void m2()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2,groups="Indhu")
	public void ab()
	{
		System.out.println("Test case 3");
	}

}
