package com.Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class Log
{
public static Logger logger = Logger.getLogger("Log");
	
public static void info(String message)
{
	PropertyConfigurator.configure("log4j.properties");
	logger.info(message);
	
}
}