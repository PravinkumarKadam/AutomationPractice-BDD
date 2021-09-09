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
public class ValidateTwitterHandle_StepDef extends TestContext {

	@Then("Click on the Twitter link")
	public void click_on_the_twitter_link() {
		validateTwitterHandle_PageObject.click_twitter_link();
	}

	@Then("Validate the Twitter Account name")
	public void validate_the_twitter_account_name() {
		validateTwitterHandle_PageObject.validate_twitter_account_name();
	}

}
