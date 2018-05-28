package com.uestc.study_java.properies;

import java.util.Map;
import java.util.Map.Entry;

public class SystemProperies {
	public static void main(String[] args){
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
