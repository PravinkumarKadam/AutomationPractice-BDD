package pageObjects;

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
 * 'ValidateSearchBox_PageObject' class. This class help to achieve
 * encapsulation.
 * 
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 */
public class ValidateSearchBox_PageObject extends TestContext implements Locators {

	private static final Logger logger = LogManager.getLogger(ValidateSearchBox_PageObject.class);

	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;

	/**
	 * This is constructor of ValidateSearchBoxPageObject class. This constructor
	 * initialize WebDriver, WebDriverWait, WebDriverWait, Scenario
	
	 * @Author: Pravinkumar D Kadam
	 */
	public ValidateSearchBox_PageObject(WebDriver driver,Scenario scn,WebDriverWait wait)
	{
		this.driver = driver;
		this.scn = scn;
		this.wait = wait;
	}

	/**
	 * It is wrapper Method available in ValidateSearchBoxPageObject class. help to
	 * search text.
	 * 
	 * @param Text
	 * @Author: Pravinkumar D Kadam
	 */
	public void SearchProducSearchBox(String Text) {
		utilities.enterText(Text, searchBox_Locator);
		scn.log("Search for the product “Dress” in the search box.");
		logger.info("Search for the product “Dress” in the search box.");
	}

	/**
	 * This is wrapper Method available in ValidateSearchBoxPageObject class.
	 * 1.Fetch the result and print the result. 2.Print all product get displayed in
	 * the list with name. 3.It help to Validate with the Expected result.
	 * 
	 * @Author: Pravinkumar D Kadam
	 */
	public void fetchResultPrint() {
		utilities.waitForElementClickable(searchBoxSuggestion_Locator);
		List<WebElement> elements = driver.findElements(searchBoxSuggestion_Locator);
		scn.log("All product get displayed in the list with names ::>");
		logger.info("All product get displayed in the list with names ::>");
		for (int i = 0; i < elements.size(); i++) {
			scn.log("                                                " + (i + 1) + ") " + elements.get(i).getText());
			logger.info(
					"                                                " + (i + 1) + ") " + elements.get(i).getText());
		}
		Assert.assertEquals(7, elements.size());
		scn.log("Validate with the Expected result as 7 => " + "Actual Result :: " + elements.size());
		logger.info("Validate with the Expected result as 7 => " + "Actual Result :: " + elements.size());
	}

}
