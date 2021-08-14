package stepDepinations;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import base.Utilites;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Scenario;
import pageObjects.InitializeBrowser;


public class LandingPage {

	private static final Logger logger = LogManager.getLogger(LandingPage.class);

	//Scenario scn;



	WebDriver driver = new ChromeDriver();
	Utilites utilites = new Utilites(driver);
	InitializeBrowser initializeBrowser = new InitializeBrowser(driver);




	@Given("user open Web application")
	public void user_open_web_application() 
	{   
		initializeBrowser.ini_driver();	
	}

	@When("user enter {string} url")
	public void user_enter_url(String url) 
	{
		utilites.enterUrl(url);		
		//scn.log("Driver initialized successfully.");
	}


	@Then("user assert {string} url to current home page url")
	public void user_assert_url_to_current_home_page_url(String url) 
	{
		utilites.assertUrl(url);
		//scn.log("asserting url " + url+ " with courrent page url.");
	}

	@Then("close web application")
	public void close_web_application() {

		utilites.closeDriver();
		//scn.log("Browser colsed.");
	}

                                                                          

	@Then("user faching title of landing page")
	public void user_faching_title_of_landing_page() 
	{
		utilites.getCurentPageTittle();
       //scn.log("user faching current page title :" + driver.getTitle());
	}

	@Then("User assert {string} titile with corrent page titale")
	public void user_assert_titile_with_corrent_page_titale(String titile) 
	{
		utilites.assertPageTitile(titile);
       //scn.logo("User assert Curent page tile succesfully.");
	}


}
