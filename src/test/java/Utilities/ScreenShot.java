package Utilities;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
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
@Log4j2
@AllArgsConstructor
public class ScreenShot extends TestContext {

	WebDriver driver;
	Scenario scn;
	WebDriverWait wait;


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
			log.info("Test case isn't passed, screenShot is captured.");
			driver.quit();
		} else {
			scn.log("Test case is passed, No screenShot is captured.");
			log.info("Test case is passed, No screenShot is captured.");
		}

	}

}
