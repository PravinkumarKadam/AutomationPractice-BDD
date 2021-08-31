package pageObjects;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.Utilities;
import io.cucumber.java.Scenario;

/**
 * There is a object repository for the operations offered by 'ValidateSearchBox_PageObject' class.
 * This class help to achieve encapsulation.
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 */
public class ValidateSearchBox_PageObject {

	public Scenario scn;
	public WebDriver driver;
	public WebDriverWait wait;
	Utilities utilities;

	private final By searchBox_Locator = By.xpath("//input[@id='search_query_top']");
	private final By searchBoxSuggestion_Locator = By.xpath("//div[@class='ac_results']//li");

	/**
	 * This is constructor of ValidateSearchBoxPageObject class. This constructor initialize
	 * WebDriver, WebDriverWait, WebDriverWait, Scenario
	 * @param driver
	 * @param wait
	 * @param scn
	 * @Author: Pravinkumar D Kadam
	 */
	public ValidateSearchBox_PageObject(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.wait = wait;
		this.scn = scn;
		utilities = new Utilities(this.driver, this.wait, this.scn);
	}

	/**
	 * It is wrapper Method available in ValidateSearchBoxPageObject class. help to search text.
	 * @param Text
	 * @Author: Pravinkumar D Kadam
	 */
	public void SearchProducSearchBox(String Text) {
		utilities.enterText(Text,searchBox_Locator);
		scn.log("Search for the product “Dress” in the search box.");
	}

	/**
	 * This is wrapper Method available in ValidateSearchBoxPageObject class.
	 * 1.Fetch the result and print the result.
	 * 2.Print all product get displayed in the list with name.
	 * 3.It help to Validate with the Expected result. 
	 * @Author: Pravinkumar D Kadam
	 */
	public void fetchResultPrint() {
		utilities.waitForElementClickable(searchBoxSuggestion_Locator);
		List<WebElement> elements = driver.findElements(searchBoxSuggestion_Locator);
		scn.log("All product get displayed in the list with names ::>");
		for (int i = 0; i < elements.size(); i++) {
		scn.log( "                                                "+(i+1) +") "+elements.get(i).getText());
		}
        Assert.assertEquals(7, elements.size());
		scn.log("Validate with the Expected result as 7 => "+ "Actual Result :: "+elements.size() );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
