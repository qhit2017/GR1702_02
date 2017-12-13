package com.xx;



import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

public class ContactsBook implements IContacts {
	void help(){
		System.out.println("通讯录系统");
		System.out.println("1添加联系人");
		System.out.println("2显示所有联系人");
		System.out.println("3按姓名查找联系人");
		System.out.println("4按姓别查找联系人");
		System.out.println("5按电话查找联系人");
		System.out.println("6退出通讯录");
		
	}
	@Override
	public void Add(ArrayList<Contacts> arr, Scanner as) {
		// TODO Auto-generated method stub
		String s = as.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("输入错误");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arr.add(contacts);
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void info(ArrayList<Contacts> arr) {
		// TODO Auto-generated method stub
		//普通循环
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).toString());
		}
		/*
		//增强for循环
		for (Contacts contacts : arr) {
			System.out.println(contacts.toString());
		}
		//迭代器
		Iterator<Contacts> iterator = arr.iterator();
		while (iterator.hasNext()) {
			Contacts contacts = (Contacts) iterator.next();
			System.out.println(contacts.toString());
		}*/
	}

	@Override
	public void findByName(ArrayList<Contacts> arr, String name) {
		// TODO Auto-generated method stub
		boolean isQuit = false;
		for (int i = 0; i < arr.size(); i++) {
			Contacts contacts = arr.get(i);
			String string = contacts.getName();
			if (name.equals(string)) {
				System.out.println(contacts.toString());
				isQuit = true;
			}
		}
		if(!isQuit){
			System.out.println("查找错误");
		}
		
	}

	@Override
	public void findBySex(ArrayList<Contacts> arr, String sex) {
		// TODO Auto-generated method stub
		boolean isQuit = false;
		for (int i = 0; i < arr.size(); i++) {
			Contacts contacts = arr.get(i);
			String string = contacts.getSex();
			if (sex.equals(string)) {
				System.out.println(contacts.toString());
				isQuit = true;
			}
	}
		if(!isQuit){
			System.out.println("查找错误");
		}
	}
	@Override
	public void findBy(ArrayList<Contacts> arr, String num) {
		// TODO Auto-generated method stub
		boolean isQuit = false;
		for (int i = 0; i < arr.size(); i++) {
			Contacts contacts = arr.get(i);
			String string = contacts.getTelNum();
			if (num.equals(string)) {
				System.out.println(contacts.toString());
				isQuit = true;
			} 
	}
		if(!isQuit){
			System.out.println("查找错误");
		}
	}

	
}
