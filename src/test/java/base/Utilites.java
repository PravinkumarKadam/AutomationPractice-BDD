package base;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.Scenario;

public class Utilites {
	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;

	public Utilites(WebDriver driver) {

		this.driver = driver;

	}

	public void enterUrl(String url) {
		driver.get(url);

	}

	public void assertUrl(String url) {
		Assert.assertEquals("Url assertion faild", url, driver.getCurrentUrl());
		System.out.println("User successfully asserted url and test case passed");

	}

	public void getCurentPageTittle() {
		driver.getTitle();
	}

	public void assertPageTitle(String title) {
		Assert.assertEquals("user unble to asserting page title ", title, driver.getTitle());
		System.out.println("User Assert Page Title successfully Test case passed.");
	}

	public void closeDriver() {
		driver.quit();

	}


}
