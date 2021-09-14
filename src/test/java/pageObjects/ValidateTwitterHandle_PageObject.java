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
public class ValidateTwitterHandle_PageObject extends TestContext implements Locators, Variables {


	WebDriver driver;
	Scenario scn;


	/**
	 * Click on Twitter link 
	 * @author Pravinkumar D Kadam
	 */
	public void click_twitter_link() {
		javaScriptUtil.scrollPageDown();
		utilities.ClickElement(TwitterHandle_Locator);
		scn.log("Click on Twitter link ");
		log.info("Click on Twitter link ");

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
		log.info("Validation Twitter Handle.");

	}
}
