package p1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglist.d2.class)
public class c1 {
	@Test
	

	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//step2: creating an object for chromedriver
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");//1
		Thread.sleep(3000);
		ob.findElementByLinkText("Images").click();//2
		Thread.sleep(3000);
		ob.navigate().back();
		Thread.sleep(3000);
		ob.navigate().forward();
		ob.quit();
	}
}
