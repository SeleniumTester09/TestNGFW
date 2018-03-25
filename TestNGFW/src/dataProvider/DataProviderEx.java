package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {


	@Test(dataProvider="credentials")
	public void setData(String username, String password)
	{
		System.out.println("Provided username : "+username);
		System.out.println("Provided password : "+password);
	}
	
	@DataProvider
	public Object[][] credentials()
	{
	/*
	Rows - Number of times your test has to be repeated.
	Columns - Number of parameters in test data.
	*/
	
	Object[][] data = new Object[3][2];

	// 1st row
	data[0][0] ="Normaluser"; // User Name
	data[0][1] = "Num123"; // Password

	// 2nd row
	data[1][0] ="AdminUser";
	data[1][1] = "Abcd1234";
	
	// 3rd row
	data[2][0] ="Guestuser";
	data[2][1] = "Pass123";

	return data;
	}
	
	/*
	@DataProvider
	
	public Object[][] credentials() {

    return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_2", "Test@123" }};

	}
	*/


}
