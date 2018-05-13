package com.uestc.study_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		test.loadProperties();
	}
	public void loadProperties(){
		//方法一，添加文件
//    	FileInputStream fileInputStream = null;
//        try {
//			fileInputStream = new FileInputStream("./conf/feeds-ranker-conf.properties");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        //方法二添加，加载文件
    	InputStream fileInputStream = null;
    	fileInputStream = this.getClass().getClassLoader().getResourceAsStream("./conf/feeds-ranker-conf.properties");
    	System.out.println("....1.....");
        if(fileInputStream != null){
        	Properties properties = new Properties();
        	try {
				properties.load(fileInputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	String key = "A.G.proper1";
        	if(properties.containsKey(key)){
        		System.out.println(properties.get(key));
        	}
        }
        System.out.println("...2.....");
    }
}
