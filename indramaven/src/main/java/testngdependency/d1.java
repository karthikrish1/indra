package testngdependency;

import org.testng.annotations.Test;

public class d1 {
	
	//dependsOnMethods: create connection btwn test cases
	
	@Test(priority=0)
	public void vi()
	{
		System.out.println("visiting ");
	}
	
	@Test(priority=1,dependsOnMethods="vi")
	public void llg()
	{
		System.out.println("login");
	}

	//vi : pass lg: pass
	// vi : fail  lg: skip
}
