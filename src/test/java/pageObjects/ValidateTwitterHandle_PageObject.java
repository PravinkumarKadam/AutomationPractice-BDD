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

public class ValidateTwitterHandle_PageObject extends TestContext implements Locators, Variables {

	private static final Logger logger = LogManager.getLogger(ValidateTwitterHandle_PageObject.class);

	WebDriver driver;
	Scenario scn;

	/**
	 * s It is parameterized constructor of ValidateTwitterHandle_PageObject class.
	 * It use to initialize all driver, Scenario, WebDriverWait, TestContext,
	 * etc......
	 * 
	 * @param driver
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public ValidateTwitterHandle_PageObject(WebDriver driver, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
	}

	/**
	 * Click on Twitter link 
	 * @author Pravinkumar D Kadam
	 */
	public void click_twitter_link() {
		javaScriptUtil.scrollPageDown();
		utilities.ClickElement(TwitterHandle_Locator);
		scn.log("Click on Twitter link ");
		logger.info("Click on Twitter link ");

	}

	/**
	 * validate_twitter_account_name
	 * @author Pravinkumar D Kadam
	 */
	public void validate_twitter_account_name() {
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();

		String LandingPage = it.next();
		String Twitterpage = it.next();

		driver.switchTo().window(Twitterpage);
		String ActualText = utilities.doGetText(ValidateTwitterHandle_Locator);
		String ExpectedText = ValidateTwitterHandle_Variables;
		Assert.assertEquals("Assertion failed.", ExpectedText, ActualText);
		scn.log("Validation Twitter Handle.");
		logger.info("Validation Twitter Handle.");

	}
}
