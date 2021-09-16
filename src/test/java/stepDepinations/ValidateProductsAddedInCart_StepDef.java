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
public class ValidateProductsAddedInCart_StepDef extends TestContext {
	
	
	@Then("Validate items with same name got added in cart")
	public void validate_items_with_same_name_got_added_in_cart() {
		validateProductsAddedInCart_PageObject.validate_items_with_added_in_cart();
	}

}
