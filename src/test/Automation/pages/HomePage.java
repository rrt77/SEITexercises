package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='IH']")
	public WebElement searchBox;
	
	@FindBy(how=How.XPATH,using=".//*[@id='ctl00_sb3_btnq1']")
	public WebElement searchButton;
	
	
	
	
	public void searchQuote(String code) {
		
		searchBox.click();
		searchBox.clear();
		searchBox.sendKeys(code);
		searchButton.click();
	}

}
