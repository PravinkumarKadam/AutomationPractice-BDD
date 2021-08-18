package stepDepinations;

import base.TestContext;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;

public class SignInPageStepDef {

	public Scenario scn;
	TestContext testContext;

	public SignInPageStepDef(TestContext testContext) {
		this.testContext = testContext;
		this.scn = testContext.scn;
	}
	
	@Before
	public void setup(Scenario scn){this.scn = scn;}

	@Then("click on SignIn button")
	public void click_on_sign_in_button() {
		testContext.signInPageObjects.ClickSignButton();
	}

	@Then("fetching SignIn page title and assert it")
	public void fetching_signIn_page_title_and_assert_it() {
		String pageTitle = testContext.utilities.getCurentPageTittle();
		testContext.utilities.assertPageTitle(pageTitle);
	}

	@Then("user fill mail ID {string} and {string}")
	public void user_fill_mail_id_and(String mail, String mailTag) {
		testContext.signInPageObjects.enterMailID(mail, mailTag);
	}

	@Then("click on Create and Account button")
	public void click_on_create_and_account_button() throws InterruptedException {
		testContext.signInPageObjects.ClickCreatAccountButton();

	}

}
