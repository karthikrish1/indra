package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class s1 {
	/*
	 * assertion : technique where we will be comparing actual result with obtained result
	 * 
	 * hard 
	 *    provided by Assert builtin class
	 *    static in nature
	 *    assertion fail=> it will not proceed further
	 *    
	 *   
	 * soft
	 *    provided by softassert builtin class
	 *    nonstatic in nature
	 *    assertion fal=> proccedd
	 *    original : assertAll 
	 * 
	 * assertEqual(actual, expected)
	 * assertNotEqual(actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 ** 
	 * */
	
	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: creating an object for chromedriver
		 ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "yahoo");
		//Assert.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Gmail");
		System.out.println(ele.isDisplayed());
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}

}
