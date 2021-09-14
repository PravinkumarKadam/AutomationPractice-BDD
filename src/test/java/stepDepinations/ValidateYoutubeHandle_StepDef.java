package stepDepinations;

import base.TestContext;
import io.cucumber.java.en.When;

/**
 * @author Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @see @Following script is the automation testing simulation for the
 *      Application - "http://automationpractice.com/index.php?"
 */
public class ValidateYoutubeHandle_StepDef extends TestContext {
	
	@When("Click on the Youtube link")
	public void click_on_the_youtube_link() {
	  validateYoutubeHandle_PageObject.click_youtube_link();
	}
	@When("Validate the youtube channel name")
	public void validate_the_youtube_channel_name() {
		validateYoutubeHandle_PageObject.validate_youtube_channel_name();
	}




}
