package pacakge2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import io.github.bonigarcia.wdm.WebDriverManager;


@Test
public class BasicDataprovider {

	@Test(dataProvider="Create")
	void test(String username , String password) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='submit']")).click();

		Thread.sleep(10000);
	}



	@DataProvider (name="Create") Object[][] dataset() throws InterruptedException 
	{ 
		Object[][] data = new Object[4][2];

	data [0][0] ="standard_u" ; data [0][1] ="secret_sauc" ;


	data [1][0] ="lock_ou_user" ; data [1][1] ="secret_sauce" ;

	data [2][0] ="proble_user" ; data [2][1] ="secre_sauc" ;

	return data ;

	}

}

