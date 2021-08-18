
package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.TestContext;
import io.cucumber.java.Scenario;

public class SignInPageObjects {

	public Scenario scn;
	WebDriver driver;
	TestContext testContext;
	WebDriverWait wait;

	private static final By SignButton_Locator = By.xpath("//a[@class='login']");
	private static final By SignPageMailBox_Locator = By.xpath("//input[@id='email_create']");
	private static final By CreatAccountButton_Locator = By.xpath("//button[@id='SubmitCreate']/span");
	private static final By VerifycreateAccountTitle_Locator = By.xpath("//h1[contains(text(),'Create an account')]");

	private static final String VerifycreateAccountTitle_veriable = "CREATE AN ACCOUNT";

	public SignInPageObjects(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.wait = wait;
		this.scn = scn;
	}

	public SignInPageObjects(TestContext testContext) {
		this.testContext = testContext;
		this.scn = testContext.scn;
	}

	public void ClickSignButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(SignButton_Locator));
		WebElement buttonClick = driver.findElement(SignButton_Locator);
		buttonClick.click();
		scn.log("Click on SignIn Button.");
	}

	public String NewCreatedMailId(String mail, String mailTag) {
		String CurrentMail = mail + System.currentTimeMillis() + mailTag;
		scn.log("New Created Mail ID is :> " + CurrentMail);
		return CurrentMail;
	}

	public void enterMailID(String mail, String mailTag) {
		String CurrentMail = NewCreatedMailId(mail, mailTag);
		WebElement mailBox = driver.findElement(SignPageMailBox_Locator);
		mailBox.sendKeys(CurrentMail);
		scn.log("Mail use to crate new account :> " + CurrentMail);
		System.out.println("Mail use to crate new account :> " + CurrentMail);
	}

	public void ClickCreatAccountButton() {
		WebElement clickOn = driver.findElement(CreatAccountButton_Locator);
		clickOn.click();
		scn.log("Click on Create an Account Button.");
		wait.until(ExpectedConditions.visibilityOfElementLocated(VerifycreateAccountTitle_Locator));
		Assert.assertEquals("Account is not created.", VerifycreateAccountTitle_veriable,
				driver.findElement(VerifycreateAccountTitle_Locator).getText());
		scn.log("Test case is asserted and mail ID is valid to create new account :> "
				+ VerifycreateAccountTitle_veriable);
	}

}
