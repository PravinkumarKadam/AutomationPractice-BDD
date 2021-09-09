package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestContext;
import io.cucumber.java.Scenario;

/**
 * This 'JavaScriptUtil' class provides various 'JAVAScript' method. These
 * methods used primarily by Web browsers to create a dynamic and interactive
 * experience for the User.
 * 
 * @author Pravinkumar D Kadam
 */
public class JavaScriptUtil extends TestContext {

	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;

	/**
	 * This parameterized constructor initialize WebDriver
	 * 
	 * @param driver
	 * @author Pravinkumar D Kadam
	 */
	public JavaScriptUtil(WebDriver driver, Scenario scn, WebDriverWait wait) {
		this.driver = driver;
		this.scn = scn;
		this.wait = wait;
	}

	/**
	 * This method will scroll the WebPage until the element is not visible on the
	 * page
	 * 
	 * @param By locator
	 * @author Pravinkumar D Kadam
	 */
	public void scrollIntoView_ByLocator(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	/**
	 * This method will scroll the WebPage until the element is not visible on the
	 * page
	 * 
	 * @param WebElement variable
	 * @author Pravinkumar D Kadam
	 */
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	/**
	 * This is JavaScript method use to flash specific element.
	 * 
	 * @param element
	 * @author Pravinkumar D Kadam
	 */
	public void flash(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element);
			changeColor(bgcolor, element);
		}
	}

	/**
	 * This is JavaScript method used to change Color of specific element.
	 * 
	 * @param color
	 * @param element
	 * @author Pravinkumar D Kadam
	 */
	private void changeColor(String color, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This JavaScript method used to draw a border around the element.
	 * 
	 * @param element
	 * @author Pravinkumar D Kadam
	 */
	public void drawBorder_ByElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	/**
	 * This JavaScript method used to draw a border around the element.
	 * 
	 * @param By Locator
	 * @author Pravinkumar D Kadam
	 */
	public void drawBorder_Bylocator(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	/**
	 * This method will scroll down the WebPage to the bottom end
	 * @author Pravinkumar D Kadam
	 */
	public void scrollPageDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/**
	 * This method will scroll up the WebPage to the top of 
	 * the page height
	 * @author Pravinkumar D Kadam 
	 */
	public void scrollPageUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}

}
