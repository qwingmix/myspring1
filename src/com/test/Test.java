package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.BybService;
import com.service.UserService;
import com.util.ApplicationContextUitl;

public class Test {
	public static void main(String[] args) {
		//������ʹ�ô�ͳ�ķ���������UserService��sayhello()
//		UserService userService = new UserService();
//		userService.setName("derek");
//		userService.sayHello();
		
		
/*		
 * û��ʹ�ù�����ApplicationContextUtil֮ǰ������
		//��������ʹ��spring��������������
		//1.�õ�spring��������� aplicationContext����
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService)ac.getBean("userService");
		us.sayHello();
		*/
		
		
		//ʹ���˹�����ApplicationContextUtil֮���������Ϊ�˱�֤ac��Ψһ�ԣ���̬
		//eclipse������Զ������
		((UserService)ApplicationContextUitl.getApplicationContext().getBean("userService")).sayHello();//��Ҫ���ø��ӣ���ʵ��������22�п�ʼ�ļ򻯣���������Ǹ��������
		
		
		//�� ac[����applicationContext����]��
//		BybService bybservice = (BybService)ac.getBean("bybservice");
//		bybservice.sayBye();
		
		
	}

}

/*hello derek������ĵ�һ��spring��ܳ���
bye ���ϴ�������ĵڶ���spring���������
*/