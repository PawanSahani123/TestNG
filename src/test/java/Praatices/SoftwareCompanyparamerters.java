package Praatices;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareCompanyparamerters {
	
	@Parameters({"software"})
	@Test
	public void testCase1(String name)
	{
		System.out.println(name);
	}

}
