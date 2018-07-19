package com.service;

public class UserService {
	private String name;
	private BybService bybservice;//这是基本款之上的，用来学习豆豆之间关系问题的。 这里应该叫做对象的引用。

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public BybService getBybservice() {
		return bybservice;
	}

	public void setBybservice(BybService bybservice) {
		this.bybservice = bybservice;
	}

	public void sayHello() {
		System.out.println("hello "+name+"这是你的第一个spring框架程序");
		//基本款以上的高级应用
		bybservice.sayBye();
	}


	
	

}
