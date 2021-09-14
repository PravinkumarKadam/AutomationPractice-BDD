package base;

import java.util.Properties;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.JavaScriptUtil;
import Utilities.MouseAction;
import Utilities.ScreenShot;
import Utilities.Utilities;
import Utilities.WebDriverUtilities;
import io.cucumber.java.Scenario;
import pageObjects.AllProductPriceAndTotal_PageObject;
import pageObjects.ChangeImageColor_PageObject;
import pageObjects.CreateAnAccount_PageObject;
import pageObjects.LandingPage_PageObject;
import pageObjects.NewsletterSubscription_PageObject;
import pageObjects.SendAFriendFeature_PageObject;
import pageObjects.SignInPage_PageObjects;
import pageObjects.ValidateCartValueUpdating_PageObject;
import pageObjects.ValidateFacebookHandle_PageObject;
import pageObjects.ValidateProductRemovedFromCart_PageObject;
import pageObjects.ValidateProductsAddedInCart_PageObject;
import pageObjects.ValidateSearchBox_PageObject;
import pageObjects.ValidateTotalCorrectInCart_PageObject;
import pageObjects.ValidateTwitterHandle_PageObject;
import pageObjects.ValidateYoutubeHandle_PageObject;

/**
 * This class help to initialize Objects of all classes.
 * 
 * @Author: Pravinkumar D Kadam
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 */

public class TestContext {
	@Getter@Setter
	public WebDriver driver;
	public Scenario scn;
	public WebDriverWait wait;
	public Properties prop;

	public static BrowserFactory browserFactory;

	public static Utilities utilities;
	public static WebDriverUtilities webDriverUtilities;
	public static JavaScriptUtil javaScriptUtil;
	public static MouseAction mouseAction;
	public static ScreenShot screenShot;

	public static SignInPage_PageObjects signInPageObjects;
	public static CreateAnAccount_PageObject createAnAccountPageObject;
	public static LandingPage_PageObject landingPagePageObject;
	public static ValidateSearchBox_PageObject validateSearchBoxPageObject;
	public static AllProductPriceAndTotal_PageObject allProductPriceAndTotal_PageObject;
	public static SendAFriendFeature_PageObject sendAFriendFeature_PageObject;
	public static ChangeImageColor_PageObject changeImageColor_PageObject;
	public static ValidateFacebookHandle_PageObject validateFacebookHandle_PageObject;
	public static ValidateTwitterHandle_PageObject validateTwitterHandle_PageObject;
	public static ValidateYoutubeHandle_PageObject validateYoutubeHandle_PageObject;  
	public static NewsletterSubscription_PageObject newsletterSubscription_PageObject;
	public static ValidateCartValueUpdating_PageObject validateCartValueUpdating_PageObject;
	public static ValidateProductsAddedInCart_PageObject validateProductsAddedInCart_PageObject;
	public static ValidateTotalCorrectInCart_PageObject validateTotalCorrectInCart_PageObject;
	public static ValidateProductRemovedFromCart_PageObject validateProductRemovedFromCart_PageObject;
   
    /**
	 * This method use open browser. It also using property file's key to open
	 * specific Browser , set implicitly Wait , maximize browser , etc...
	 * 
	 * @Information : Method implement contains/methods from different classes like
	 *              BrowserFactory , BaseClass
	 * @throws Exception
	 * @Return Web Driver , implicitly wait, maximize browser, etc..
	 */
	public void initializeWebDriver() throws Exception {
		driver = browserFactory.openingBrowser();
	}

	/**
	 * This method use to setup Driver as well as create class object.
	 * 
	 * @return Scenario,classes Object, initialize Web Driver, WebDriverWait,
	 *         etc,...
	 * @author Pravinkumar D Kadam
	 * @throws Exception
	 */
	public void initializationOfObjects(Scenario scn) throws Exception {
		this.scn = scn;
		browserFactory = new BrowserFactory();
		prop = browserFactory.intialization_pro();
		initializeWebDriver();
		wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("WebDriverWaitTimeout").trim()));

		utilities = new Utilities(driver, scn, wait);
		webDriverUtilities = new WebDriverUtilities(driver, scn, wait);
		javaScriptUtil = new JavaScriptUtil(driver, scn, wait);
		mouseAction = new MouseAction(driver, scn, wait);
		screenShot = new ScreenShot(driver, scn, wait);

		createAnAccountPageObject = new CreateAnAccount_PageObject(driver, scn, wait);
		landingPagePageObject = new LandingPage_PageObject(driver,scn,wait);
		signInPageObjects = new SignInPage_PageObjects(driver, scn);
		validateSearchBoxPageObject = new ValidateSearchBox_PageObject(driver, scn, wait);
		allProductPriceAndTotal_PageObject = new AllProductPriceAndTotal_PageObject(driver, scn);
		sendAFriendFeature_PageObject = new SendAFriendFeature_PageObject(driver, scn, wait);
		changeImageColor_PageObject = new ChangeImageColor_PageObject(driver, scn);
		validateFacebookHandle_PageObject = new ValidateFacebookHandle_PageObject(driver, scn);
		validateTwitterHandle_PageObject = new ValidateTwitterHandle_PageObject(driver, scn);
		validateYoutubeHandle_PageObject = new ValidateYoutubeHandle_PageObject(driver, scn);
		newsletterSubscription_PageObject = new NewsletterSubscription_PageObject(driver,scn, wait);
		validateCartValueUpdating_PageObject = new ValidateCartValueUpdating_PageObject(driver, scn);
		validateProductsAddedInCart_PageObject = new ValidateProductsAddedInCart_PageObject(driver, scn);
		validateTotalCorrectInCart_PageObject = new ValidateTotalCorrectInCart_PageObject(driver, scn,wait);
		validateProductRemovedFromCart_PageObject  = new ValidateProductRemovedFromCart_PageObject(driver, scn);


	}

}
