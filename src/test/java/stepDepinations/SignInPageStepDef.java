package stepDepinations;

import base.TestContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;


public class SignInPageStepDef {

	public Scenario scn;
	TestContext testContext;

	public SignInPageStepDef(TestContext testContext) 
	{
		this.testContext = testContext;
		this.scn = testContext.scn;
	}


	@Then("click on SignIn button")
	public void click_on_sign_in_button() {
		testContext.signInPageObjects.ClickSignButton();
	}

	@Then("fetching SignIn page title and assert it")
	public void fetching_signIn_page_title_and_assert_it() {
      
		String pageTitle = testContext.utilities.getCurentPageTittle();
		testContext.utilities.assertPageTitle(pageTitle);
	}






}
