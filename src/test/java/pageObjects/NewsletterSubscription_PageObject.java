package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.TestContext;
import interfaces.Locators;
import interfaces.Variables;
import io.cucumber.java.Scenario;

/**
 * There is a object repository for the operations offered by
 * 'NewsletterSubscription_PageObject' class. This class help to achieve
 * encapsulation.
 * 
 * @Author: Pravinkumar D Kadam
 * @Date: 12-September-2021
 * @Description: Test com.automationPractice-BDD FW development
 */
public class NewsletterSubscription_PageObject extends TestContext implements Locators, Variables {

	private static final Logger logger = LogManager.getLogger(NewsletterSubscription_PageObject.class);

	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;

	/**
	 * This is constructor of NewsletterSubscription_PageObject class Use to
	 * initialize all WebDriver/Scenario/WebDriverWait/etc
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public NewsletterSubscription_PageObject(WebDriver driver, Scenario scn, WebDriverWait wait) {
		this.driver = driver;
		this.scn = scn;
		this.wait = wait;
	}

	/**
	 * method help to enter email id in newsletter subscription box.
	 * 
	 * @author Pravinkumar D Kadam
	 * @param mailID
	 */
	public void send_random_emailID_in_newsletter_subscription_box(String mailName,String MailTag) {
		javaScriptUtil.scrollPageDown();
		String mailID = utilities.newCreatedMailId(mailName, MailTag);
		utilities.enterText(mailID, newsletterSubscriptionBox_Locator);
		scn.log("Email ID '" + mailID+"' in newsletter subscription box enter.");
		logger.info("Email ID '" + mailID+"' in newsletter subscription box enter.");
	}

	/**
	 * method help to click on proceed button.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void click_Proceed_Button() {
		utilities.ClickElement(submitNewsletter_Locator);
		scn.log("click on proceed button.");
		logger.info("click on proceed button.");
	}

	/**
	 * method help to Validate the message text for successful email subscription.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void validate_text_for_successful_email_subscription() {
		String ExpectedMassage = utilities.doGetText(ValidateSuccessfulEmailSubscription_Locator);
		Assert.assertEquals("", ValidateSuccessfulEmailSubscription_Vaiables, ExpectedMassage);
		scn.log(ExpectedMassage);
		logger.info(ExpectedMassage);
	}
}
