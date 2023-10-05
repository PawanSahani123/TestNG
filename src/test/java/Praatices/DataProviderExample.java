package Praatices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	@Test(dataProvider ="Login")
	void logintest(String email ,String pwd)
	{
		System.out.println(email+" "+pwd);
	}
	
	
	
	@DataProvider(name ="Login")  // first create this data beacuse this refer to the @test method 
	public Object[][] getData()
	{
		Object [][] data = {{"abcd@gmail.com" ,"Pawan"},{"krishan@gmail.com" ,"Anil"},{"Anilsingh@gmail.com","RAM"}};
	     return data;
	}

}
