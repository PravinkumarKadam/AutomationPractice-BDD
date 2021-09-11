package Utilities;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestContext;
import io.cucumber.java.Scenario;

/**
 * This class having the wrapper methods on top of Selenium WebDriver methods to
 * interact with elements on WebPage with the ease of use to minimize the
 * efforts for the script writers
 * 
 * @Author: Pravinkumar D Kadam
 * @Description: Test com.automationPractice-BDD FW development
 */
public class Utilities extends TestContext {

	private static final Logger logger = LogManager.getLogger(Utilities.class);

	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;

	/**
	 * This is constructor of Utilities class. This constructor initialize
	 * WebDriver, WebDriverWait, WebDriverWait, Scenario
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public Utilities(WebDriver driver, Scenario scn, WebDriverWait wait) {
		this.driver = driver;
		this.scn = scn;
		this.wait = wait;
	}

	/**
	 * This method use to enter url.
	 * 
	 * @param url
	 * @author Pravinkumar D Kadam
	 */
	public void enterUrl(String url) {
		driver.get(url);
		scn.log("Driver initialized successfully.");
	}

	/**
	 * Method help to Assert current page url.
	 * 
	 * @param url
	 * @author PravinKumar D Kadam
	 */
	public void assertUrl(String url) {
		Assert.assertEquals("Url assertion failed", url, driver.getCurrentUrl());
		System.out.println("User successfully asserted url and test case passed");
		scn.log("asserting url " + url + " with current page url :> " + driver.getCurrentUrl());
		logger.info("asserting url " + url + " with current page url :> " + driver.getCurrentUrl());
	}

	/**
	 * Method fetch current page title. It also print current page title into the
	 * report.
	 * 
	 * @return Current page title
	 * @author PravinKumar D Kadam
	 */
	public String getCurentPageTittle() {
		scn.log("user fetching current page title :> " + driver.getTitle());
		logger.info("user fetching current page title :> " + driver.getTitle());
		return driver.getTitle();
	}

	/**
	 * Method help to fetching current page title and assert it. It also print
	 * current page title into the report.
	 * 
	 * @param title
	 * @author Pravinkumar D Kadam
	 */
	public void assertPageTitle(String title) {
		Assert.assertEquals("user unable to asserting page title ", title, driver.getTitle());
		System.out.println("User Assert Page Title successfully Test case passed.");
		scn.log("User assert Current page tile '" + driver.getTitle() + "' successfully.");
		logger.info("User assert Current page tile '" + driver.getTitle() + "' successfully.");
	}

	/**
	 * Method take screen Shot If any Scenario is failed. And finally closed all tab
	 * of web browser.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void closeDriver(Scenario scn) {
		try {
			screenShot.ScreenShotOfFailedScenario(scn);
		} finally {
			driver.quit();
			scn.log("Browser closed.");
			logger.info("Browser closed.");
		}
	}

	/**
	 * Method used to enter editable content in the text and password fields during
	 * test execution.
	 * 
	 * @param text
	 * @param Locator
	 * @author Pravinkumar D Kadam
	 */
	public void enterText(String text, By Locator) {
		utilities.waitForElementVisibilityOfElementLocated(Locator);
		WebElement element = driver.findElement(Locator);
		javaScriptUtil.drawBorder_ByElement(element);
		element.sendKeys(text);
	}

	/**
	 * Method help to Click the element.
	 * 
	 * @param locator
	 * @author Pravinkumar D Kadam
	 */
	public void ClickElement(By locator) {
		utilities.waitForElementVisibilityOfElementLocated(locator);
		WebElement element = driver.findElement(locator);
		javaScriptUtil.flash(element);
		element.click();
	}

	/**
	 * This method wait Explicitly for 40 sec until element is available for click.
	 * 
	 * @author Pravinkumar D Kadam
	 * @param locator
	 */
	public void waitForElementClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * This method wait Explicitly for 40 sec until element is Visible.
	 * 
	 * @param locator
	 * @author Pravinkumar D Kadam
	 */
	public void waitForElementVisibilityOfElementLocated(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * This method used to fetch the text from the WebElement and return in form of
	 * String
	 * 
	 * @param locator
	 * @return String value of the WebElement
	 * @author Pravinkumar D Kadam
	 */
	public String doGetText(By locator) {
		String text = null;
		WebElement element = driver.findElement(locator);
		javaScriptUtil.flash(element);
		text = driver.findElement(locator).getText();
		return text;
	}

	

	

}
