package zk.store.com;

import java.util.ArrayList;

import java.util.Scanner;

public class Shop implements IStore {
	public void help() {
		System.out.println("1.新增商品");
		System.out.println("2.进货");
		System.out.println("3.销售");
		System.out.println("4.参看库存");
		System.out.println("5.退出功能");
	}

	@Override
	public void addStore(ArrayList<Store> arrayList, Scanner sc) {
		String a = sc.next();
		String[] s = a.split(",");
		if (s.length != 4) {
			System.out.println("");
		} else {
			Store c = new Store(s[0], s[1], Double.parseDouble(s[2]), s[3]);
			arrayList.add(c);
			System.out.println(c.toString());
		}

	}

	public void stockStore(ArrayList<Store> arrayList, String number,
			String quantity) {

	}

	public void sellStore(ArrayList<Store> arrayList, String number,
			String quantity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void infoStore(ArrayList<Store> arrayList) {
		// TODO Auto-generated method stub
		
	}

	

	

}
