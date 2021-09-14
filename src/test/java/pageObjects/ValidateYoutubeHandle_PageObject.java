package pageObjects;

import java.util.Iterator;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import base.TestContext;
import interfaces.Locators;
import interfaces.Variables;
import io.cucumber.java.Scenario;

/**
 * There is a object repository for the operations offered by
 * 'ValidateTotalCorrectInCart_PageObject' class. This class help to achieve
 * encapsulation.
 *
 * @Company: VisionIT
 * @Date: 12-September-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 */
@Log4j2
@AllArgsConstructor
public class ValidateYoutubeHandle_PageObject extends TestContext implements Locators, Variables {

	WebDriver driver;
	Scenario scn;


	/**
	 * click_youtube_link
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void click_youtube_link() {
		javaScriptUtil.scrollPageDown();
		utilities.ClickElement(YoutubeHandle_Locator);
		scn.log("Click on youtube link ");
		log.info("Click on youtube link ");
	}

	/**
	 * validate_youtube_channel_name
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void validate_youtube_channel_name() {
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();

		String LandingPAGE = it.next();
		String Youtubepage = it.next();

		driver.switchTo().window(Youtubepage);
		String ActualText = utilities.doGetText(ValidateYoutubeHandle_Locator);
		String ExpectedText = ValidateYoutubeHandle_Variables;
		Assert.assertEquals("Assertion failed.", ExpectedText, ActualText);
		scn.log("Validation Youtube Handle.");
		log.info("Validation Youtube Handle.");

	}
}
