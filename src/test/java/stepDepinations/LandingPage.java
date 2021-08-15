package stepDepinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import base.Utilites;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.InitializeBrowser;
import pageObjects.LandingPagePageObject;
import io.cucumber.java.Scenario;

public class LandingPage {

	private static final Logger logger = LogManager.getLogger(LandingPage.class);

	Scenario scn;

	WebDriver driver = new ChromeDriver();
	Utilites utilites = new Utilites(driver, scn);
	InitializeBrowser initializeBrowser = new InitializeBrowser(driver, scn);
	LandingPagePageObject landingPagePageObject = new LandingPagePageObject(driver, scn);

	@Given("user open Web application")
	public void user_open_web_application() {
		initializeBrowser.ini_driver();
	}

	@When("user enter {string} url")
	public void user_enter_url(String url) {
		utilites.enterUrl(url);
	}

	@Then("user assert {string} url to current home page url")
	public void user_assert_url_to_current_home_page_url(String url) {
		utilites.assertUrl(url);

	}

	@Then("close web application")
	public void close_web_application() {
		utilites.closeDriver();

	}

	@Then("user fetching product category list")
	public void user_fetching_product_category_list() {
		landingPagePageObject.productlist();

	}

	@When("User assert {string} title with corrent page title")
	public void user_assert_title_with_corrent_page_title(String title) {
		utilites.assertPageTitle(title);

	}

	@Then("user fetching title of landing page")
	public void user_fetching_title_of_landing_page() {
		utilites.getCurentPageTittle();
	}

	@Then("user check on landing page Logo is Display or not")
	public void user_check_on_landing_page_logo_is_display_or_not() {
		landingPagePageObject.LogoDisplay();
	}

}
