package stepDepinations;

import base.TestContext;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;

public class CreateAnAccountStepDef {

	public Scenario scn;
	TestContext testContext;

	public CreateAnAccountStepDef(TestContext testContext) {

		this.testContext = testContext;
		this.scn = testContext.scn;
	}
	
	@Before
	public void setup(Scenario scn){this.scn = scn;}

	@Then("salect gender")
	public void salect_gender() {
		testContext.createAnAccountPageObject.selectGender();
	}

	@Then("user enter valid data on the page")
	public void user_enter_valid_data_on_the_page(io.cucumber.datatable.DataTable table) {
		testContext.createAnAccountPageObject.enterValidData(table);
	}

	@Then("assert registration form")
	public void assert_registration_form() {
		testContext.createAnAccountPageObject.assertFormFill();
	}

	@Then("click on Register button")
	public void click_on_register_button() {
		testContext.createAnAccountPageObject.clickRegisterButton();

	}

}