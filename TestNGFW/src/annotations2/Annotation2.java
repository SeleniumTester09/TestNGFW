package annotations2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotation2 {

	@BeforeSuite
	public void installDB() {
		System.out.println("I am the First One to Execute");
	}
	
	@AfterSuite
	public void unInstallDB() {
		System.out.println("I am the last");
		
	}
}

