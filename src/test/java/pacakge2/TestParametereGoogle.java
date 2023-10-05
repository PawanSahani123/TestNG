package pacakge2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParametereGoogle {
	@Parameters({"keyword"})
	@Test
	public void googleSearch(String searchdata)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(opt);
		
		driver.get("https://www.google.com/");
		
	WebElement search =driver.findElement(By.name("q"));
		
		search.sendKeys(searchdata);
		
		Assert.assertEquals(searchdata, search.getAttribute("value"));
	}

}
