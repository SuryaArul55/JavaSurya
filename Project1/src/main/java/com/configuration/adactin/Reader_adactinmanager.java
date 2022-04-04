package com.configuration.adactin;

public class Reader_adactinmanager {
public Reader_adactinmanager() {
		
	}
	public static Reader_adactinmanager get_Instance_FRM() {
		Reader_adactinmanager helper=new Reader_adactinmanager();
return helper;
	}
	
	public Con_adactinreader get_Instance_CR() throws Throwable {   //configuration create object //nonstatic method
		Con_adactinreader reader=new Con_adactinreader();
		
return reader;

	}
}
