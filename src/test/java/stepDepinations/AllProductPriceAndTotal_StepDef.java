package stepDepinations;

import base.TestContext;
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
public class AllProductPriceAndTotal_StepDef extends TestContext {


	@When("Validate {string} option is displayed with all characters in Uppercase")
	public void validate_option_is_displayed_with_all_characters_in_uppercase(String productName) {
		allProductPriceAndTotal_PageObject.validateDressesOption(productName);
	}

	@When("Click on the DRESS section")
	public void click_on_DRESS_the_section() {
		allProductPriceAndTotal_PageObject.ClickOnElement();
	}

	@Then("Fetch all the prices Make the sum of all products.")
	public void fetch_all_the_prices_of_the_products_as_highlighted() {
		allProductPriceAndTotal_PageObject.fetch_all_the_prices();
	}

}
