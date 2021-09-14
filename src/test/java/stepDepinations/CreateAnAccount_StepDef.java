package stepDepinations;

import base.TestContext;
import io.cucumber.java.en.Then;

/**
 * @author Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @see
 * @@Following script is the automation testing simulation
 * for the Application - "http://automationpractice.com/index.php?"
 */
public class CreateAnAccount_StepDef extends TestContext {

	@Then("salect gender")
	public void salect_gender() {
		createAnAccountPageObject.selectGender();
	}

	@Then("user enter valid data on the page")
	public void user_enter_valid_data_on_the_page(io.cucumber.datatable.DataTable table) {
		createAnAccountPageObject.enterValidData(table);
	}

	@Then("assert registration form")
	public void assert_registration_form() {
		createAnAccountPageObject.assertFormFill();
	}

	@Then("click on Register button")
	public void click_on_register_button() {
		createAnAccountPageObject.clickRegisterButton();

	}

}