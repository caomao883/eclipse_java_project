package com.uestc.study_java.properies;

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
		//test.loadProperties2();
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
        	String key2 = "A.G.proper2";
        	if(properties.containsKey(key2)){
        		System.out.println(properties.get(key));
        	}
        }else{
        	System.out.println("fileInputStream is null");
        }
        System.out.println("...2.....");
    }
	//该方法不行
//	public void loadProperties2(){
//		//方法一，添加文件
//    	FileInputStream fileInputStream = null;
//        try {
//			fileInputStream = new FileInputStream("./conf/feeds-ranker-conf.properties");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        //方法二添加，加载文件
//    	//InputStream fileInputStream = null;
//    	//fileInputStream = this.getClass().getClassLoader().getResourceAsStream("./conf/feeds-ranker-conf.properties");
//    	System.out.println("...into loadProperties2......");
//        if(fileInputStream != null){
//        	Properties properties = new Properties();
//        	try {
//				properties.load(fileInputStream);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        	String key = "A.G.proper1";
//        	if(properties.containsKey(key)){
//        		System.out.println(properties.get(key));
//        	}
//        	String key2 = "A.G.proper2";
//        	if(properties.containsKey(key2)){
//        		System.out.println(properties.get(key));
//        	}
//        }else{
//        	System.out.println("fileInputStream is null");
//        }
//        System.out.println("...out loadProperties2.....");
//    }
}
