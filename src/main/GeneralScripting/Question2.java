
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question2 {

	public static void main(String[] args) {

		String url = System.getProperty("user.dir") + "\\src\\test\\resources\\food.html";

		// System.out.println(url);

		WebDriver driver = new FirefoxDriver();

		driver.get(url);

		String thirdItem = driver.findElement(By.xpath("html/body/div[1]/span[5]")).getText();
		String fifthItem = driver.findElement(By.xpath("html/body/div[1]/span[9]")).getText();

		System.out.println(thirdItem);
		System.out.println(fifthItem);

		Map<String, String> map = new HashMap<String, String>();

		String key1 = driver.findElement(By.xpath("html/body/div[1]/span[1]")).getText();
		String key2 = driver.findElement(By.xpath("html/body/div[1]/span[3]")).getText();
		String key3 = driver.findElement(By.xpath("html/body/div[1]/span[5]")).getText();
		String key4 = driver.findElement(By.xpath("html/body/div[1]/span[7]")).getText();
		String key5 = driver.findElement(By.xpath("html/body/div[1]/span[9]")).getText();

		String value1 = driver.findElement(By.xpath("html/body/div[1]/span[2]")).getText();
		String value2 = driver.findElement(By.xpath("html/body/div[1]/span[4]")).getText();
		String value3 = driver.findElement(By.xpath("html/body/div[1]/span[6]")).getText();
		String value4 = driver.findElement(By.xpath("html/body/div[1]/span[8]")).getText();
		String value5 = driver.findElement(By.xpath("html/body/div[1]/span[10]")).getText();

		map.put(key1, value1);
		map.put(key2, value2);
		map.put(key3, value3);
		map.put(key4, value4);
		map.put(key5, value5);

		for (Map.Entry me : map.entrySet()) {

			System.out.println("key : " + me.getKey() + " and Value : " + me.getValue());

		}

	}

}
