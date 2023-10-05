package pacakge2;

import org.testng.annotations.*;

public class AnntationAttribute {
	
	//@Test(description ="This is test case 1")
	//@Test(priority=3)
	//@Test(dependsOnMethods="TestCase3")
	@Test 
	void TestCase1() 
	{
		System.out.println("Mobile Login Test Case 1");	
	}
	
 // @Test (description ="This is test case 2")

	//@Test (timeOut=600)
   // @Test(priority=1)
	@Test (enabled=false)
	void TestCase2() throws InterruptedException 
	{
		//Thread.sleep(400);
		System.out.println("Web Login Test Case 2");
	}
  
 //@Test (description ="This is test case 3")
 @Test
	//@Test
  void TestCase3() 
	{
		System.out.println("Application login Test case 3");
	}


}
