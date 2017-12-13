package com.wxxx;

import java.util.ArrayList;
/*制作人：王欣
 *日期2017年12月6日时间下午6:45:14
 *邮箱:2408368509@qq.com
 */
import java.util.Scanner;

public interface IContacts {
	
	void addContacts(ArrayList<Contacts>arrayList,Scanner sc);
	
	void infoContacts(ArrayList<Contacts>arrayList);
	
	void stock(ArrayList<Contacts> arrayList, Scanner sc);

	void market(ArrayList<Contacts> arrayList, Scanner sc);
}
