package Praatices;

import org.testng.annotations.Test;

public class DifferentclassDataP {

		@Test(dataProvider ="Login" , dataProviderClass=CustomDataProvider.class)
		void logintest(String email ,String pwd)
		{
			System.out.println(email+" "+pwd);
		}

}