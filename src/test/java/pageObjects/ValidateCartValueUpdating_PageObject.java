package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import base.TestContext;
import interfaces.Locators;
import interfaces.Variables;
import io.cucumber.java.Scenario;

/**
 * There is a object repository for the operations offered by
 * 'ValidateCartValueUpdating_PageObject' class. This class help to achieve
 * encapsulation.
 * 
 * @Company: VisionIT
 * @Date: 12-September-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 */
public class ValidateCartValueUpdating_PageObject extends TestContext implements Locators, Variables {

	private static final Logger logger = LogManager.getLogger(ValidateCartValueUpdating_PageObject.class);

	WebDriver driver;
	Scenario scn;

	/**
	 * It is parameterized constructor of ValidateCartValueUpdating_PageObject
	 * class. It use to initialize all driver, Scenario, WebDriverWait, TestContext,
	 * etc......
	 * 
	 * @param driver
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public ValidateCartValueUpdating_PageObject(WebDriver driver, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
	}

	/**
	 * method help to Click on short_sleeve_t_shirts product and added to Cart.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void addProductToCart_ShortSleeve_t_shirts() {
		javaScriptUtil.scrollIntoView_ByLocator(ProductView_Locator);
		mouseAction.moveToelement(ProductsShortSleeve_t_shirts_Locator);
		utilities.ClickElement(product_AddToCart_ShortSleeve_T_Shirts_Locator);
		scn.log("Click on short_sleeve_t_shirts product and added to Cart.");
		logger.info("Click on short_sleeve_t_shirts product and added to Cart.");
	}

	/**
	 * method help to Click On Continue Shopping Button.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void clickOnContinueShoppingButton() {
		utilities.ClickElement(continueShoppingButton_Locator);
		scn.log("Click On Continue Shopping Button.");
		logger.info("Click On Continue Shopping Button.");
	}

	/**
	 * method help to Click on 'Blouse' product and added to Cart.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void addProductToCart_blouse() {
		mouseAction.moveToelement(productBlouse_Locator);
		utilities.ClickElement(product_AddToCart_Blouse_Locator);
		scn.log("Click on 'Blouse' product and added to Cart.");
		logger.info("Click on 'Blouse' product and added to Cart.");
	}

	/**
	 * method help to Click on 'printed_chiffon_dress' product and added to Cart.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void addProductToCart_printed_chiffon_dress() {
		mouseAction.moveToelement(productPrintedChiffonDress_Locator);
		utilities.ClickElement(product_AddToCart_PrintedChiffonDress_Locator);
		scn.log("Click on 'printed_chiffon_dress' product and added to Cart.");
		logger.info("Click on 'printed_chiffon_dress' product and added to Cart.");
	}

	/**
	 * method help to validate the cart is showing up count of product added in
	 * cart.
	 * 
	 * @param ProductCount
	 * @author Pravinkumar D Kadam
	 */
	public void validate_cart_showing_count(Integer ProductCount) {
		javaScriptUtil.scrollPageUp();
		mouseAction.moveToelement(cartShowingProductCount_Locator);
		String ActualProductCount = utilities.doGetText(cartShowingProductCount_Locator);
		int ExpectedProductCount = Integer.parseInt(ActualProductCount);
		Assert.assertSame("Assertion failed.", ProductCount, ExpectedProductCount);
		scn.log("validate the cart is showing up count as ::> " + ExpectedProductCount);
		logger.info("validate the cart is showing up count as ::> " + ExpectedProductCount);
	}

	
}
