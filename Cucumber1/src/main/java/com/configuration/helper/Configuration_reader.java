package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_reader {
public static Properties p ;//null
	public Configuration_reader() throws Throwable {
		File f= new File("C:\\Users\\Admin\\eclipse-workspace\\Project1\\src\\main\\java\\com\\testdata\\properties\\Configuation.properties");
		FileInputStream fis= new FileInputStream(f);//FileNotFound
	    p=new Properties();
		p.load(fis);
	}
	public String get_config_Url() throws Throwable {
		
		String url=p.getProperty("url");//case sensitive
	    return url;
	
	}
	
public String get_config_Emailid() throws Throwable {
	String emailid =p.getProperty("emailid");
	return emailid;
   }
public String get_config_password() throws Throwable {
	String password =p.getProperty("password");
	return password;

}
}
