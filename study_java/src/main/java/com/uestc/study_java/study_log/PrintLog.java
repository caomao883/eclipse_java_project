package com.uestc.study_java.study_log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintLog {
	private static final Logger LOGGER = LoggerFactory.getLogger(PrintLog.class);
	public static void main(String[] args){
		LOGGER.info("This is a print Log Test");
		System.out.println("This is a Test");
	}
}
