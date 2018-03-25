package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@Test
	public void xopenBrowser() {
		System.out.println("Test Opening Browser");
	}
	
	@Test //(dependsOnMethods= {"xopenBrowser"})
	public void aticketBooking() {
		System.out.println("Test ticketBooking");
	}
	@Test (timeOut=45000)
	public void timeRelated()
	{
		System.out.println("Time Management");
	}
	
	@Test (enabled=false)
	public void payment()
	{
		System.out.println("Payment of Ticket");
	}
	
	@BeforeMethod
	public void openingBrowser() {
		System.out.println("Browser Opening");
	}
	
	
	
	@AfterMethod
	public void browserOpened()
	{
		System.out.println("Browser Opended ");
	}
	
	@BeforeTest
	public void deleteCookies()
	{
		System.out.println("Delete the Cookies Before Starting Test Set");
		
	}
	
	@AfterTest
	public void deleteCookiesAfter()
	{
		System.out.println("Delete the Cookies After Test Set");
	}
	
	
}
