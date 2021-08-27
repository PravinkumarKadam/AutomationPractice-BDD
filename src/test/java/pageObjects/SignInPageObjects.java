
package pageObjects;

/* Author:  Pravinkumar D Kadam
 * Company: VisionIT
 * Date:    19-August-2021
 * Description: Test com.automationPractice-BDD FW development
 */

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
 * SignInPageObjects ] class and the ease of use to minimize the efforts for the
 * script writers
 * 
 * @Author: Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 */
public class SignInPageObjects {

	public Scenario scn;
	WebDriver driver;
	TestContext testContext;
	WebDriverWait wait;
	JavaScriptUtil javaScriptUtil;

	// Locator
	private static final By SignButton_Locator = By.xpath("//a[@class='login']");
	private static final By SignPageMailBox_Locator = By.xpath("//input[@id='email_create']");
	private static final By CreatAccountButton_Locator = By.xpath("//button[@id='SubmitCreate']/span");
	private static final By VerifycreateAccountTitle_Locator = By.xpath("//h1[contains(text(),'Create an account')]");
	// Variable
	private static final String VerifycreateAccountTitle_variable = "CREATE AN ACCOUNT";

	/**
	 * This is parameterized constructor of SignInPageObjects class
	 * 
	 * @param driver
	 * @param wait
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public SignInPageObjects(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.wait = wait;
		this.scn = scn;
		javaScriptUtil = new JavaScriptUtil(this.driver);
	}

	/**
	 * This is parameterized constructor of SignInPageObjects class
	 * 
	 * @param testContext
	 * @author Pravinkumar D Kadam
	 */
	public SignInPageObjects(TestContext testContext) {
		this.testContext = testContext;
		this.scn = testContext.scn;
	}

	/**
	 * This method click on Sign Button on Sign In Page
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void ClickSignButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(SignButton_Locator));
		WebElement buttonClick = driver.findElement(SignButton_Locator);
		javaScriptUtil.flash(buttonClick);
		buttonClick.click();
		scn.log("Click on SignIn Button.");
	}

	/**
	 * This method help to create different new Mail ID.
	 * 
	 * @param mail
	 * @param mailTag
	 * @return Mail ID
	 * @author Pravinkumar D Kadam
	 */
	public String NewCreatedMailId(String mail, String mailTag) {
		String CurrentMail = mail + System.currentTimeMillis() + mailTag;
		scn.log("New Created Mail ID is :> " + CurrentMail);
		return CurrentMail;
	}

	/**
	 * Method use mail , mailTag in parameter and create new mail Id with the help
	 * of NewCreatedMailId(); method and fill in mail Box on Sign In page.
	 * 
	 * @param mail
	 * @param mailTag
	 * @author Pravinkumar D Kadam
	 */
	public void enterMailID(String mail, String mailTag) {
		String CurrentMail = NewCreatedMailId(mail, mailTag);
		WebElement mailBox = driver.findElement(SignPageMailBox_Locator);
		javaScriptUtil.scrollIntoView(mailBox);
		javaScriptUtil.flash(mailBox);
		mailBox.sendKeys(CurrentMail);
		scn.log("Mail use to crate new account :> " + CurrentMail);
		System.out.println("Mail use to crate new account :> " + CurrentMail);
	}

	/**
	 * This method click create an account button
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void ClickCreatAccountButton() {
		WebElement clickOn = driver.findElement(CreatAccountButton_Locator);
		javaScriptUtil.flash(clickOn);
		clickOn.click();
		scn.log("Click on Create an Account Button.");
		wait.until(ExpectedConditions.visibilityOfElementLocated(VerifycreateAccountTitle_Locator));
		Assert.assertEquals("Account is not created.", VerifycreateAccountTitle_variable,
				driver.findElement(VerifycreateAccountTitle_Locator).getText());
		scn.log("Test case is asserted and mail ID is valid to create new account :> "
				+ VerifycreateAccountTitle_variable);
	}

}
