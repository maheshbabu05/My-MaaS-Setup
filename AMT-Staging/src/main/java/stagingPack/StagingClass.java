package stagingPack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

public class StagingClass {

		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron\\Desktop\\Automation Files\\Driver\\chromedriver.exe");

  //Pass URL 
  WebDriver driver = new ChromeDriver();
	//ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://ephtesting.demo-ncmaas.com/home/login");
	
//	driver.findElementByXPath((WebElement) By.xpath("//a[contains(text(),'Login')]")).click();
//String T=driver.getTitle();
//System.out.println(T);

	WebElement u = driver.findElement(By.linkText("Login"));
	
u.click();
driver.findElement(By.name(("email"))).sendKeys("maheshbabu+es@captechin.com");

	

	driver.findElement(By.name(("password"))).sendKeys("12345@Test");
	driver.findElement(By.xpath("//button[.='Log In']")).click();
	
	

	//OfferPage
	driver.get("https://ephtesting.demo-ncmaas.com/offers");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scroll(0,500)");
	driver.findElement(By.xpath("//div[@id='searchFilterId']//div[1]//div[1]"
			+ "//div[2]//div[2]//div[2]//div[1]//a[1]//div[1]")).click();
	

	////View OFfer Page
	driver.get("https://ephtesting.demo-ncmaas.com/offers/viewoffers/MTA2NzUwMw==");
	driver.findElement(By.xpath("//a[@class='offer_desc_invest_btn new_btn_style']")).click();

	//ACCOUNT SELECT
	driver.get("https://ephtesting.demo-ncmaas.com/offers/accountSelect");
	WebElement accountId=  driver.findElement(By.id("accountId"));
	Select myAcc = new Select(accountId);
	myAcc.selectByVisibleText("John Sm");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//
	//ESTIMATECALCULATION PAGE
	driver.get("https://ephtesting.demo-ncmaas.com/trade/estimatecalculation/MTA2NzUwMw==");
	driver.findElement(By.xpath("//*[contains(@class,'btn btn-primary')]")).click();
	
	Thread.sleep(10000);
    //BuyShare
	WebElement total_share=driver.findElement(By.xpath("//*[@id=\"total_amount\"]"));
	   try {
		   
		   Boolean dis=total_share.isDisplayed();
		 //Assert.assertTrue(dis);
		   System.out.println("total_share is displayed"+dis);
		   try
		   {
			   Boolean ena=total_share.isEnabled();
			 //  Assert.assertTrue(ena);
			   System.out.println("total_share is enabled"+ena);
			   total_share.click();
			   String N=total_share.getAttribute("value");
			   if(N.isEmpty())
			   {
				   Thread.sleep(10000);
				   total_share.sendKeys("200");
			   }
			   else
			   {
				   Thread.sleep(10000);
				   total_share.clear();
				   total_share.sendKeys("200");

			   }

		   }
		   catch(Exception e)
		   {
			   System.out.println("total_share is not enabled");

		   }
	   }
	   catch(Exception e)
	   {
		   System.out.println("total_share is not displayed");

	   }
		
	    WebElement radio2 = driver.findElement(By.xpath("//*[contains(@onclick,'wirePayment();')]"));
	    radio2.click();
	     
	    driver.findElement(By.xpath("//button[@id='confirmInvestment']")).click();
	    
	    //ConfirmInvest
	    Thread.sleep(12000);
	    
	    driver.findElement(By.cssSelector("#confirmInvestment")).click();
	    
	    	}

	}


