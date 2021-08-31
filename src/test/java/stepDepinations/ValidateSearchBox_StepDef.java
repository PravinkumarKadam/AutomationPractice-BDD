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
 * 
 */
public class ValidateSearchBox_StepDef {

	public Scenario scn;
	TestContext testContext;

	public ValidateSearchBox_StepDef(TestContext testContext) {
		this.testContext = testContext;
		this.scn = testContext.scn;
	}

	@When("Search for the product {string} in the given search box")
	public void search_for_the_product_in_the_given_search_box(String Text) {
		testContext.validateSearchBoxPageObject.SearchProducSearchBox(Text);
	}

	@Then("Fetch the result and print the result")
	public void fetch_the_result_and_print_the_result() {
		testContext.validateSearchBoxPageObject.fetchResultPrint();
	}

}
