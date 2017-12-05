package com.xx;

public class Contacts {
	//1、成员变量、属性
	//2、有参和无参的构造方法
	//3、set  get方法
	//4、toString方法
	
	private String name;
	private String sex;
	private String telNum;
	
	
	public Contacts(){
		
	}
	
	public Contacts(String name, String sex, String telNum) {
		this.name = name;
		this.sex = sex;
		this.telNum = telNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	@Override
	public String toString() {
		return "联系人[姓名：" + name + ",性別：" + sex + ", 电话" + telNum
				+ "]";
	}
	
	
	
}
