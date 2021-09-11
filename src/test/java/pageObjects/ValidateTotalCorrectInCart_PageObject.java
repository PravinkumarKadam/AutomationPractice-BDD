package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.WaitUtilities;
import base.TestContext;
import interfaces.Locators;
import interfaces.Variables;
import io.cucumber.java.Scenario;

/**
 * There is a object repository for the operations offered by
 * 'ValidateTotalCorrectInCart_PageObject' class. This class help to achieve
 * encapsulation.
 * 
 * @Company: VisionIT
 * @Date: 12-September-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 */
public class ValidateTotalCorrectInCart_PageObject extends TestContext implements Locators, Variables {

	private static final Logger logger = LogManager.getLogger(ValidateTotalCorrectInCart_PageObject.class);

	WebDriver driver;
	Scenario scn;

	/**
	 * It is parameterized constructor of ValidateTotalCorrectInCart_PageObject
	 * class. It use to initialize all driver, Scenario, WebDriverWait, TestContext,
	 * etc......
	 * 
	 * @param driver
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public ValidateTotalCorrectInCart_PageObject(WebDriver driver, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
	}

	/**
	 * method help to check the total of all three individual products. method
	 * internally use ArrayList, mouse Action, for loop , Assertion , etc,...
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void check_the_total_of_all_three_individual_products() {

		ArrayList<String> individualProductPrizeList = new ArrayList<>();

		mouseAction.moveToelement(ProductsShortSleeve_t_shirts_Locator);
		individualProductPrizeList.add(utilities.doGetText(productPrize_ShortSleeve_t_shirtsProduct_Locator));
		mouseAction.moveToelement(productBlouse_Locator);
		individualProductPrizeList.add(utilities.doGetText(productPrize_BlouseProduct_Locator));
		mouseAction.moveToelement(productPrintedChiffonDress_Locator);
		individualProductPrizeList.add(utilities.doGetText(productPrize__PrintedChiffonDressProduct_Locator));

		float TotalOfThreeIndividualProduct = 0.0f;
		for (int i = 0; i < individualProductPrizeList.size(); i++) {
			TotalOfThreeIndividualProduct = TotalOfThreeIndividualProduct
					+ Float.parseFloat(individualProductPrizeList.get(i).substring(1));
		}
		javaScriptUtil.scrollPageUp();
		WaitUtilities.Wait_MegaBytes();
		mouseAction.moveToelement(cartShowingProductCount_Locator);
		float TotalCartPrize = Float.parseFloat(utilities.doGetText(cartProductPrize_GrandTotal_Locator).substring(1));
		Assert.assertEquals(TotalCartPrize, TotalOfThreeIndividualProduct, 2.0f);
		scn.log("Assert the Individual Product Total with cart Total ::> " + TotalOfThreeIndividualProduct);/////
		logger.info("Assert the Individual Product Total with cart Total ::> " + TotalOfThreeIndividualProduct);

	}

	/**
	 * method help to assert product total is matching with the cart total. method
	 * internally use List, mouse Action, Assertion, for loop, etc,...
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void assert_product_total_is_matching_with_the_cart_total() {
		mouseAction.moveToelement(cartShowingProductCount_Locator);
		List<WebElement> cartPricelist = driver.findElements(cartProduct_PrizeList_Locator);
		float TotalCartPrize = Float.parseFloat(utilities.doGetText(cartProductPrize_GrandTotal_Locator).substring(1));
		float TotalPrizeAllProductFromCartList = 0.0f;
		for (int i = 0; i < cartPricelist.size(); i++) {
			String price = cartPricelist.get(i).getText();
			TotalPrizeAllProductFromCartList = TotalPrizeAllProductFromCartList + Float.parseFloat(price.substring(1));
		}
		Assert.assertEquals(TotalPrizeAllProductFromCartList, TotalCartPrize, 2.0f);
		scn.log("Assert the cart Total with individual product Total ::> " + TotalPrizeAllProductFromCartList);
		logger.info("Assert the cart Total with individual product Total ::> " + TotalCartPrize);

	}

}
