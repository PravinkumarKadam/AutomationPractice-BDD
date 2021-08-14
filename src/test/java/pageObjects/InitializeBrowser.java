package pageObjects;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class InitializeBrowser {

	private static final Logger logger = LogManager.getLogger(InitializeBrowser.class);

	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;

	public InitializeBrowser(WebDriver driver)
	{
		this.driver = driver;
	}

	public void ini_driver() 
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 40);
		logger.info("Driver initialized successfully.");
	}

}
