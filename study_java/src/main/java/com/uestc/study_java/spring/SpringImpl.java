package com.uestc.study_java.spring;

import javax.swing.Spring;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class SpringImpl {
	public static Logger LOG = org.slf4j.LoggerFactory.getLogger(Spring.class);
	public int c;
	public void init(){
		
		this.c = 3;
		LOG.info("ouhuihao This is a Test!!! ,c = {}",this.c);
	}
}	
