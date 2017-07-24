package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GeneralFunctions {

	public WebDriver driver;

	public GeneralFunctions(WebDriver driver) {

		this.driver = driver;
	}

	public String screenshotPath= System.getProperty("user.dir") + "\\test-output\\html\\";
	public static String screenshotName;

	public void captureScreenshot(String screenshotName ) throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String name = screenshotName;
		FileUtils.copyFile(srcFile,
				new File(screenshotPath + name+".jpg"));
		
		//C:\Users\selenium\eclipse-workspace\Exercise2017\test-output\html

	}

}
