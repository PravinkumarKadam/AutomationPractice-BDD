package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.Scenario;

public class MouseAction {

	public Scenario scn;
	public WebDriver driver;
	public WebDriverWait wait;
	Actions actions;

	/**
	 * This is constructor of Utilities class. This constructor initialize
	 * WebDriver, WebDriverWait, WebDriverWait, Scenario
	 * 
	 * @param driver
	 * @param wait
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public MouseAction(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.wait = wait;
		this.scn = scn;
	    actions =new Actions(this.driver);
	}

	/**
	 * Moves the mouse to the middle of the element. 
	 * @author Pravinkumar D Kadam
	 */
	public void moveToelement(By locator) {
		WebElement elelment = driver.findElement(locator);
		actions.moveToElement(elelment).build().perform();
	}

}
