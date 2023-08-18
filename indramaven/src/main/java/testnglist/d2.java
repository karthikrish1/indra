package testnglist;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class d2 implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		System.out.println("sucessss");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed");
	}

	public void onStart(ITestContext context) {
		System.out.println("Starteed");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Finished ");
	}
	
	//ITEstListener :builtin interface:
	//onstart, on finish, ontestsuccess, ontest failure, onstestskipped
	// class<=> interface 
	//rightclick=> source=> override /implement methods 

}
