package Utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
public class Utilities {

	public Scenario scn;
	public WebDriver driver;
	public WebDriverWait wait;
	JavaScriptUtil javaScriptUtil;

	/**
	 * This is constructor of Utilities class. This constructor initialize
	 * WebDriver, WebDriverWait, WebDriverWait, Scenario
	 * 
	 * @param driver
	 * @param wait
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public Utilities(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.wait = wait;
		this.scn = scn;
		javaScriptUtil = new JavaScriptUtil(this.driver);
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
	}

	/**
	 * Method help to closed all tab in driver.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void closeDriver() {
		driver.quit();
		scn.log("Browser closed.");
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		WebElement element = driver.findElement(Locator);
		javaScriptUtil.flash(element);
		element.sendKeys(text);
	}

	public void ClickElement(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement element = driver.findElement(locator);
		javaScriptUtil.flash(element);
		element.click();
		scn.log("Click on element.");
	}

}
