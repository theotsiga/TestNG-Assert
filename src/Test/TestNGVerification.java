package Test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNGVerification {

	public WebDriver driver;
	
	@Test
	public void verifyloginpage() 
	{
		
	System.setProperty("webdriver.chrome.driver","./drivers2/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	String actualtitle = driver.getTitle();
	String expectedtitle = "theo";
	assertEquals(actualtitle, expectedtitle);// you will get assertion error
	System.out.println("jimalo");
	
	}
	
	@Test
	public void zee()
	{
		System.out.println("zee");
	}
	
}
