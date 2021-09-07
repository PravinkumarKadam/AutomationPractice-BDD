package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestContext;
import io.cucumber.java.Scenario;

/**
 * This 'MouseAction' class provides various 'MouseAction' method. These
 * methods used primarily by Web browsers to create a dynamic and interactive
 * experience for the User.
 * 
 * @author Pravinkumar D Kadam
 */
public class MouseAction extends TestContext {
	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;

	/**
	 * This is constructor of Utilities class. This constructor initialize
	 * WebDriver, WebDriverWait, WebDriverWait, Scenario
	
	 * @author Pravinkumar D Kadam
	 */
	public MouseAction(WebDriver driver,Scenario scn,WebDriverWait wait)
	{
		this.driver = driver;
		this.scn = scn;
		this.wait = wait;
	
	    actions =new Actions(driver);
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
