package pageObjects;

/* Author:  Pravinkumar D Kadam
 * Company: VisionIT
 * Date:    19-August-2021
 * Description: Test com.automationPractice-BDD FW development
 */

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.JavaScriptUtil;
import base.TestContext;
import io.cucumber.java.Scenario;

/**
 * There is a single repository for the operations offered by the [
 * LandingPagePageObject ] class and the ease of use to minimize the efforts for
 * the script writers
 * 
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 */
public class LandingPagePageObject {

	TestContext testContext;
	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;
	JavaScriptUtil javaScriptUtil;

	private static final By productCatageroyLocator = By.xpath("//div[@id='block_top_menu']/ul/li/a");
	private static final By logoImageLocator = By.xpath("//img[@class='logo img-responsive']");

	/**
	 * It is parameterized constructor of LandingPagePageObject class. It use to
	 * initialize all driver, Scenario, WebDriverWait, TestContext, etc......
	 * 
	 * @param driver
	 * @param wait
	 * @param scn
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public LandingPagePageObject(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.wait = wait;
		this.scn = scn;
		javaScriptUtil = new JavaScriptUtil(this.driver);
	}

	/**
	 * Method contain one for each loop which help to fetching product category
	 * list.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void productlist() {

		List<WebElement> productList = driver.findElements(productCatageroyLocator);

		System.out.println("Product list :: ");
		scn.log("Product list :: ");
		for (WebElement e : productList)

		{
			System.out.println("          " + e.getText());
			scn.log("             " + e.getText());
		}

	}

	/**
	 * Method check and assert logo on Landing page. function are use like
	 * Explicitly wait(WebDriverWait), By Locator , org.junit.Assert
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void logoDisplay() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(logoImageLocator));
		WebElement logo = driver.findElement(logoImageLocator);
		javaScriptUtil.flash(logo);
		boolean logoDisplayOrNOt = logo.isDisplayed();
		Assert.assertTrue("Logo is not displayed.", logoDisplayOrNOt);
		scn.log("Logo is Display :> " + logoDisplayOrNOt);
	}

	/**
	 * Method help to check logo(Which is present on landing page) Width and height.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void logoWidth_Height() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(logoImageLocator));
		WebElement logoSize = driver.findElement(logoImageLocator);
		System.out.println("Logo Width is : " + logoSize.getSize().getWidth());
		System.out.println("Logo Height is : " + logoSize.getSize().getHeight());
		scn.log("Logo Height is :> " + logoSize.getSize().getHeight());
		scn.log("Logo Width is :> " + logoSize.getSize().getHeight());

	}

	/**
	 * Method assert Logo (Which is present on landing page) size.
	 * 
	 * @param Height
	 * @param width
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void assertingLogoSize(String Height, String width) {
		int Height_1 = Integer.parseInt(Height);
		int width_1 = Integer.parseInt(width);
		wait.until(ExpectedConditions.visibilityOfElementLocated(logoImageLocator));
		WebElement logoSize = driver.findElement(logoImageLocator);
		Assert.assertEquals("User failed to assert logo Height", Height_1, logoSize.getSize().getHeight());
		Assert.assertEquals("user failed to assert width of logo ", width_1, +logoSize.getSize().getWidth());

		System.out.println("User successfully assert log width and height are respectively "
				+ logoSize.getSize().getWidth() + " and " + logoSize.getSize().getHeight());

		scn.log("User successfully assert log height and width are respectively " + logoSize.getSize().getHeight()
				+ " and " + logoSize.getSize().getWidth());
	}

}
