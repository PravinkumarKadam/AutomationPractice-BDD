package pageObjects;


import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestContext;
import io.cucumber.java.Scenario;

public class LandingPagePageObject {

	//Scenario scn;
	WebDriver driver;
	WebDriverWait wait;

	private static final By productCatageroyLocator = By.xpath("//div[@id='block_top_menu']/ul/li/a");
	private static final By logoImageLocator = By.xpath("//img[@class='logo img-responsive']");

	public LandingPagePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void productlist() {

		List<WebElement> productList = driver.findElements(productCatageroyLocator);

		System.out.println("Product list :: ");
		// scn.log("Product list :: ");
		for (WebElement e : productList)

		{
			System.out.println("          " + e.getText());
			// scn.log(" "+ e.getText());
		}

	}

	public void logoDisplay() {
		boolean logoDisplayOrNOt = driver.findElement(logoImageLocator).isDisplayed();
		// scn.log("Logo is Display =>"+ logoDisplayOrNOt);
	}

	public void logoWidth_Height() {
		WebElement logoSize = driver.findElement(logoImageLocator);
		System.out.println("Logo Width is : " + logoSize.getSize().getWidth());
		System.out.println("Logo Height is : " + logoSize.getSize().getHeight());

		// scn.log("Logo Width is : " + logoSize.getSize().getHeight());
		// scn.log("Logo Height is : " + logoSize.getSize().getHeight());
	}

	public void assertingLogoSize(String Height, String width) 
	{
		int Height_1 = Integer.parseInt(Height);
		int width_1 = Integer.parseInt(width);

		WebElement logoSize = driver.findElement(logoImageLocator);
		Assert.assertEquals("user failed to assert width of logo ", width_1, +logoSize.getSize().getWidth());
		Assert.assertEquals("User failed to assert logo Height", Height_1, logoSize.getSize().getHeight());

		System.out.println("User successfully assert log width and height are respectively "
				+ logoSize.getSize().getWidth() + " and " + logoSize.getSize().getHeight());

		// scn.log("User successfully assert log width and height are respectively "+
		// logoSize.getSize().getWidth()+" and "+ logoSize.getSize().getHeight());
	}

}
