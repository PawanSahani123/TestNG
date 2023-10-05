package pacakge2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidergoogle {
	@DataProvider(name ="searchDataset")
	public Object[][]searchData()
	{
		Object[][] searchkeyword =new Object[3][2];
		searchkeyword[0][0] ="India" ;
		searchkeyword[0][1] ="Qutub Minar" ;
		
		searchkeyword[1][0] ="Agar" ;
		searchkeyword[1][1] ="Taj Mahal" ;
		
		searchkeyword[2][0] ="hyderabad" ;
		searchkeyword[2][1] ="Charminar" ;
		
		return searchkeyword ;
	}
	
		@Test(dataProvider="searchDataset")
	void Googlesearch(String country ,String monument)
	{
		WebDriverManager.chromedriver().setup();
			
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//Enter key combination of country and monument
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys(country+ " Open window" + monument );
		
		driver.findElement(By.name("btnK")).submit();
		
		
		
		
	}
	

}
