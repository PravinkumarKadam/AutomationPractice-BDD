package base;

import java.io.FileInputStream;
import java.util.Properties;

public class Initilization {
	
	Properties prop;
	
	
	public Properties intialization_pro() 
	{
		prop = new Properties();
		try {
	    FileInputStream file = new FileInputStream("G:\\Workplace\\com.automationPractice-BDD\\src\\test\\resources\\PropertiesFile");
		prop.load(file);
		}
		catch(Exception e)
		{
			System.out.println("FileNotFoundException : file path is not correct \n"+"IOException : Exception occured while file loading.");
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	
	
	
}
