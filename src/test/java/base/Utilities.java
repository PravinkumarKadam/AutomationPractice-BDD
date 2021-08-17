package base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.Scenario;

public class Utilities {
	public Scenario scn;
	public WebDriver driver;
	public WebDriverWait wait;
	public TestContext testContext;

	public Utilities(WebDriver driver) {
		this.driver = driver;
	}

	public Utilities(TestContext testContext) {
		this.testContext = testContext;
		this.scn = testContext.scn;
	}

	public void enterUrl(String url) {
		driver.get(url);
		// scn.log("Driver initialized successfully.");
	}

	public void assertUrl(String url) {
		Assert.assertEquals("Url assertion failed", url, driver.getCurrentUrl());
		System.out.println("User successfully asserted url and test case passed");
		// scn.log("asserting url " + url+ " with current page url.");
	}

	public String getCurentPageTittle() {
		return driver.getTitle();
		// scn.log("user fetching current page title :" + driver.getTitle());
	}

	public void assertPageTitle(String title) {
		Assert.assertEquals("user unable to asserting page title ", title, driver.getTitle());
		System.out.println("User Assert Page Title successfully Test case passed.");
		// scn.log("User assert Current page tile successfully.");
	}

	public void closeDriver() {
		driver.quit();
		// scn.log("Browser closed.");
	}

}
