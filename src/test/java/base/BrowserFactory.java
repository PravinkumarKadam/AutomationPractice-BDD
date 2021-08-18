package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	private static WebDriver driver = null;

	Properties prop;

	public Properties intialization_pro() {
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream("/src/test/resources/config.properties");
			prop.load(file);
		} catch (Exception e) {
			System.out.println("FileNotFoundException : file path is not correct \n"
					+ "IOException : Exception occured while file loading.");
			e.printStackTrace();
		}

		return prop;
	}

	public WebDriver opeingBrowser() {
		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser is not available to run so provide another option.");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		return driver;
	}
}
