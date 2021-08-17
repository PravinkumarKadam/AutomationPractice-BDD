package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.Scenario;
import pageObjects.LandingPagePageObject;
import pageObjects.SignInPageObjects;

public class TestContext {

	public WebDriver driver;
	public Scenario scn;
	public Utilities utilities;
	public LandingPagePageObject landingPagePageObject;
	public BrowserFactory browserFactory;
	public SignInPageObjects signInPageObjects;
	public WebDriverWait wait;

	public void initializeWebDriver() throws Exception {
		driver = browserFactory.opeingBrowser();
	}

	public void initializationOfObjects() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 40);

		utilities = new Utilities(driver);
		landingPagePageObject = new LandingPagePageObject(driver);
		signInPageObjects = new SignInPageObjects(driver);

	}

	public void quitDriver() {
		driver.quit();
	}

}
