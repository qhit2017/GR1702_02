package lijingjing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TongXunService implements ITongXun {

	void helpInfo() {
		System.out.println("----通讯录系统----");
		System.out.println("1	录入通讯录信息");
		System.out.println("2	显示所有通讯录信息");
		System.out.println("3	姓名搜索");
		System.out.println("4	性别搜索");
		System.out.println("5	电话搜索");
		System.out.println("6退出功能");
	}

	@Override
	public void addTongXun(ArrayList<TongXun> arrayList, Scanner sc) {
		String s = sc.next();
		// 拆分
		String[] a = s.split(",");
		// 判断
		if (a.length != 3) {
			System.out.println("您输入的信息有误");
		} else {

			TongXun tongXun = new TongXun(a[0], a[1], a[2]);
			arrayList.add(tongXun);
			System.out.println(tongXun.toString());
		}

	}

	@Override
	public void InFoTongXun(ArrayList<TongXun> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			TongXun tongXun = arrayList.get(i);
			System.out.println(tongXun.toString());
		}
		System.out.println("加载完毕");
		/*
		 * for (TongXun tongXun : arrayList) {
		 * System.out.println(tongXun.toString()); } Iterator<TongXun> iterator
		 * = arrayList.iterator();
		 * 
		 * while (iterator.hasNext()) { TongXun tongXun = (TongXun)
		 * iterator.next(); System.out.println(tongXun.toString()); }
		 */

	}

	@Override
	public void findbyname(ArrayList<TongXun> arrayList, String name, Scanner sc) {
		boolean isFind = true;
		for (int i = 0; i < arrayList.size(); i++) {
			TongXun tongXun = arrayList.get(i);
			String string = tongXun.getName();
			if (name.equals(string)) {
				System.out.println(tongXun.toString());
				isFind = false;
			}
		}
		if (!isFind) {
			System.out.println("不存在");
		}
	}

	@Override
	public void findbyxingbie(ArrayList<TongXun> arrayList, String xingbie,
			Scanner sc) {
		boolean isFind = true;
		for (int i = 0; i < arrayList.size(); i++) {
			TongXun tongXun = arrayList.get(i);
			String string = tongXun.getXingbie();
			if (xingbie.equals(string)) {
				System.out.println(tongXun.toString());
				isFind = false;
			}
		}if (!isFind) {
			System.out.println("不存在");
		}
		

	}

	@Override
	public void findbydianhua(ArrayList<TongXun> arrayList, String dianhua,
			Scanner sc) {
		boolean isFind = true;
		for (int i = 0; i < arrayList.size(); i++) {
			TongXun tongXun = arrayList.get(i);
			String string = tongXun.getDianhua();
			if (dianhua.equals(string)) {
				System.out.println(tongXun.toString());
				isFind = false;
			}
		}
		if (!isFind) {
			System.out.println("不存在");
		}
	}
}
