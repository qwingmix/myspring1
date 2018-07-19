package com.util;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 64
 * ����������������Ǳ�֤�����ļ�applicationContext��Ψһ�ԣ���Ϊ̫��Ҫ�ˣ���֤���ĵ�̬
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
