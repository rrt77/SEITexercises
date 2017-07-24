package raugh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.BACResultPage;
import pages.HomePage;



public class HomeWork {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\selenium\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://investorshub.advfn.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		HomePage hp = new HomePage(driver);
		hp.searchQuote("bac");
		BACResultPage bp = new BACResultPage(driver);
		double bac =bp.getTodaysPrice();
		System.out.println("Today's BAC price = "+ bac);
		double c =bp.getTodaysPrice();
		System.out.println("Today's BAC price = "+ c);
		bp.get52WeeksHieghAndLowData();
		bp.getRelativeCurrentPrice();

	}

}
