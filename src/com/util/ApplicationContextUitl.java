package com.util;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 64
 * 这个工具类的意义就是保证核心文件applicationContext的唯一性，因为太重要了，保证他的单态
 */
final public class ApplicationContextUitl {
	private static ApplicationContext ac = null;
	private ApplicationContextUitl() {
		
	}
	static {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public static ApplicationContext getApplicationContext() {
		return ac; 
	}

}
