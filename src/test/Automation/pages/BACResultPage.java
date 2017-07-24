package pages;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BACResultPage{
	
	public WebDriver driver;
	
	public BACResultPage(WebDriver driver) {
		this.driver =driver;		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='ahPrice']")
	public WebElement todaysPrice;
	
	@FindBy(how=How.XPATH,using=".//*[@id='content']/div[6]/table/tbody/tr[2]/td[6]")
	public WebElement WeeksHighLowDataFor52Weeks;
	
	
	public double getTodaysPrice() {
		
		
			String s= todaysPrice.getText();
			//System.out.println("Todays Price is ="+ s);
			//return s;
			double todaysPrice =Double.parseDouble(s);
			return todaysPrice;
			
		}
	
	
	
	public void get52WeeksHieghAndLowData() {
		
		
		String w= WeeksHighLowDataFor52Weeks.getText();
		System.out.println("52 week high and low data ="+ w);
		
	}
	
public void getRelativeCurrentPrice() {
	String s= todaysPrice.getText();
	double d = Double.parseDouble(s);
	double low=0;
	double heigh=0;
		
		String w= WeeksHighLowDataFor52Weeks.getText();
		String[] list =w.split("-");
		
		
		List<Double> l= new ArrayList<Double>();
		for(String a:list){
			String b= a.trim();
			double d1= Double.parseDouble(b);
			System.out.println(d1);
			
			l.add(d1);
			
			
			}
		low = l.get(0);
		heigh = l.get(1);
		System.out.println("Low = "+low +"and High = "+ heigh);
		
		
			
			double x =d-low;
			double x1 = (x/d)*100;
			System.out.println("Total increas is : "+ x1+"%");
			
			double y =d-heigh;
			double y1 = (y/d)*100;
			System.out.println("Total increas is : "+ y1+"%");
			
		
			
			
			
		
		}
		
	}
		 
		
	


