package com.htc.testing.testingproject;

import org.apache.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Logger logger = Logger.getLogger(App.class);
    	logger.info("Information");
    	logger.debug("Debug message");
    	logger.error("Error message");
    	logger.fatal("Fatal message");
    	logger.warn("Warning message");
        System.out.println( "Hello World!" );
    }
}
