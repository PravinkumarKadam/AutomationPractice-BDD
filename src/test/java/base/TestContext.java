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
import Utilities.WaitUtilities;
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

	public WebDriver driver;
	public Scenario scn;
	public WebDriverWait wait;

	public BrowserFactory browserFactory;

	public Utilities utilities;
	public WebDriverUtilities webDriverUtilities;
	public WaitUtilities waitUtilities;
	public JavaScriptUtil javaScriptUtil;
	public MouseAction mouseAction;
	public ScreenShot screenShot;

	public SignInPage_PageObjects signInPageObjects;
	public CreateAnAccount_PageObject createAnAccountPageObject;
	public LandingPage_PageObject landingPagePageObject;
	public ValidateSearchBox_PageObject validateSearchBoxPageObject;
	public AllProductPriceAndTotal_PageObject allProductPriceAndTotal_PageObject;
	public SendAFriendFeature_PageObject sendAFriendFeature_PageObject;

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
	 */
	public void initializationOfObjects(Scenario scn) {
		this.scn = scn;
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--Incognito");
		// option.addArguments("--headless");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 40);

		utilities = new Utilities(driver, wait, scn);
		waitUtilities = new WaitUtilities(driver, scn);
		webDriverUtilities = new WebDriverUtilities(driver, scn);
		javaScriptUtil = new JavaScriptUtil(driver);
		mouseAction = new MouseAction(driver, wait, scn);
		screenShot = new ScreenShot(driver, scn);

		createAnAccountPageObject = new CreateAnAccount_PageObject(driver, wait, scn);
		landingPagePageObject = new LandingPage_PageObject(driver, wait, scn);
		signInPageObjects = new SignInPage_PageObjects(driver, wait, scn);
		validateSearchBoxPageObject = new ValidateSearchBox_PageObject(driver, wait, scn);
		allProductPriceAndTotal_PageObject = new AllProductPriceAndTotal_PageObject(driver, wait, scn);
		sendAFriendFeature_PageObject = new SendAFriendFeature_PageObject(driver, wait, scn);
	}

}
