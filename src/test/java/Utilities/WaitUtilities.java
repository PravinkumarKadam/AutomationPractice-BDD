package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.Scenario;

/**
 * This class holding up methods to pause the script for certain amount of time
 * @IMP_Note : Avoid using this utility unless its very much needed
 * @author Pravinkumar D Kadam
 */
public class WaitUtilities {

	public Scenario scn;
	public WebDriver driver;

	public WaitUtilities(WebDriver driver, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
	}

	/**
	 * This method will pause the script for 3000 milliseconds
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public static void Wait_KiloBytes() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will pause the script for 5000 milliseconds
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public static void Wait_MegaBytes() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will pause the script for 10 seconds
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public static void Wait_GigaBytes() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
