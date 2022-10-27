package Test_Scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_google {
	WebDriver driver;

	@BeforeTest
	public void testbefore() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://ephtesting.demo-ncmaas.com/");

	}

	@Test
	public void loginpage() {
		
		

	}

	@AfterTest
	public void testafter() {
		
		driver.quit();

	}

}
