package pageObjects;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
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
 * 'ValidateProductRemovedFromCart_PageObject' class. This class help to achieve
 * encapsulation.
 * 
 * @Author: Pravinkumar D Kadam
 * @Date: 12-September-2021
 * @Description: Test com.automationPractice-BDD FW development
 */
@Log4j2
@AllArgsConstructor
public class ValidateProductsAddedInCart_PageObject extends TestContext implements Locators, Variables {

	WebDriver driver;
	Scenario scn;



	/**
	 * method help to validate the product name showing up in the cart.
	 * method use ArrayList, java Script, for loop , etc, ...
	 * @author Pravinkumar D Kadam
	 */
	public void validate_items_with_added_in_cart() {

		ArrayList<String> ActualProductName = new ArrayList<>();
		ActualProductName.add(cartShowProductName_ShortSleeve_t_shirts_Vaiables);
		ActualProductName.add(cartShowProductName_Blouse_Vaiables);
		ActualProductName.add(cartShowProductName_PrintedChiffonDress_Vaiables);
		javaScriptUtil.scrollPageUp();
		mouseAction.moveToelement(cartShowingProductCount_Locator);
		WaitUtilities.Wait_MegaBytes();
		List<WebElement> productAddedInCart = driver.findElements(cartProduct_NameList_Locator);
		scn.log("Product name display in cart ::> ");
		for (int i = 0; i < productAddedInCart.size(); i++) {

			scn.log("                    " + (i+1) + " ) " + productAddedInCart.get(i).getText());
			Assert.assertEquals("Assertion failed.", ActualProductName.get(i), productAddedInCart.get(i).getText());
		}
		log.info("validate the product name showing up in the cart.");
	}

}
