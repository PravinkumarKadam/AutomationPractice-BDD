package pageObjects;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
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
@Log4j2
@AllArgsConstructor
public class ChangeImageColor_PageObject extends TestContext implements Locators {

	WebDriver driver;
	Scenario scn;


	/**
	 *Method help to Select category T-shirts.
	 * @author Pravinkumar D Kadam
	 */
	public void select_category_t_shirts() {
		utilities.ClickElement(Tshirts_Locator);
		scn.log("Click on T-shirts product category.");
		log.info("Click on T-shirts product category.");
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
		log.info("Click on blue color.");
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
		log.info("Assertion completed and product color is changed.");
	}

}
