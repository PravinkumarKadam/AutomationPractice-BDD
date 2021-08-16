package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageObjects {

	WebDriver driver;

	private final By SignButton = By.xpath("//a[@class='login']");



	public SignInPageObjects(WebDriver driver)
	{
		this.driver=driver;	
	}


	public void ClickSignButton()
	{
		WebElement buttonClick = driver.findElement(SignButton);
		buttonClick.click();
	}	


}
