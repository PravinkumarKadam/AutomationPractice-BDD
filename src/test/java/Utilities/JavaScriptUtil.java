package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This 'JavaScriptUtil' class provides various 'JAVAScript' method. These
 * methods used primarily by Web browsers to create a dynamic and interactive
 * experience for the User.
 * 
 * @author Pravinkumar D Kadam
 */
public class JavaScriptUtil {

	WebDriver driver;

	/**
	 * This parameterized constructor initialize WebDriver
	 * 
	 * @param driver
	 * @author Pravinkumar D Kadam
	 */
	public JavaScriptUtil(WebDriver driver) {
		this.driver = driver;
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
	public void drawBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

}
