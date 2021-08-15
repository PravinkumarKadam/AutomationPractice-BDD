package pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class LandingPagePageObject {

	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;


	private static final By productCatageroyLocator = By.xpath("//div[@id='block_top_menu']/ul/li/a");
	private static final By logoImageLocator = By.xpath("//img[@class='logo img-responsive']");


	public LandingPagePageObject(WebDriver driver,Scenario scn) 
	{
		this.driver = driver;
		this.scn = scn;
	}


	public void productlist() {

		List <WebElement> productList = driver.findElements(productCatageroyLocator);

		System.out.println("Product list :: ");
		//scn.log("Product list :: ");
		for(WebElement e : productList)

		{
			System.out.println("          "+ e.getText());
			// scn.log("          "+ e.getText());
		}

	}

	public void LogoDisplay() 
	{
		boolean logoDisplayOrNOt =  driver.findElement(logoImageLocator).isDisplayed();
		//   scn.log("Logo is Display =>"+ logoDisplayOrNOt);
	}





}
