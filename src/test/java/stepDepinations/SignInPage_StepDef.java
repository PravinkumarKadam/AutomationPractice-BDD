package stepDepinations;

import base.TestContext;
import io.cucumber.java.en.Then;


/**
 * @author Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date:    19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * 
 * @see
 * @Following script is the automation testing simulation
 * for the Application - "http://automationpractice.com/index.php?"
 * 
 */

public class SignInPage_StepDef extends TestContext{

	
	@Then("click on SignIn button")
	public void click_on_sign_in_button() {
		signInPageObjects.ClickSignButton();
	}

	@Then("fetching SignIn page title and assert it")
	public void fetching_signIn_page_title_and_assert_it() {
		String pageTitle = utilities.getCurentPageTittle();
		utilities.assertPageTitle(pageTitle);
	}

	@Then("user fill mail ID {string} and {string}")
	public void user_fill_mail_id_and(String mail, String mailTag) {
		signInPageObjects.enterMailID(mail, mailTag);
	}

	@Then("click on Create and Account button")
	public void click_on_create_and_account_button() throws InterruptedException {
		signInPageObjects.ClickCreatAccountButton();

	}

}
