 package com.logger_demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basicconfiguration {
	//factory design pattern
		static Logger Log=Logger.getLogger(Basicconfiguration.class);
	public static void main(String[] args) {
		//configuration 
		BasicConfigurator.configure();
		
	}

}

