package Praatices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	
	@Test
	public void testGoogle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("automationstepbystep.com" ,Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String Expectedtitle="Google";
		String Actualtitle=driver.getTitle();
		System.out.println(Actualtitle);
		Assert.assertEquals(Actualtitle, Expectedtitle);
	}
	@Test
	public void facebook() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions otp=new ChromeOptions();
		otp.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(otp);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("pawansahani019@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pawan123*");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	
}
