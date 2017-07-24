package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BACResultPage;
import pages.HomePage;
import utility.GeneralFunctions;


public class ReletiveCurrentStockPriceWith52WeekHighLow {

	@Test
	public void reletiveCurrentStockPriceWith52WeekHighLow() throws IOException {

		//System.setProperty("webdriver.gecko.driver",
				//"C:\\Users\\selenium\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://investorshub.advfn.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		HomePage hp = new HomePage(driver);
		hp.searchQuote("bac");
		BACResultPage bp = new BACResultPage(driver);
		bp.getRelativeCurrentPrice();
		
		try{
			//Assert.fail("Test case failed");
			Reporter.log("Sucessfully provided relative stock price for BAC!");
			GeneralFunctions cf = new GeneralFunctions(driver);
			cf.captureScreenshot("reletiveCurrentStockPriceWith52WeekHighLow");
			//Reporter.log("<a href=\"C:\\Users\\selenium\\Desktop\\Selenium\\screenshot.bmp\">ScreenShot</a>");
			Reporter.log("<a href=\"reletiveCurrentStockPriceWith52WeekHighLow.jpg\">ScreenShot</a>");
		}catch(Throwable t){
			Reporter.log("Test Failed");
			GeneralFunctions cf = new GeneralFunctions(driver);
			cf.captureScreenshot("reletiveCurrentStockPriceWith52WeekHighLow");
			//Reporter.log("<a href=\"C:\\Users\\selenium\\Desktop\\Selenium\\screenshot.bmp\">ScreenShot</a>");
			Reporter.log("<a href=\"reletiveCurrentStockPriceWith52WeekHighLow.jpg\">ScreenShot</a>");
			throw new RuntimeException("Test Case Failed");
			
		}finally {
		
		driver.close();
		
		}
		//driver.close();
		
		
		
		
		
	}

}
