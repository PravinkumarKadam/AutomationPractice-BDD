package stepDepinations;

import base.TestContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllProductPriceAndTotal_StepDef {

	Scenario scn;
	TestContext testContext;

	public AllProductPriceAndTotal_StepDef(TestContext testContext) {
		this.testContext = testContext;
		this.scn = testContext.scn;
	}

	@When("Validate {string} option is displayed with all characters in Uppercase")
	public void validate_option_is_displayed_with_all_characters_in_uppercase(String productName) {
		testContext.allProductPriceAndTotal_PageObject.validateDressesOption(productName);
	}

	@When("Click on the DRESS section")
	public void click_on_DRESS_the_section() {
		testContext.allProductPriceAndTotal_PageObject.ClickOnElement();
	}

	@Then("Fetch all the prices Make the sum of all products.")
	public void fetch_all_the_prices_of_the_products_as_highlighted() {
		testContext.allProductPriceAndTotal_PageObject.fetch_all_the_prices();
	}

}
