//接口
package com.chen;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {

	//录入通讯录信息
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	
	//查询所有
	void infoContacts(ArrayList<Contacts>arrayList);
	
	//根据姓名查询，性别查询，电话查询
	void findByName(ArrayList<Contacts>arrayList,String name);
	void findBySex(ArrayList<Contacts>arrayList,String Sex);
	void findByNum(ArrayList<Contacts>arrayList,String num);
	
}
