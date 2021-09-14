package Utilities;

import base.TestContext;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

/**
 * This class holding up methods to pause the script for certain amount of time
 * @IMP_Note : Avoid using this utility unless its very much needed
 * @author Pravinkumar D Kadam
 */
@Log4j2
@AllArgsConstructor
public class WaitUtilities  {

	WebDriver driver;
	Scenario scn;


	/**
	 * This method will pause the script for 3000 milliseconds i.e. 3sec
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
	 * This method will pause the script for 5000 milliseconds i.e. 5sec
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
	 * This method will pause the script for 10000 milliseconds i.e. 10sec 
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
