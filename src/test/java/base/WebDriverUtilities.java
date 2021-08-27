package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.Scenario;

/**
 * This class having the wrapper methods. The 'WebDriverUtilities' class
 * provides various methods for handling the dropdown operations to interact
 * with elements on WebPage with the ease of use to minimize the efforts for the
 * script writers
 * 
 * @Author: Pravinkumar D Kadam
 */
public class WebDriverUtilities {

	public Scenario scn;
	public WebDriver driver;
	JavaScriptUtil javaScriptUtil;

	public WebDriverUtilities(WebDriver driver, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
		javaScriptUtil = new JavaScriptUtil(this.driver);
	}

	/**
	 * Method help to select Value From Dropdown.
	 * 
	 * @param value
	 * @param locator
	 * @author : Pravinkumar D Kadam
	 */
	public void selectValueFromDropdwon(String value, By locator) {
		WebElement element = driver.findElement(locator);
        javaScriptUtil.scrollIntoView(element);
		Select select = new Select(element);
		select.selectByValue(value);
		scn.log("Select Value From Dropdown :> " + value);
	}

}
