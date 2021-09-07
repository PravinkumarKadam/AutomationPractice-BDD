
package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* Author:  Pravinkumar D Kadam
 * Company: VisionIT
 * Date:    19-August-2021
 * Description: Test com.automationPractice-BDD FW development
 */

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.TestContext;
import interfaces.Locators;
import interfaces.Variables;
import io.cucumber.java.Scenario;

/**
 * There is a object repository for the operations offered by
 * 'SignInPage_PageObjects' class. This class help to achieve encapsulation.
 * 
 * @Author: Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 */
public class SignInPage_PageObjects extends TestContext implements Locators, Variables {

	private static final Logger logger = LogManager.getLogger(SignInPage_PageObjects.class);

	Scenario scn;
	WebDriver driver;

	/**
	 * This is parameterized constructor of SignInPageObjects class
	 * 
	 * @param driver
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public SignInPage_PageObjects(WebDriver driver, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
	}

	/**
	 * This method click on Sign Button on Sign In Page
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void ClickSignButton() {
		utilities.waitForElementClickable(SignButton_Locator);
		utilities.ClickElement(SignButton_Locator);
		scn.log("Click on SignIn Button.");
		logger.info("Click on SignIn Button.");
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
		logger.info("New Created Mail ID is :> " + CurrentMail);
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
		javaScriptUtil.scrollIntoView_ByLocator(Authentication_Locator);
		utilities.enterText(CurrentMail, SignPageMailBox_Locator);
		scn.log("Mail use to crate new account :> " + CurrentMail);
		logger.info("Mail use to crate new account :> " + CurrentMail);

	}

	/**
	 * This method click create an account button
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void ClickCreatAccountButton() {
		utilities.ClickElement(CreatAccountButton_Locator);
		scn.log("Click on Create an Account Button.");
		logger.info("Click on Create an Account Button.");

		wait.until(ExpectedConditions.visibilityOfElementLocated(VerifycreateAccountTitle_Locator));
		Assert.assertEquals("Account is not created.", VerifycreateAccountTitle_variable,
				driver.findElement(VerifycreateAccountTitle_Locator).getText());
		scn.log("Test case is asserted and mail ID is valid to create new account :> "
				+ VerifycreateAccountTitle_variable);
		logger.info("Test case is asserted and mail ID is valid to create new account :> "
				+ VerifycreateAccountTitle_variable);
	}

}
