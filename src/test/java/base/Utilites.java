package base;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.Scenario;

public class Utilites {
	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;

	public Utilites(WebDriver driver,Scenario scn) {

		this.driver = driver;
		this.scn = scn;
	}

	public void enterUrl(String url) {
		driver.get(url);
		//  scn.log("Driver initialized successfully.");
	}

	public void assertUrl(String url) {
		Assert.assertEquals("Url assertion faild", url, driver.getCurrentUrl());
		System.out.println("User successfully asserted url and test case passed");
		//	scn.log("asserting url " + url+ " with courrent page url.");
	}

	public void getCurentPageTittle() {
		driver.getTitle();
		//	scn.log("user faching current page title :" + driver.getTitle());
	}

	public void assertPageTitle(String title) {
		Assert.assertEquals("user unble to asserting page title ", title, driver.getTitle());
		System.out.println("User Assert Page Title successfully Test case passed.");
		//	scn.log("User assert Curent page tile succesfully.");
	}

	public void closeDriver() {
		driver.quit();
		//	scn.log("Browser colsed.");
	}


}
