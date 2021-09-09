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

/**
 * There is a object repository for the operations offered by
 * 'ValidateFacebookHandle_PageObject' class. This class help to achieve
 * encapsulation.
 * 
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 */
public class ValidateFacebookHandle_PageObject extends TestContext implements Locators, Variables {

	private static final Logger logger = LogManager.getLogger(ValidateFacebookHandle_PageObject.class);

	WebDriver driver;
	Scenario scn;

	/**
	 * It is parameterized constructor of ValidateFacebookHandle_PageObject class.
	 * It use to initialize all driver, Scenario, WebDriverWait, TestContext,
	 * etc......
	 * 
	 * @param driver
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public ValidateFacebookHandle_PageObject(WebDriver driver, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
	}

	/**
	 * Click on facebook link 
	 * @author Pravinkumar D Kadam
	 */
	public void click_facebook_link() {
		javaScriptUtil.scrollPageDown();
		utilities.ClickElement(FacebookHandle_Locator);
		scn.log("Click on facebook link ");
		logger.info("Click on facebook link ");

	}

	/**
	 * Validation Facebook Handle.
	 * @author Pravinkumar D Kadam
	 */
	public void validate_facebook_page_name() {
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		
		String LandingPage = it.next();
		String facebookpage = it.next();
		
		driver.switchTo().window(facebookpage);
		String ActualText = utilities.doGetText(ValidateFacebookHandle_Locator);
		String ExpectedText = ValidateFacebookHandle_Variables;
		Assert.assertEquals("Assertion failed.", ExpectedText, ActualText);
		scn.log("Validation Facebook Handle.");
		logger.info("Validation Facebook Handle.");

	}

}
