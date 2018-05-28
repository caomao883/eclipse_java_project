package com.uestc.study_java.properies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SystemProperies {
	private static Logger LOG = LoggerFactory.getLogger(SystemProperies.class);
	public static void main(String[] args){
		LOG.info(".....ouhuihao dd = {}",1);
		System.out.println(System.getProperty("key1","value1"));
		//getEnvProperies();
	}
//	public static void getEnvProperies(){
//		System.out.println("env properies:");
//		Map<String,String> mp = System.getenv();
//		for(Entry<String, String> item:mp.entrySet()){
//			System.out.println("key = " + item.getKey()+" , value" + item.getValue());
//		}
//	}
}
