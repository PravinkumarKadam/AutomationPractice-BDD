package pageObjects;

import java.util.Iterator;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import base.TestContext;
import interfaces.Locators;
import interfaces.Variables;
import io.cucumber.java.Scenario;

public class ValidateYoutubeHandle_PageObject extends TestContext implements Locators, Variables {

	private static final Logger logger = LogManager.getLogger(ValidateYoutubeHandle_PageObject.class);

	WebDriver driver;
	Scenario scn;

	/**
	 * It is parameterized constructor of ValidateYoutubeHandle_PageObject class. It
	 * use to initialize all driver, Scenario, WebDriverWait, TestContext, etc......
	 * 
	 * @param driver
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public ValidateYoutubeHandle_PageObject(WebDriver driver, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
	}

	/**
	 * click_youtube_link
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void click_youtube_link() {
		javaScriptUtil.scrollPageDown();
		utilities.ClickElement(YoutubeHandle_Locator);
		scn.log("Click on youtube link ");
		logger.info("Click on youtube link ");
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
		logger.info("Validation Youtube Handle.");

	}
}
