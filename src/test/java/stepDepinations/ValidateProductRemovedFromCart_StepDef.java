package stepDepinations;

import base.TestContext;
import io.cucumber.java.en.Then;


/**
 * @author Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date: 12-September-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @see @following script is the automation testing simulation for the
 *      Application - "http://automationpractice.com/index.php?"
 */
public class ValidateProductRemovedFromCart_StepDef extends TestContext {

	@Then("Click on the cross button to remove product from cart")
	public void click_on_the_cross_button_to_remove_product_from_cart() {
		validateProductRemovedFromCart_PageObject.click_on_cross_button_to_remove_product_from_cart();
	}

	@Then("Check the cart value updated with {int}")
	public void check_the_cart_value_updated_with(Integer CartValue) {
		validateProductRemovedFromCart_PageObject.check_the_cart_value_updated_with(CartValue);
	}
}
