package stepDepinations;

import base.TestContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @see
 * Following script is the automation testing simulation
 * for the Application - "http://automationpractice.com/index.php?"
 */
public class SendAFriendFeature_StepDef {

	TestContext testContext;
	Scenario scn;

	public SendAFriendFeature_StepDef(TestContext testContext) {
		this.testContext = testContext;
		this.scn = testContext.scn;
	}

	@When("Use already created username {string} and password {string} to login into the application")
	public void use_already_created_username_and_password_to_login_into_the_application(String username,
			String password) {
		testContext.sendAFriendFeature_PageObject.UseAlreadyCreatedUsernameAndPassword(username, password);
	}

	@When("Select the category as T-Shirts")
	public void select_the_category_as_t_shirts() {
		testContext.sendAFriendFeature_PageObject.select_category_t_shirts();
	}

	@Then("Click on the product: Faded Short Sleeve T-shirts More option")
	public void click_on_the_product_faded_short_sleeve_t_shirts_more_option() {
		testContext.sendAFriendFeature_PageObject.T_shirts_More_option();
	}

	@Then("Click Send to a Friend Link")
	public void click_send_to_a_friend_link() {
		testContext.sendAFriendFeature_PageObject.ClickSendToFriendLink();
	}

	@Then("Fill the details {string} and {string} click on Send button.")
	public void fill_the_details_and_click_on_send_button(String FriendName, String FriendMailID) {
		testContext.sendAFriendFeature_PageObject.Fill_details_click_Send_button(FriendName, FriendMailID);
	}

	@Then("Validate the Message appeared in the Email sent in a pop up.")
	public void validate_the_message_appeared_in_the_email_sent_in_a_pop_up() {
		testContext.sendAFriendFeature_PageObject.validatesendOption();
	}

}
