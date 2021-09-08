package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

/**
 * This class help to initialize of Properties and WebDriver.
 * 
 * @Author: Pravinkumar D Kadam
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 */
public class BrowserFactory {

	private static final Logger logger = LogManager.getLogger(BrowserFactory.class);

	private static WebDriver driver = null;
	Properties prop;
	public String BROWSER_NAME;

	/**
	 * This method use to initialization of Properties and Creates property list
	 * with no default values..
	 * 
	 * @return Properties
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public Properties intialization_pro() {
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(".//src/test/resources/config.properties");
			prop.load(file);
		} catch (Exception e) {
			logger.info("FileNotFoundException : file path is not correct \n"
					+ "IOException : Exception occured while file loading.");
			e.printStackTrace();
		}
		return prop;
	}

	/**
	 * This method is used to initialize the WebDriver on the basis of given browser
	 * name Searches for the property with the specified key in this property list.
	 * and using those key to open specific Browser , set implicitly Wait , maximize
	 * browser , etc...
	 * 
	 * @return Driver
	 * @author Pravinkumar D kadam
	 */
	public WebDriver openingBrowser() {

		String BrowserName = prop.getProperty("browser").trim();
		int implicitWait = Integer.parseInt(prop.getProperty("ImplicitWait").trim());

		logger.info("Browser Name is : " + BrowserName);

		BROWSER_NAME = BrowserName;

		if (BrowserName.equalsIgnoreCase("chrome")) {

			if (prop.getProperty("headless").equalsIgnoreCase("yes")) {
				ChromeOptions opt = new ChromeOptions();
				opt.addArguments("--headless");

				driver = new ChromeDriver(opt);
			} else {
				driver = new ChromeDriver();
			}
		} else if (BrowserName.equalsIgnoreCase("firefox")) {

			if (prop.getProperty("headless").equalsIgnoreCase("yes")) {
				FirefoxOptions opt = new FirefoxOptions();
				opt.addArguments("--headless");

				driver = new FirefoxDriver(opt);
			}

			else {
				driver = new FirefoxDriver();
			}
		} else if (BrowserName.equalsIgnoreCase("opera")) {

			if (prop.getProperty("headless").equalsIgnoreCase("yes")) {
				OperaOptions opt = new OperaOptions();
				opt.addArguments("--headless");

				driver = new OperaDriver(opt);
			} else {
				driver = new OperaDriver();
			}
		} else if (BrowserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		} else {
			System.out.println("Browser is not available to run so provide another option.");
			logger.info("Please pass the correct browser name " + BrowserName);
		}

		if (prop.getProperty("maximize").equalsIgnoreCase("yes")) {
			driver.manage().window().maximize();
		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);

		return driver;
	}

	/**
	 * This method is used to return the browser name
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public String getBrowserName() {
		String BROWSER_NAME = prop.getProperty("browser");
		return BROWSER_NAME;
	}

}
