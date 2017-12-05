package com.qh;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 定义一个ArrayList用来存储通讯录信息
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService Service = new ContactsService();
		Scanner sc = new Scanner(System.in);
		Service.helpInfo();
		int key = 0;
		boolean isQuit = true;
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请添加一个联系人");
				System.out.println("格式如下:\n张三,男,13608877477");
				Service.addContacts(arrayList, sc);
				break;
			case 2:
				System.out.println("所有联系人信息如下:");
				Service.infoContacts(arrayList);
				break;
			case 3:
				System.out.println("输入姓名查找联系人");
				String Name = sc.next();
				Service.findByName(arrayList, Name);
				break;
			case 4:
				System.out.println("输入性别查找联系人");
				String Sex = sc.next();
				Service.findBySex(arrayList, Sex);
				break;
			case 5:
				System.out.println("输入电话查找联系人");
				String Num = sc.next();
				Service.findByNum(arrayList, Num);
				break;
			case 6:
				isQuit = false;
				break;
			default:
				System.out.println("你输入的命令无效");
				break;
			}
		}
		System.out.println("退出");
	}
}
