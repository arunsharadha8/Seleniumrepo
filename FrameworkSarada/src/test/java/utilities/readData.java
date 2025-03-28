package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readData {
public static final String path = "./src/test/resources/testData/data.properties";
	
	Properties prop = new Properties();
	
	public readData() {
	try {	
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	public String readUsername() {
		return prop.getProperty("username");
	}

	
	public String readpassword() {
		return prop.getProperty("password");
	}
	
}
