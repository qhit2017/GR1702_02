package com.qh;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {
	// 录入通讯录信息
	void addContacts(ArrayList<Contacts> arrayList, Scanner sc);

	// 查询所有
	void infoContacts(ArrayList<Contacts> arrayList);

	// 根据姓名、性别、电话查询
	void findByName(ArrayList<Contacts> arrayList, String Name);

	void findBySex(ArrayList<Contacts> arrayList, String Sex);

	void findByNum(ArrayList<Contacts> arrayList, String Num);
}
