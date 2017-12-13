package com.chen;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Contacts>arrayList=new ArrayList<Contacts>();
		Contactsservice cService=new Contactsservice();
		Scanner sc =new Scanner(System.in);
		cService.helpInfo();
		int key=0;
		boolean isQuit=true;
		while (isQuit) {
			key=sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请添加一个联系人，格式如下：");
				System.out.println("大胖,女,15874568542");
				cService.addContacts(arrayList, sc);
				break;
			case 2:
				cService.infoContacts(arrayList);
				break;
			case 3:
				String name=sc.next();
				cService.findByName(arrayList, name);
				break;
			case 4:
				String Sex=sc.next();
				cService.findBySex(arrayList, Sex);
				break;
			case 5:
				  String Num=sc.next();
				cService.findByNum(arrayList, Num);
				break;
			case 6:
				isQuit=false;
				System.out.println("退出本系统！");
				break;
			default:
				System.out.println("您的命令无效！");
				break;
			}
		}
	}
}
