package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import base.TestContext;
import interfaces.Locators;
import io.cucumber.java.Scenario;


/**
 * There is a object repository for the operations offered by
 * 'ValidateProductRemovedFromCart_PageObject' class. This class help to achieve
 * encapsulation.
 * 
 * @Author: Pravinkumar D Kadam
 * @Date: 12-September-2021
 * @Description: Test com.automationPractice-BDD FW development
 */
public class ValidateProductRemovedFromCart_PageObject extends TestContext implements Locators {

	private static final Logger logger = LogManager.getLogger(ValidateProductRemovedFromCart_PageObject.class);

	WebDriver driver;
	Scenario scn;

	/**
	 * It is parameterized constructor of ValidateProductRemovedFromCart_PageObject
	 * class. It use to initialize all driver, Scenario, WebDriverWait, TestContext,
	 * etc......
	 * 
	 * @param driver
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public ValidateProductRemovedFromCart_PageObject(WebDriver driver, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
	}

	/**
	 * method help to click on cross button to remove product form cart.
	 * this method use javaScript , mouse Action, etc. 
	 * @author Pravinkumar D Kadam
	 */
	public void click_on_cross_button_to_remove_product_from_cart() {
		javaScriptUtil.scrollPageUp();
		utilities.waitForElementVisibilityOfElementLocated(cartShowingProductCount_Locator);
		mouseAction.moveToelement(cartShowingProductCount_Locator);
		utilities.ClickElement(cartProductCancel_ShortSleeve_t_shirtsProduct_Locator);
		mouseAction.moveToelement(cartShowingProductCount_Locator);
		scn.log("click on cross button to remove product from cart.");
		logger.info("click on cross button to remove product from cart.");
	}

	/**
	 * method help to check the cart value.
	 * method use java Script , Assertion, etc,... 
	 * @author Pravinkumar D Kadam	 
	 * @param CartValue
	 */
	public void check_the_cart_value_updated_with(Integer CartValue) {
		javaScriptUtil.scrollPageUp();
		mouseAction.moveToelement(cartShowingProductCount_Locator);
		String ActualProductCount = utilities.doGetText(cartShowingProductCount_Locator);
		int ExpectedProductCount = Integer.parseInt(ActualProductCount);
		Assert.assertSame(CartValue, ExpectedProductCount);
		scn.log("Validate the cart count After remove product as ::> " + CartValue);//////////////
		logger.info("Validate the cart count After remove product as ::> " + CartValue);

	}

}
