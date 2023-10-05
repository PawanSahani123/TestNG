package Praatices;


import org.testng.annotations.*;



public class TestNgParameterDemo {
	
	@Test
	@Parameters({"i" ,"j"})
	public void add(int a ,int b)
	{
		System.out.println("Addition : "+(a+b));
	}
	
	@Test
	@Parameters({"i" ,"j"})
	public void substraction(int a ,int b)
	{
		System.out.println("Substraction : "+(a-b));
	}
	
	@Test
	@Parameters({"i" ,"j"})
	public void multiply(int a ,int b)
	{
		System.out.println("multipaly : "+(a*b));
	}
	
	
	

}
