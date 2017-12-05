package com.qh;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements IContactsBook {
	void helpInfo() {
		System.out.println("******通讯录管理系统******");
		System.out.println("1.添加一条联系人");
		System.out.println("2.显示所有联系人信息");
		System.out.println("3.通过姓名查找联系人");
		System.out.println("4.通过性别查找联系人");
		System.out.println("5.通过电话查找联系人");
		System.out.println("6.退出");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// 1.接收输入的值
		String s = sc.next();
		// 2.拆分
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("输入的格式不正确，请重新输入");
		} else {
			// 3.通过上面的信息构造一个Contacts的实体信息
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			// 4.添加到arrayList里面
			arrayList.add(contacts);
			// 5.打印刚刚添加的这条信息
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void findByName(ArrayList<Contacts> arrayList, String Name) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String name = contacts.getName();
			if (Name.equals(name)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("你要查找的对象不存在");
		}
	}

	@Override
	public void findBySex(ArrayList<Contacts> arrayList, String Sex) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String sex = contacts.getSex();
			if (Sex.equals(sex)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("你要查找的对象不存在");
		}
	}

	@Override
	public void findByNum(ArrayList<Contacts> arrayList, String Num) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String num = contacts.getTelNum();
			if (Num.equals(num)) {
				System.out.println(contacts.toString());
				isfind = true;
			}
		}
		if (!isfind) {
			System.out.println("你要查找的对象不存在");
		}
	}
}
