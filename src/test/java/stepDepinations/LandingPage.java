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

	//Scenario scn;



	WebDriver driver = new ChromeDriver();
	Utilites utilites = new Utilites(driver);
	InitializeBrowser initializeBrowser = new InitializeBrowser(driver);
	LandingPagePageObject landingPagePageObject = new LandingPagePageObject(driver);



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
	public void close_web_application() 
	{
		utilites.closeDriver();
		//scn.log("Browser colsed.");
	}



	@Then("user fetching product category list")
	public void user_fetching_product_category_list() 
	{
        landingPagePageObject.productlist();
        //scn.logo("Product list :: "+ landingPagePageObject.productlist());
	}


	@When("User assert {string} title with corrent page title")
	public void user_assert_title_with_corrent_page_title(String title) 
	{
		utilites.assertPageTitle(title);
		//scn.logo("User assert Curent page tile succesfully.");
	}

	@Then("user fetching title of landing page")
	public void user_fetching_title_of_landing_page() 
	{
		utilites.getCurentPageTittle();
		//scn.log("user faching current page title :" + driver.getTitle());
	}










}
