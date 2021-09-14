
package pageObjects;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
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
@Log4j2
@AllArgsConstructor
public class SignInPage_PageObjects extends TestContext implements Locators, Variables {

	WebDriver driver;
	Scenario scn;


	/**
	 * This method click on Sign Button on Sign In Page
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void ClickSignButton() {
		utilities.waitForElementClickable(SignButton_Locator);
		utilities.ClickElement(SignButton_Locator);
		scn.log("Click on SignIn Button.");
		log.info("Click on SignIn Button.");
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
		String CurrentMail = utilities.newCreatedMailId(mail, mailTag);
		javaScriptUtil.scrollIntoView_ByLocator(Authentication_Locator);
		utilities.enterText(CurrentMail, SignPageMailBox_Locator);
		scn.log("Mail use to crate new account :> " + CurrentMail);
		log.info("Mail use to crate new account :> " + CurrentMail);

	}

	/**
	 * This method click create an account button
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void ClickCreatAccountButton() {
		utilities.ClickElement(CreatAccountButton_Locator);
		scn.log("Click on Create an Account Button.");
		log.info("Click on Create an Account Button.");
        utilities.waitForElementVisibilityOfElementLocated(VerifycreateAccountTitle_Locator);
		Assert.assertEquals("Account is not created.", VerifycreateAccountTitle_variable,
				driver.findElement(VerifycreateAccountTitle_Locator).getText());
		scn.log("Test case is asserted and mail ID is valid to create new account :> "
				+ VerifycreateAccountTitle_variable);
		log.info("Test case is asserted and mail ID is valid to create new account :> "
				+ VerifycreateAccountTitle_variable);
	}

}
