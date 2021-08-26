package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

/* Author:  Pravinkumar D Kadam
 * Company: VisionIT
 * Date:    19-August-2021
 * Description: Test com.automationPractice-BDD FW development
 */

public class WebDriverUtilities {

	WebDriver driver;
	Scenario scn;
	WebDriverWait wait;
	TestContext testContext;

	public WebDriverUtilities(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
		this.wait = wait;
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
		Select select = new Select(element);
		select.selectByValue(value);
		scn.log("Select Value From Dropdown :> " + value);

	}

}
