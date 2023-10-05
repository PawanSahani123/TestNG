package Praatices;

import org.testng.annotations.*;

public class ParameterStringDemo {
	@Parameters({"Automobile"})
	@Test
	public void testCase1(String name)
	{
		System.out.println(name);
	}
}
