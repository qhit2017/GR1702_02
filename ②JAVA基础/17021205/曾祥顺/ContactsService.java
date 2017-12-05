package zengxiangshun;

import java.util.ArrayList;

import java.util.Scanner;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2004年1月5日 下午3:16:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ContactsService implements IContacts {
	void hellp(){
		System.out.println("通讯录系统");
		System.out.println("1、添加");
		System.out.println("2、遍历");
		System.out.println("3、姓名查询");
		System.out.println("4、性别查询");
		System.out.println("5、电话查询");
		System.out.println("6、退出系统");
	}

	@Override
	public void add(ArrayList<Contacts> arrayList, Scanner sc) {

		String a = sc.next();
		String[] s = a.split(",");
		if (s.length != 3) {
			System.out.println("你输格式有误，请重新输入");
		} else {
			Contacts contacts = new Contacts(s[0], s[1], s[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void info(ArrayList<Contacts> arrayList) {
		// 1、for 增强循环
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}
		/*
		 * //2、普通循环 for (int i = 0; i < arrayList.size(); i++) {
		 * System.out.println(arrayList.get(i).toString()); } //3、迭代器
		 * Iterator<Contacts> iterator = arrayList.iterator(); while
		 * (iterator.hasNext()) { Contacts contacts = (Contacts)
		 * iterator.next(); System.out.println(contacts.toString()); }
		 */
	}

	@Override
	public void find(ArrayList<Contacts> arrayList, String leixing, Scanner sc) {
		String a = sc.next();
		if (leixing.equals("姓名")) {
			boolean isFind = false;
			for (int i = 0; i < arrayList.size(); i++) {
				String name = arrayList.get(i).getName();
				if (a.equals(name)) {
					System.out.println(arrayList.get(i).toString());
					isFind = true;
				}
			}
			if (!isFind) {
				System.out.println("没有这个对象");
			}
		}
		if (leixing.equals("性别")) {
			boolean isFind = false;
			for (int i = 0; i < arrayList.size(); i++) {
				String name = arrayList.get(i).getSex();
				if (a.equals(name)) {
					System.out.println(arrayList.get(i).toString());
					isFind = true;
				}
			}
			if (!isFind) {
				System.out.println("没有这个对象");
			}
		}
		if (leixing.equals("电话")) {
			boolean isFind = false;
			for (int i = 0; i < arrayList.size(); i++) {

				String name = arrayList.get(i).getTel();
				if (a.equals(name)) {
					System.out.println(arrayList.get(i).toString());
					isFind = true;
				}

			}
			if (!isFind) {
				System.out.println("没有这个对象");
			}
		}

	}

}
