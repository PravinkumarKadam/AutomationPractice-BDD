package Utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;

/**
 * Class contain Screen shot related methods.
 * 
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 *
 */
public class ScreenShot {

	WebDriver driver;
	Scenario scn;

	/**
	 * 
	 * @param driver
	 * @param scn
	 */
	public ScreenShot(WebDriver driver, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
	}

	/**
	 * Method help to take screen shot if any Scenario is failed.
	 * 
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public void ScreenShot(Scenario scn) {

		if (scn.isFailed()) {

			TakesScreenshot screenShot = (TakesScreenshot) driver;
			byte[] data = screenShot.getScreenshotAs(OutputType.BYTES);
			scn.attach(data, "image/png", "failed step name ::> "+ scn.getName());
		} else {
			scn.log("Test case is passed, No screenShot is captured.");
		}

	}

}
