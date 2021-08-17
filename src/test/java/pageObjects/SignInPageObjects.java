package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.TestContext;
import io.cucumber.java.Scenario;

public class SignInPageObjects {
	public Scenario scn;
	WebDriver driver;
	TestContext testContext;

	private final By SignButtonLocator = By.xpath("//a[@class='login']");
	private final By SignPageMailBoxLocator = By.xpath("//input[@id='email_create']");
	private final By CreatAccountButtonLocator = By.xpath("//input[@id='email_create']");

	public SignInPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public SignInPageObjects(TestContext testContext) {
		this.testContext = testContext;
		this.scn = testContext.scn;
	}

	public void ClickSignButton() {
		WebElement buttonClick = driver.findElement(SignButtonLocator);
		buttonClick.click();
	}

	public void enterMailID(String mail, String mailTag) {
		WebElement mailBox = driver.findElement(SignPageMailBoxLocator);
		mailBox.sendKeys(mail + System.currentTimeMillis() + mailTag);
	}

	public void ClickCreatAccountButton() {
		WebElement clickOn = driver.findElement(CreatAccountButtonLocator);
		clickOn.clear();
	}

}
