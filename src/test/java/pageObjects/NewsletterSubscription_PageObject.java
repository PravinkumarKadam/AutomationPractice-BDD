package pageObjects;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
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
@Log4j2
@AllArgsConstructor
public class NewsletterSubscription_PageObject extends TestContext implements Locators, Variables {

		WebDriver driver;
		Scenario scn;
		WebDriverWait wait;


	/**
	 * method help to enter email id in newsletter subscription box.
	 * 
	 * @author Pravinkumar D Kadam
	 * @param mailName ,MailTag
	 */
	public void send_random_emailID_in_newsletter_subscription_box(String mailName,String MailTag) {
		javaScriptUtil.scrollPageDown();
		String mailID = utilities.newCreatedMailId(mailName, MailTag);
		utilities.enterText(mailID, newsletterSubscriptionBox_Locator);
		scn.log("Email ID '" + mailID+"' in newsletter subscription box enter.");
		log.info("Email ID '" + mailID+"' in newsletter subscription box enter.");

	}

	/**
	 * method help to click on proceed button.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void click_Proceed_Button() {
		utilities.ClickElement(submitNewsletter_Locator);
		scn.log("click on proceed button.");
		log.info("click on proceed button.");
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
		log.info(ExpectedMassage);
	}
}
