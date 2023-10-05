package Praatices;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	
	@DataProvider(name ="Login")  // first create this data beacuse this refer to the @test method 
	public Object[][] getData()
	{
		Object [][] data = {{"abcd@gmail.com" ,"Pawan"},{"krishan@gmail.com" ,"Anil"},{"Anilsingh@gmail.com","RAM"}};
	     return data;
	}

}
