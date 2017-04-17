package com.example.log4jtest;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;






public class Log4j {
	
 
	public static void main(String[] args) {
		
	 Logger log = Logger.getLogger("---->>");
		DOMConfigurator.configure("log4j.xml");
		log.trace("jai mata di");
		log.info("start");
		log.debug("maa");
		log.warn("shama karna maa");
		log.error("sry");
		log.fatal("aum namah shivae");
		
		//System.out.println("hello");
	}

}
