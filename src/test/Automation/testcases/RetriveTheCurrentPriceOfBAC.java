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


public class RetriveTheCurrentPriceOfBAC {
	
	public static double bac=0;

	@Test
	public void retriveTheCurrentPriceOfBAC() throws IOException {

		//System.setProperty("webdriver.gecko.driver",
				//"C:\\Users\\selenium\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://investorshub.advfn.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage hp = new HomePage(driver);
		hp.searchQuote("bac");
		BACResultPage bp = new BACResultPage(driver);
		bac =bp.getTodaysPrice();
		System.out.println("Today's BAC price = "+ bac);
		//Reporter.log("Sucessfully retrived the current price of BAC!");
		//Reporter.log("<a href=\"C:\\Users\\selenium\\Desktop\\Selenium\\screenshot.bmp\">ScreenShot</a>");
		
		//driver.close();
		
		try{
			//Assert.fail("Test case failed");
			Reporter.log("Sucessfully retrived the current price of BAC!");
			GeneralFunctions cf = new GeneralFunctions(driver);
			cf.captureScreenshot("RetriveTheCurrentPriceOfBAC");
			//Reporter.log("<a href=\"C:\\Users\\selenium\\Desktop\\Selenium\\screenshot.bmp\">ScreenShot</a>");
			Reporter.log("<a href=\"RetriveTheCurrentPriceOfBAC.jpg\">ScreenShot</a>");
		}catch(Throwable t){
			Reporter.log("Test Failed");
			GeneralFunctions cf = new GeneralFunctions(driver);
			cf.captureScreenshot("RetriveTheCurrentPriceOfBAC");
			//Reporter.log("<a href=\"C:\\Users\\selenium\\Desktop\\Selenium\\screenshot.bmp\">ScreenShot</a>");
			Reporter.log("<a href=\"RetriveTheCurrentPriceOfBAC.jpg\">ScreenShot</a>");
			throw new RuntimeException("Test Case Failed");
			
		}finally {
		
		driver.close();
		
		}
		
	}

}
