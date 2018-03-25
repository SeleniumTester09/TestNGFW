package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
	
	WebDriver driver;
	
	@Test
	public void testCaseVerifyHomePage() {
		System.setProperty("webdriver.chrome.driver", "C:/Eclipse/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in");
		Assert.assertEquals("Google", driver.getTitle());
	}

}
