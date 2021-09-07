package Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestContext;
import io.cucumber.java.Scenario;

/**
 * Class contain Screen shot related methods.
 * 
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 *
 */
public class ScreenShot extends TestContext {

	private static final Logger logger = LogManager.getLogger(ScreenShot.class);
	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;

	/**
	 * This constructor of ScreenShot class.
	 * 
	 * @param driver
	 * @param wait
	 * @param scn
	 */
	public ScreenShot(WebDriver driver, Scenario scn, WebDriverWait wait) {
		this.driver = driver;
		this.scn = scn;
		this.wait = wait;
	}

	/**
	 * Method help to take screen shot if any Scenario is failed.
	 * 
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public void ScreenShotOfFailedScenario(Scenario scn) {

		if (scn.isFailed()) {

			TakesScreenshot screenShot = (TakesScreenshot) driver;
			byte[] data = screenShot.getScreenshotAs(OutputType.BYTES);
			scn.attach(data, "image/png", "failed step name ::> " + scn.getName());
			logger.info("Test case isn't passed, screenShot is captured.");
		} else {
			scn.log("Test case is passed, No screenShot is captured.");
			logger.info("Test case is passed, No screenShot is captured.");
		}

	}

}
