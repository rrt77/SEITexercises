package listener;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class CustomeListener implements ITestListener {

	public void onFinish(ITestContext arg0) {

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult arg0) {
		/*// Call Screenshot method here
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try {
			GeneralFunctions.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("<a href="+GeneralFunctions.screenshotName+">ScreenShot</a>");*/

	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult arg0) {

		// Call Screenshot method here
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\selenium\\Desktop\\Selenium\\screenshot.bmp\">ScreenShot</a>");

	}

}
