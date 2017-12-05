//实体类
package com.chen;

public class Contacts {
    //成员变量，属性
	 private String name;
	 private String sexs;
	 private String telNum;
	 //无参
	public Contacts() {
		super();
	}
   //有参
	public Contacts(String name, String sexs, String telNum) {
		this.name = name;
		this.sexs = sexs;
		this.telNum = telNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSexs() {
		return sexs;
	}

	public void setSexs(String sexs) {
		this.sexs = sexs;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sexs=" + sexs + ", telNum="
				+ telNum + "]";
	}
	 
}
