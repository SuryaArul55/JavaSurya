package com.logger_demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class propertyconfiguration {
static Logger Log=Logger.getLogger(propertyconfiguration.class);
public static void main(String[] args) {
	
	PropertyConfigurator.configure("log4j.properties");
	Log.debug("Debug");
	Log.info("Info");
	Log.warn("warning");
	Log.error("Error");
	Log.fatal("fatal");
}
}          