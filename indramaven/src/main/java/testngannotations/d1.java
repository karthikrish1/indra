package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class d1 {
	
	/*
	 * 
	 * before test: run only once, before all the test cases started its execution
	 * after test: run only once, after all the tst cases finished its execution
	 * 
	 * before class: run only once, aftr before test
	 * after class: run only once, before after test 
	 * 
	 * before method: run before each test case 
	 * after method: run after each test case 
	 * 
	 * 
	 * before test
	 *   before class 
	 *      before method  tc1  aftermethod
	 *      before method  tc2  after method
	 *   after class 
	 * after test 
	 * 
* 
	 * */
	ChromeDriver ob;
	@Test(priority=0)
	public void t1()
	{
		System.out.println("Test cse 1 "+ ob.getTitle());
	}
	
	@Test(priority=1)
	public void t2()
	{
		System.out.println("Test case 2");
		ob.findElementByLinkText("About").click();
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("before test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: creating an object for chromedriver
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after test ");
		ob.quit();
	}

	
	@BeforeClass
	public void btc()
	{
		System.out.println("before class");
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void atc()
	{
		System.out.println("after class " + ob.getCurrentUrl());
	}
	
	@BeforeMethod
	public void btm()
	{
		System.out.println("before method");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void atm()
	{
		System.out.println("after method ");
		ob.manage().deleteAllCookies();
	}


}
