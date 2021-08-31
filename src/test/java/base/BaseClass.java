package base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

/**
 * This class contains static block and static method which read a properties
 * file.
 * 
 * @author Pravinkumar D Kadam
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 */
public class BaseClass {

	private static String browser;

	static {
		Properties properties = readPropertiesFile();
		browser = properties.getProperty("browser");
	}

	private static Properties readPropertiesFile() {
		BufferedReader reader;
		Properties prop = null;
		String propFilePath = "src/test/resources/config.properties";
		try {
			FileReader fileReader = new FileReader(propFilePath);
			reader = new BufferedReader(fileReader);
			prop = new Properties();
			prop.load(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

	/**
	 * This is static method.
	 * 
	 * @return browser
	 * @author Pravinkumar D Kadam
	 */
	public static String getBrowser() {
		return browser;
	}

}