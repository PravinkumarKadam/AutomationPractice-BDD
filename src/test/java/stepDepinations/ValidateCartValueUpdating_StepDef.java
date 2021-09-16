package stepDepinations;

import base.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date: 10-September-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @see @following script is the automation testing simulation for the
 *      Application - "http://automationpractice.com/index.php?"
 */
public class ValidateCartValueUpdating_StepDef extends TestContext {

	@When("Short Sleeve T-shirts products Add To Cart form landing page")
	public void short_sleeve_t_shirts_products_add_to_cart_form_landing_page() {
		validateCartValueUpdating_PageObject.addProductToCart_ShortSleeve_t_shirts();
	}

	@Then("Blouse products Add To Cart form landing page  form landing page")
	public void blouse_products_add_to_cart_form_landing_page_form_landing_page() {
		validateCartValueUpdating_PageObject.addProductToCart_blouse();
	}

	@Then("Printed Chiffon Dress products Add To Cart form landing page  form landing page")
	public void printed_chiffon_dress_products_add_to_cart_form_landing_page_form_landing_page() {
		validateCartValueUpdating_PageObject.addProductToCart_printed_chiffon_dress();
	}

	@When("click on Continue shopping button")
	public void click_on_continue_shopping_button() {
		validateCartValueUpdating_PageObject.clickOnContinueShoppingButton();
	}

	@Then("validate the cart is showing up count as {int}")
	public void validate_the_cart_is_showing_up_count_as(Integer ProductCount) {
		validateCartValueUpdating_PageObject.validate_cart_showing_count(ProductCount);
	}




}
