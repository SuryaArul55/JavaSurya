package com.configuration.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Con_adactinreader {

	public static Properties p ;//null
	public Con_adactinreader() throws Throwable {
		File f= new File("C:\\Users\\Admin\\eclipse-workspace\\Project1\\src\\main\\java\\com\\testdata\\properties\\configadactin.properties");
		FileInputStream fis= new FileInputStream(f);//FileNotFound
	    p=new Properties();
		p.load(fis);
	}
	public String get_config_Url() throws Throwable {
		
		String url=p.getProperty("url");//case sensitive
	    return url;
	
	}
	
public String get_config_username() throws Throwable {
	String username =p.getProperty("username");
	return username;
   }
public String get_config_password() throws Throwable {
	String password =p.getProperty("password");
	return password;

}
public String get_config_Checkin() throws Throwable {
	String Checkin =p.getProperty("Checkin");
	return Checkin;

}
public String get_config_Checkout() throws Throwable {
	String Checkout =p.getProperty("Checkout");
	return Checkout;

}
public String get_config_Firstname() throws Throwable {
	String Firstname =p.getProperty("Firstname");
	return Firstname;

}
public String get_config_Lastname() throws Throwable {
	String Lastname =p.getProperty("Lastname");
	return Lastname;

}	
public String get_config_Address() throws Throwable {
	String Address =p.getProperty("Address");
	return Address;
}

public String get_config_Cardno() throws Throwable {
	String Cardno =p.getProperty("Cardno");
	return Cardno;
}
public String get_config_ccvno() throws Throwable {
	String ccvno =p.getProperty("ccvno");
	return ccvno;
}
}
