//实现类
package com.chen;

import java.util.ArrayList;
import java.util.Scanner;

public class Contactsservice implements IContacts {
	void helpInfo(){
		System.out.println("-----通讯管理系统-----");
		System.out.println("1:添加电话簿成员");
		System.out.println("2:显示所有通讯录信息");
		System.out.println("3:姓名搜索");
		System.out.println("4:性别搜索");
		System.out.println("5:电话搜索");
		System.out.println("6:退出本系统！   ");
	}
	
	private void Contacts() {
		// TODO Auto-generated method stub
	}

	// 录入通讯录信息
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("您输入的有误，请重新输入。按以下提示输入“姓名,电话,性别”！");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			// 添加到ArrayList里边
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}
	}

	// 查询所有
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// 普通循环
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
	}

	// 根据姓名查询，性别查询，电话查询
	@Override
	public void findByName(ArrayList<Contacts> arrayList, String name) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getName();
			if (name.equals(string)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("你要查找的对象不存在");
		}
	}

	@Override
	public void findBySex(ArrayList<Contacts> arrayList, String Sex) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getSexs();
			if (Sex.equals(string)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("你要查找的对象不存在!");
		}
	}

	@Override
	public void findByNum(ArrayList<Contacts> arrayList, String Num) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getTelNum();
			if (Num.equals(string)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("你要查找的对象不存在!");
		}
	}
}
