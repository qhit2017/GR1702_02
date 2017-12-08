package com.wxxx;

import java.util.ArrayList;
/*制作人：王欣
 *日期2017年12月7日时间上午8:26:51
 *邮箱:2408368509@qq.com
 */
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	ArrayList<Contacts> arrayList=new ArrayList<Contacts>();
	Scanner sc =new Scanner(System.in);
	ContactsService contactsService=new ContactsService();
	contactsService.help();
	boolean isExit=true;
	while (isExit) {
		int key = sc.nextInt();
		switch (key) {
		case 1:
			contactsService.addContacts(arrayList, sc);
			break;
		case 2:
			contactsService.infoContacts(arrayList);
			break;
		case 3:
			contactsService.stock(arrayList, sc);
			break;
		case 4:
			contactsService.market(arrayList, sc);
			break;
		case 5:
			isExit=false;
			break;
		
		default:
			System.out.println("您输入的指令超出范围");
			break;
		}
	}
	System.out.println("拜拜");
}
}
