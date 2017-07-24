package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BACResultPage;
import pages.HomePage;
import utility.GeneralFunctions;


public class CompareBACPriceWithCiti{
	
	@Test
	public void compareBACPriceWithCiti() throws IOException {
		
		
		
		//System.setProperty("webdriver.gecko.driver",
				//"C:\\Users\\selenium\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");

		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://investorshub.advfn.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		double bacPrice =RetriveTheCurrentPriceOfBAC.bac;
		HomePage hp = new HomePage(driver);
		hp.searchQuote("c");
		BACResultPage bp = new BACResultPage(driver);
		double cPrice =bp.getTodaysPrice();
		System.out.println("Today's C price = "+ cPrice);
		if(bacPrice>cPrice) {
			System.out.println("Bank Of America has Higher Price");
		}else if(bacPrice<cPrice) {
			System.out.println("Citi Bank has Higher Price");
		}else {
			System.out.println("Both stock have same price");
		}
		
		//Reporter.log("Successfully Compare BAC and C price!");
		//Reporter.log("<a href=\"C:\\Users\\selenium\\Desktop\\Selenium\\screenshot.bmp\">ScreenShot</a>");
		
		try{
			//Assert.fail("Test case failed");
			Reporter.log("Successfully Compare BAC and C price!");
			GeneralFunctions cf = new GeneralFunctions(driver);
			cf.captureScreenshot("CompareBACPriceWithCiti");
			//Reporter.log("<a href=\"C:\\Users\\selenium\\Desktop\\Selenium\\screenshot.bmp\">ScreenShot</a>");
			Reporter.log("<a href=\"CompareBACPriceWithCiti.jpg\">ScreenShot</a>");
		}catch(Throwable t){
			Reporter.log("Test Failed");
			GeneralFunctions cf = new GeneralFunctions(driver);
			cf.captureScreenshot("CompareBACPriceWithCiti");
			//Reporter.log("<a href=\"C:\\Users\\selenium\\Desktop\\Selenium\\screenshot.bmp\">ScreenShot</a>");
			Reporter.log("<a href=\"CompareBACPriceWithCiti.jpg\">ScreenShot</a>");
			throw new RuntimeException("Test Case Failed");
			
		}finally {
		
		driver.close();
		
		}
		//driver.close();
		
		
	}

}
