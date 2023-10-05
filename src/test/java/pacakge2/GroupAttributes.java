package pacakge2;

import org.testng.annotations.Test;

public class GroupAttributes {
	@Test(groups="software company")
	void infosys()
	{
		System.out.println("Infosys");
	}
	@Test(groups="software company")
	void Wipro()
	{
		System.out.println("Wipro");
	}
	@Test(groups="software company")
	void KPIT()
	{
		System.out.println("KPIT");
	}
	@Test(groups="Automobile")
	void TataMotor()
	{
		System.out.println("TataMotor");
	}
	@Test(groups="Automobile")
	void Maruti()
	{
		System.out.println(" Maruti");
	}

}
