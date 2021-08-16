package base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class BaseClass {

	private static  String browser;

	static {
		Properties properties = readPropertiesFile();
		browser  = properties.getProperty("browser");
	}


	private static Properties readPropertiesFile()
	{
		BufferedReader reader ;
		Properties prop = null;
		String propFilePath = "src/test/resources/config.properties";
		try 
		{
			FileReader fileReader = new FileReader(propFilePath);
			reader = new BufferedReader(fileReader);
			prop = new Properties();
			prop.load(reader);
			reader.close();   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return prop;	
	}

	
	public static String getBrowser() 
	{
		return browser;
	}

}
