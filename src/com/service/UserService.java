package com.service;

public class UserService {
	private String name;
	private BybService bybservice;//���ǻ�����֮�ϵģ�����ѧϰ����֮���ϵ����ġ� ����Ӧ�ý�����������á�

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
		System.out.println("hello "+name+"������ĵ�һ��spring��ܳ���");
		//���������ϵĸ߼�Ӧ��
		bybservice.sayBye();
	}


	
	

}
