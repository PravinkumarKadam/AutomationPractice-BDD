package pageObjects;

/* Author:  Pravinkumar D Kadam
 * Company: VisionIT
 * Date:    19-August-2021
 * Description: Test com.automationPractice-BDD FW development
 */

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestContext;
import interfaces.Locators;
import io.cucumber.java.Scenario;

/**
 * There is a object repository for the operations offered by
 * 'LandingPage_PageObject' class. This class help to achieve encapsulation.
 * 
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 */
public class LandingPage_PageObject extends TestContext implements Locators {

	private static final Logger logger = LogManager.getLogger(LandingPage_PageObject.class);

	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;
	
	/**
	 * It is constructor of LandingPage_PageObject class. It use to
	 * initialize all driver, Scenario, WebDriverWait, TestContext, etc......
	 * @author Pravinkumar D Kadam
	 */
	public LandingPage_PageObject(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.wait = wait;
		this.scn = scn;
	}
	/**
	 * Method contain one for each loop which help to fetching product category
	 * list.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void productlist() {

		List<WebElement> productList = driver.findElements(productCatageroyLocator);

		scn.log("Product list :: ");
		logger.info("Product list :: ");
		for (WebElement e : productList)

		{
			scn.log("             " + e.getText());
			logger.info("             " + e.getText());
		}

	}

	/**
	 * Method check and assert logo on Landing page. function are use like
	 * Explicitly wait(WebDriverWait), By Locator , org.junit.Assert
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void logoDisplay() {
		utilities.waitForElementClickable(logoImageLocator);
		WebElement logo = driver.findElement(logoImageLocator);
		javaScriptUtil.flash(logo);
		boolean logoDisplayOrNOt = logo.isDisplayed();
		Assert.assertTrue("Logo is not displayed.", logoDisplayOrNOt);
		scn.log("Logo is Display :> " + logoDisplayOrNOt);
		logger.info("Logo is Display :> " + logoDisplayOrNOt);
	}

	/**
	 * Method help to check logo(Which is present on landing page) Width and height.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void logoWidth_Height() {
		utilities.waitForElementClickable(logoImageLocator);
		WebElement logoSize = driver.findElement(logoImageLocator);
		scn.log("Logo Height is :> " + logoSize.getSize().getHeight());
		logger.info("Logo Height is :> " + logoSize.getSize().getHeight());
		scn.log("Logo Width is :> " + logoSize.getSize().getWidth());
		logger.info("Logo Width is :> " + logoSize.getSize().getWidth());

	}

	/**
	 * Method assert Logo (Which is present on landing page) size.
	 * 
	 * @param Height
	 * @param width
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void assertingLogoSize(String Height, String width) {
		int Height_1 = Integer.parseInt(Height);
		int width_1 = Integer.parseInt(width);
		utilities.waitForElementClickable(logoImageLocator);
		WebElement logoSize = driver.findElement(logoImageLocator);
		Assert.assertEquals("User failed to assert logo Height", Height_1, logoSize.getSize().getHeight());
		Assert.assertEquals("user failed to assert width of logo ", width_1, +logoSize.getSize().getWidth());
		
		scn.log("User successfully assert log height and width are respectively " + logoSize.getSize().getHeight()
				+ " and " + logoSize.getSize().getWidth());
		logger.info("User successfully assert log height and width are respectively " + logoSize.getSize().getHeight()
				+ " and " + logoSize.getSize().getWidth());
	}

}
