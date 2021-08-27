package base;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.Scenario;
import pageObjects.CreateAnAccountPageObject;
import pageObjects.LandingPagePageObject;
import pageObjects.SignInPageObjects;

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
	public TestContext testContext;
	public Utilities utilities;
	public LandingPagePageObject landingPagePageObject;
	public BrowserFactory browserFactory;
	public SignInPageObjects signInPageObjects;
	public WebDriverWait wait;
	public CreateAnAccountPageObject createAnAccountPageObject;
	public WebDriverUtilities webDriverUtilities;
	public WaitUtilities waitUtilities;
	public JavaScriptUtil javaScriptUtil;

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
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 40);

		testContext = new TestContext();
		utilities = new Utilities(driver, wait, scn);
		landingPagePageObject = new LandingPagePageObject(driver, wait, scn);
		signInPageObjects = new SignInPageObjects(driver, wait, scn);
		createAnAccountPageObject = new CreateAnAccountPageObject(driver, wait, scn);
		waitUtilities = new WaitUtilities(driver, scn);
		webDriverUtilities = new WebDriverUtilities(driver, scn);
		javaScriptUtil = new JavaScriptUtil(driver);
	}

	/**
	 * This method help to close all current open tab
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void quitDriver() {
		driver.quit();
	}

}
