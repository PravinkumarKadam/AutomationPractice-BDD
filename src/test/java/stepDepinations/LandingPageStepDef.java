package stepDepinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/* @Author Pravinkumar Kadam
 * Date: 19-August-2021
 * Description: Test Automation FW development
 * Following script is the automation testing simulation
 * for the Application - "http://automationpractice.com/index.php?"
 * Where following test cases included
 *   1. URL Redirection Test
 *   2. Landing Page Title Test
 *   3. Product category validation Test
 *   4. Landing Page Application Logo Display Test
 *   5. Validate Application logo Height on Landing Page
 *   6. Validate Application Logo Width on Landing page
 *   7. SignIn page Title Validation Test
 *   8. Resister user with New Email Id on SignIn Page
 *  Note - To Execute the Test case no 8
 *         Change variables values for new account creation 
 *         i.   newUserEmailId
 *         ii.  userFirestName
 *         iii. userLastName 
 */

public class LandingPageStepDef {

	private static final Logger logger = LogManager.getLogger(LandingPageStepDef.class);

	public Scenario scn;
	TestContext testContext;

	public LandingPageStepDef(TestContext testContext) {
		this.testContext = testContext;
		this.scn = testContext.scn;
	}

	@Before
	public void setup(Scenario scn){this.scn = scn;}
	
	@Given("user open Web application")
	public void user_open_web_application() {
		testContext.initializationOfObjects(scn);	
	}

	@When("user enter {string} url")
	public void user_enter_url(String url) {
		testContext.utilities.enterUrl(url);
	}

	@Then("user assert {string} url to current home page url")
	public void user_assert_url_to_current_home_page_url(String url) {
		testContext.utilities.assertUrl(url);
	}

	@Then("close web application")
	public void close_web_application() {
		testContext.utilities.closeDriver();
	}

	@Then("user fetching product category list")
	public void user_fetching_product_category_list() {
		testContext.landingPagePageObject.productlist();
	}

	@When("User assert {string} title with current page title")
	public void user_assert_title_with_corrent_page_title(String title) {
		testContext.utilities.assertPageTitle(title);
	}

	@Then("user fetching title of landing page")
	public void user_fetching_title_of_landing_page() {
		testContext.utilities.getCurentPageTittle();
	}

	@Then("user check on landing page Logo is Display or not")
	public void user_check_on_landing_page_logo_is_display_or_not() {
		testContext.landingPagePageObject.logoDisplay();
	}

	@Then("user fetching Logo height and Width from Home page of application")
	public void user_faching_logo_hight_and_width_from_home_page_of_application() {
		testContext.landingPagePageObject.logoWidth_Height();
	}

	@Then("Assert Logo height and Width respectively {string} and {string}")
	public void assert_logh_hight_and_width_respectively_and(String Height, String width) {
		testContext.landingPagePageObject.assertingLogoSize(Height, width);
	}

}
