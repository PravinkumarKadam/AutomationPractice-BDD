package pageObjects;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
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
@Log4j2
@AllArgsConstructor
public class ValidateSearchBox_PageObject extends TestContext implements Locators {

	WebDriver driver;
	Scenario scn;
	WebDriverWait wait;



	/**
	 * It is wrapper Method available in ValidateSearchBoxPageObject class. help to
	 * search text.
	 * 
	 * @param Text
	 * @Author: Pravinkumar D Kadam
	 */
	public void SearchProducSearchBox(String Text) {
		utilities.enterText(Text, searchBox_Locator);
		scn.log("Search for the product �Dress� in the search box.");
		log.info("Search for the product �Dress� in the search box.");
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
		log.info("All product get displayed in the list with names ::>");
		for (int i = 0; i < elements.size(); i++) {
			scn.log("                                                " + (i + 1) + ") " + elements.get(i).getText());
			log.info(
					"                                                " + (i + 1) + ") " + elements.get(i).getText());
		}
		Assert.assertEquals(7, elements.size());
		scn.log("Validate with the Expected result as 7 => " + "Actual Result :: " + elements.size());
		log.info("Validate with the Expected result as 7 => " + "Actual Result :: " + elements.size());
	}

}
