package base;

/**
 *	This class holding up methods
 *	to pause the script for certain
 *	amount of time
 *	@IMP_Note : Avoid using this utility unless its
 *	very much needed 
 *  @author Pravinkumar D Kadam
 */
public class WaitUtilities {
	
	/**
	 * This method will pause the script for 3000 milliseconds
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
