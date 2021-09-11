package stepDepinations;

import base.TestContext;
import io.cucumber.java.en.Then;

/**
 * @author Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date: 12-September-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @see Following script is the automation testing simulation for the
 *      Application - "http://automationpractice.com/index.php?"
 */
public class ValidateTotalCorrectInCart_StepDef extends TestContext {

	@Then("Check the total of all three individual products")
	public void check_the_total_of_all_three_individual_products() {
		validateTotalCorrectInCart_PageObject.check_the_total_of_all_three_individual_products();
	}

	@Then("assert product total is matching with the cart total")
	public void assert_product_total_is_matching_with_the_cart_total() {
		validateTotalCorrectInCart_PageObject.assert_product_total_is_matching_with_the_cart_total();
	}

}
