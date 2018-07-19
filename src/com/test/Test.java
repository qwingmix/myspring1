package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.BybService;
import com.service.UserService;
import com.util.ApplicationContextUitl;

public class Test {
	public static void main(String[] args) {
		//我们先使用传统的方法来调用UserService的sayhello()
//		UserService userService = new UserService();
//		userService.setName("derek");
//		userService.sayHello();
		
		
/*		
 * 没有使用工具类ApplicationContextUtil之前的做法
		//我们现在使用spring来完成上面的任务
		//1.得到spring的容器框架 aplicationContext对象啊
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService)ac.getBean("userService");
		us.sayHello();
		*/
		
		
		//使用了工具类ApplicationContextUtil之后的做法（为了保证ac的唯一性，单态
		//eclipse会帮你自动引入的
		((UserService)ApplicationContextUitl.getApplicationContext().getBean("userService")).sayHello();//不要觉得复杂，其实就是上面22行开始的简化，不会变来那个来存而已
		
		
		//从 ac[代表applicationContext容器]中
//		BybService bybservice = (BybService)ac.getBean("bybservice");
//		bybservice.sayBye();
		
		
	}

}

/*hello derek这是你的第一个spring框架程序
bye 王孟达这是你的第二个spring框架输出语句
*/