package stepDepinations;

import base.TestContext;
import io.cucumber.java.en.Then;

/**
 * @author Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @see @Following script is the automation testing simulation for the
 *      Application - "http://automationpractice.com/index.php?"
 */
public class ValidateFacebookHandle_StepDef extends TestContext {

	@Then("Click on the Facebook link")
	public void click_on_the_facebook_link() {
		validateFacebookHandle_PageObject.click_facebook_link();
	}

	@Then("Validate the Facebook page name")
	public void validate_the_facebook_page_name() {
		validateFacebookHandle_PageObject.validate_facebook_page_name();
	}

}
