package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.JavaScriptUtil;
import Utilities.MouseAction;
import Utilities.ScreenShot;
import Utilities.Utilities;
import Utilities.WebDriverUtilities;
import io.cucumber.java.Scenario;
import pageObjects.AllProductPriceAndTotal_PageObject;
import pageObjects.CreateAnAccount_PageObject;
import pageObjects.LandingPage_PageObject;
import pageObjects.SendAFriendFeature_PageObject;
import pageObjects.SignInPage_PageObjects;
import pageObjects.ValidateSearchBox_PageObject;

/**
 * This class help to initialize Objects of all classes.
 * 
 * @Author: Pravinkumar D Kadam
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 */
public class TestContext {

	public static WebDriver driver;
	public static Scenario scn;
	public static WebDriverWait wait;

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

	/**
	 * This method use open browser. It also using property file's key to open
	 * specific Browser , set implicitly Wait , maximize browser , etc...
	 * 
	 * @Information : Method implement contains/methods from different classes like
	 *              BrowserFactory , BaseClass
	 * @throws Exception
	 * @Return Web Driver , implicitly wait, maximize browser, etc..
	 */
	public  void initializeWebDriver() throws Exception {
		driver = browserFactory.openingBrowser();
	}

	/**
	 * This method use to setup Driver as well as create class object.
	 * 
	 * @return Scenario,classes Object, initialize Web Driver, WebDriverWait,
	 *         etc,...
	 * @author Pravinkumar D Kadam
	 */
	public void initializationOfObjects(Scenario scn) {
		this.scn = scn;
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--Incognito");
//		option.addArguments("--headless");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 40);

		utilities = new Utilities(driver,scn,wait);
		webDriverUtilities = new WebDriverUtilities(driver,scn,wait);
		javaScriptUtil = new JavaScriptUtil(driver,scn,wait);
		mouseAction = new MouseAction(driver,scn,wait);
		screenShot = new ScreenShot(driver,scn,wait);

		createAnAccountPageObject = new CreateAnAccount_PageObject(driver,scn,wait);
		landingPagePageObject = new LandingPage_PageObject(driver, wait, scn);
		signInPageObjects = new SignInPage_PageObjects(driver,scn);
		validateSearchBoxPageObject = new ValidateSearchBox_PageObject(driver,scn,wait);
		allProductPriceAndTotal_PageObject = new AllProductPriceAndTotal_PageObject(driver,scn);
		sendAFriendFeature_PageObject = new SendAFriendFeature_PageObject(driver,scn,wait);

	}

}
