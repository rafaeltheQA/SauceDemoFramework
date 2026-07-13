package utilities;

import utilities.FileReadUtilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReadUtilities {
	
	public static String getConfigProperty(String key)
	{
		Properties properties = new Properties();
		
		try
		{
			FileInputStream file = 
					new FileInputStream("testdata/config.properties");
			
			properties.load(file);
			file.close();
		}
		catch (IOException e)
		{
			throw new RuntimeException(
					"Unable to read config.properties", e);
	
		}
		return properties.getProperty(key);
	}
	public static String getElementProperty(String key)
	{
	    Properties properties = new Properties();

	    try
	    {
	        FileInputStream file =
	                new FileInputStream("testdata/element.properties");

	        properties.load(file);
	        file.close();
	    }

	    catch (IOException e)
	    {
	        throw new RuntimeException(
	                "Unable to read element.properties", e);
	    }

	    return properties.getProperty(key);
	}
}
