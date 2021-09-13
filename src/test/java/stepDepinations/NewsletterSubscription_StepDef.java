package stepDepinations;

import base.TestContext;
import io.cucumber.java.en.Then;

/**
 * @author Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @see Following script is the automation testing simulation for the
 *      Application - "http://automationpractice.com/index.php?"
 */
public class NewsletterSubscription_StepDef extends TestContext {

	@Then("Send a random email id {string} and {string} in newsletter subscription text box")
	public void send_a_random_email_id_in_newsletter_subscription_text_box(String MailID,String Tag) {
		newsletterSubscription_PageObject.send_random_emailID_in_newsletter_subscription_box(MailID,Tag);
	}

	@Then("Click on proceed button")
	public void click_on_proceed_button() {
		newsletterSubscription_PageObject.click_Proceed_Button();
	}

	@Then("Validate the message text for successful email subscription")
	public void validate_the_message_text_for_successful_email_subscription() {
		newsletterSubscription_PageObject.validate_text_for_successful_email_subscription();

	}
}