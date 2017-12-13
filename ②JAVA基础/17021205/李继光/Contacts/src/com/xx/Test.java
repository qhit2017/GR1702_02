package com.xx;
//
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts> arr = new ArrayList<Contacts>();
		Scanner as = new Scanner(System.in);
		ContactsBook con = new ContactsBook();
		con.help();
		boolean isQuit = true;
		int key;
		while (isQuit) {
			key = as.nextInt();
			switch (key) {
			case 1:
				System.out.println("请添加一个联系人，按（xxx,x,000000000）这种方式");
				con.Add(arr, as);
				break;
			case 2:
				con.info(arr);
				break;
			case 3:
				System.out.println("请输入您要查询的姓名");
				String name = as.next();
				con.findByName(arr, name);
				break;
			case 4:
				System.out.println("请输入您要查询的性别");
				String sex = as.next();
				con.findBySex(arr, sex);
				break;
			case 5:
				System.out.println("请输入您要查询的电话");
				String num = as.next();
				con.findBy(arr, num);
				break;
			case 6:
				isQuit = false;
				break;
			
			default:
				System.out.println("请按规定操作本系统");
				break;
			}
		}
		System.out.println("感谢您的使用");

	}

}
