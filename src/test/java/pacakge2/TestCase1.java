package pacakge2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class TestCase1 {
	
	@BeforeSuite
	void BeforeSuit() 
	{
		System.out.println("Before Suite ..\n");
	}
	@AfterSuite
	void AfterSuit() 
	{
		System.out.println("After Suite ..\n");
	}
	
	
	
	@BeforeTest
	void beforeTest()
	{
		System.out.println("Before Test ...");
	}
	@AfterTest
	void afterTest()
	{
		System.out.println("After Test ..." +"\n");
	}
	
	
	
	@BeforeClass
	void BeforeClass() 
	{
		System.out.println("Before Class ....");	
	}
	@AfterClass
	void AfterClass() 
	{
		System.out.println("After Class ....");	
	}
	
	
	@BeforeMethod
	void BeforeMthod() 
	{
		System.out.println("Before Method ..");
	}
	@AfterMethod
	void AfterMethod()
	{
		System.out.println("After Method..");
	}
	
	@Test
	void test1() 
	{
		System.out.println("This is Test 1 ...");
	}
	@Test
	void test2() 
	{
		System.out.println("This is Test 2...");
	}

}
