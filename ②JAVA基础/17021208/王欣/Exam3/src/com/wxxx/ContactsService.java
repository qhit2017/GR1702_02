package com.wxxx;

import java.util.ArrayList;
import java.util.Scanner;

/*制作人：王欣
 *日期2017年12月6日时间下午6:52:24
 *邮箱:2408368509@qq.com
 */

public class ContactsService implements IContacts {

	void help() {
		System.out.println("----商店系统帮助信息----");
		System.out.println("请输入指令编号");
		System.out.println("1   新增商品");
		System.out.println("2  查看所有商品");
		System.out.println("3   进货");
		System.out.println("4   销售");
		System.out.println("5   退出");

	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String n = sc.next();
		String[] s = n.split(",");
		if (s.length == 4) {
			Contacts c = new Contacts();
			c.setName(s[0]);
			c.setPrice(Double.parseDouble(s[1]));
			c.setId(s[2]);
			c.setNumber(Integer.parseInt(s[3]));

			arrayList.add(c);
			System.out.println(c);
		} else {
			System.out.println("您输入的格式不对");
		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
	}

	@Override
	public void stock(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("请输入商品编号");
		String n = sc.next();
		boolean isOk = false;
		for (int i = 0; i < arrayList.size(); i++) {
			if (n.equals(arrayList.get(i).getId())) {
				System.out.println("请输入要进货的数量");
				int j = sc.nextInt();
				int k = arrayList.get(i).getNumber();
				k += j;
				arrayList.get(i).setNumber(k);
				System.out.println(arrayList.get(i));
				isOk = true;
			}
		}
		if (!isOk) {
			System.out.println("您要进的商品不存在");
		}
	}

	@Override
	public void market(ArrayList<Contacts> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("请输入商品编号");
		String n = sc.next();
		boolean isOk = false;
		for (int i = 0; i < arrayList.size(); i++) {
			if (n.equals(arrayList.get(i).getId())) {
				System.out.println("请输入要销售的数量");
				int j = sc.nextInt();
				if (j <= arrayList.get(i).getNumber()) {
					int k = arrayList.get(i).getNumber();
					k = k - j;
					arrayList.get(i).setNumber(k);
					System.out.println(arrayList.get(i));
					isOk = true;
				} else {
					System.out.println("货物不足，销售失败");
				}

			}
		}
		if (isOk) {
			System.out.println("你要销售的商品不存在");
		}
	}

}
