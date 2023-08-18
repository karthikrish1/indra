package testngdependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {
	ChromeDriver ob;
	@Test(priority=0, description="visiting ",groups="W")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: creating an object for chromedriver
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
	}
	
	@Test(priority=1, description="maximising ",groups="W")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2, description="refreshing ",invocationCount=3,groups="W")
	public void refreshing()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3, description="clicking ",dependsOnGroups="W")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4, description="closing ",dependsOnGroups="W",timeOut=4000)
    public void closing() throws InterruptedException
    {
		Thread.sleep(3000);
		ob.quit();
    }

}
