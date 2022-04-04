package com.configuration.helper;

public class File_Reader_Manager {
//SDP
	public File_Reader_Manager() {
		
	}
	public static File_Reader_Manager get_Instance_FRM() {
		File_Reader_Manager helper=new File_Reader_Manager();
return helper;
	}
	
	public Configuration_reader get_Instance_CR() throws Throwable {   //configuration create object //nonstatic method
		Configuration_reader reader=new Configuration_reader();
		
return reader;

	}
	}
