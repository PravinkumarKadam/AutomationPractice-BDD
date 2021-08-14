package pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPagePageObject {

	WebDriver driver;
	WebDriverWait wait;

	public LandingPagePageObject(WebDriver driver) 
	{
	this.driver = driver;
	}
	private By productCatageroyLocator = By.xpath("//div[@id='block_top_menu']/ul/li/a");


	public void productlist() {

	List <WebElement> productList = driver.findElements(productCatageroyLocator);
	
	for(WebElement e : productList)
	   {System.out.println(e);}
	
	}







}
