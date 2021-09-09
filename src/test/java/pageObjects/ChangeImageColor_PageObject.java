package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.WaitUtilities;
import base.TestContext;
import interfaces.Locators;
import io.cucumber.java.Scenario;

/**
 * There is a object repository for the operations offered by
 * 'ChangeImageColor_PageObject' class. This class help to achieve
 * encapsulation.
 * 
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 */
public class ChangeImageColor_PageObject extends TestContext implements Locators {

	private static final Logger logger = LogManager.getLogger(ChangeImageColor_PageObject.class);

	WebDriver driver;
	Scenario scn;

	
	/**
	 * It is parameterized constructor of ChangeImageColor_PageObject class.
	 * It use to initialize all driver, Scenario, WebDriverWait, TestContext,
	 * etc......
	 * 
	 * @param driver
	 * @param scn
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public ChangeImageColor_PageObject(WebDriver driver, Scenario scn) {
		this.scn = scn;
		this.driver = driver;
	}

	/**
	 *Method help to Select category T-shirts.
	 * @author Pravinkumar D Kadam
	 */
	public void select_category_t_shirts() {
		utilities.ClickElement(Tshirts_Locator);
		scn.log("Click on T-shirts product category.");
		logger.info("Click on T-shirts product category.");
	}

	/**
	 * Method help for choose blue color of product.
	 * @author Pravinkumar D Kadam
	 */
	public void click_on_color_blue() {
		javaScriptUtil.scrollIntoView_ByLocator(ProductView_Locator);
		mouseAction.moveToelement(productColorBlue_Locator);
		utilities.ClickElement(productColorBlue_Locator);
		scn.log("Click on blue color.");
		logger.info("Click on blue color.");
	}

	/**
	 * method help to check the product color is change or not.
	 * @author Pravinkumar D Kadam
	 */
	public void check_image_is_changed() {
		javaScriptUtil.scrollIntoView_ByLocator(ColorChangeProduct_Locator);
		WaitUtilities.Wait_MegaBytes();
		WebElement ele = driver.findElement(ColorChangeProduct_Locator);
		Assert.assertTrue(ele.isDisplayed());
		scn.log("Assertion completed and product color is changed.");
		logger.info("Assertion completed and product color is changed.");
	}

}
