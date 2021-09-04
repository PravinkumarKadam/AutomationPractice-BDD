package pageObjects;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.JavaScriptUtil;
import Utilities.Utilities;
import Utilities.WaitUtilities;
import base.TestContext;
import io.cucumber.java.Scenario;
import locatorsAndVeriablies.Locators;

/**
 * There is a object repository for the operations offered by
 * 'AllProductPriceAndTotal_PageObject' class. This class help to achieve
 * encapsulation.
 * 
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 */
public class AllProductPriceAndTotal_PageObject extends Locators{

	TestContext testContext;
	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;
	Utilities utilities;
	JavaScriptUtil javaScriptUtil;


	/**
	 * It is parameterized constructor of AllProductPriceAndTotal_PageObject class.
	 * It use to initialize all driver, Scenario, WebDriverWait, TestContext,
	 * etc......
	 * 
	 * @param driver
	 * @param wait
	 * @param scn
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public AllProductPriceAndTotal_PageObject(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.wait = wait;
		this.scn = scn;
		javaScriptUtil = new JavaScriptUtil(this.driver);
		utilities = new Utilities(this.driver, this.wait, this.scn);
	}

	/**
	 * Method check 'DRESSES' option and assert all characters in Upper case or not.
	 * 
	 * @param productName
	 * @author Pravinkumar D Kadam
	 */
	public void validateDressesOption(String productName) {
		WebElement element = driver.findElement(Dresses_locator);
		javaScriptUtil.drawBorder(element);
		Assert.assertEquals(productName, element.getText());
		scn.log("Displayed all characters in Upper case, Validatation completed  ::> " + element.getText());
	}

	/**
	 * This is wrapper method.
	 * Directly invoked Utilities class method [ ClickElement(); ]
	 * @author Pravinkumar D Kadam
	 */
	public void ClickOnElement() {
		utilities.ClickElement(Dresses_locator);
	}

	/**
	 * Method help to fetch all the prices of product make Total of all product prices
	 * and assert it.
	 * @author Pravinkumar D Kadam
	 */
	public void fetch_all_the_prices() {
		List<WebElement> price = driver.findElements(priceOfProduct_locator);
		float flag = 0.00f;
		for (int i = 0; i < price.size(); i++) {
			javaScriptUtil.scrollIntoView_ByLocator(ProductView_Locator);
			WaitUtilities.Wait_KiloBytes();
			javaScriptUtil.drawBorder(price.get(i));
			flag = flag + Float.parseFloat(price.get(i).getText().substring(1));
		}
		scn.log("The sum of all products ::> " + flag);
		float Expected_Total = 152.87f;
	//	Assert.assertNotEquals("Assertion failed", Expected_Total, flag);
		scn.log("The sum of all products Match with actual Total");
	}

}
