package datadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetcheDataFromPropertyFile {

	public static void main(String[] args) throws IOException {

		// The  Physical property file is convert to java representation
		FileInputStream fis = new FileInputStream("D:\\java practice\\Asifwithautomation\\Testdata\\Propertyata.properties");
		//2. creating an object of properties class
		Properties prop=new Properties();
		//3. calling the load method to read the key and value pair
		prop.load(fis);
		//4.calling the value using the key
		String urlFromPropertyFile = prop.getProperty("url");
		System.out.println(urlFromPropertyFile);
		
		String browserFromPropertyFile = prop.getProperty("browser");
		System.out.println(browserFromPropertyFile);
		
		String usernameFromPropertyFile = prop.getProperty("username");
		System.out.println(usernameFromPropertyFile);
		
		String passwordFromPropertyFile = prop.getProperty("password");
		System.out.println(passwordFromPropertyFile);
	}

}
