package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class s2 {

	
	@Test
	public void sft()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: creating an object for chromedriver
		 ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		SoftAssert s= new SoftAssert();
		s.assertEquals(ob.getTitle(), "yahoo");//fail
		s.assertNotEquals(ob.getTitle(), "yahoo");//pass
		WebElement ele = ob.findElementByLinkText("Gmail");
		System.out.println(ele.isDisplayed());
		s.assertTrue(ele.isDisplayed());//pass
		s.assertFalse(ele.isSelected());//pass
		ob.quit();
		s.assertAll();
	}
}
