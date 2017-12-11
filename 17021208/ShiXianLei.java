package com.homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 制作者：陈亮亮 制作时间：2017年12月7日上午8:17:22 邮箱：2507147605@qq.com
 */
public class ShiXianLei implements IJieKou {

	@Override
	public void zhumoun() {
		System.out.println("-----成绩管理主菜单-----");
		System.out.println("[1]录入成绩");
		System.out.println("[2]显示成绩");
		System.out.println("[3]查询最高分");
		System.out.println("[4]退出系统");

	}

	void zimoun() {
		System.out.println("-----查询最高分菜单-----");
		System.out.println("[1]打印总分最高分");
		System.out.println("[2]打印数学最高分");
		System.out.println("[3]打印语文最高分");
		System.out.println("[4]打印英语最高分");
		System.out.println("[5]返回主菜单");
	}

	@Override
	public void add(ArrayList<ShuXing> arrayList, Scanner sc) {

		String a = sc.next();

		String[] split = a.split(",");

		if (split.length != 5) {
			System.out.println("您输入的格式有误！请重输：");
		} else {
			ShuXing shuXing = new ShuXing();

			shuXing.setName(split[0]);
			shuXing.setId(split[1]);
			shuXing.setChinese(Double.parseDouble(split[2]));
			shuXing.setMath(Double.parseDouble(split[3]));
			shuXing.setEnglish(Double.parseDouble(split[4]));

			arrayList.add(shuXing);

			System.out.println(shuXing.toString());

		}

	}

	@Override
	public void info(ArrayList<ShuXing> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println(arrayList.get(i));

		}

	}

	@Override
	public void findchinese(ArrayList<ShuXing> arrayList) {
		double max = 0;
		max = arrayList.get(0).getChinese();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getChinese() > max) {
				max = arrayList.get(i).getChinese();
			}

		}
		System.out.println(max);

	}

	@Override
	public void findmath(ArrayList<ShuXing> arrayList) {
		double max = 0;
		max = arrayList.get(0).getMath();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getMath() > max) {
				max = arrayList.get(i).getMath();
			}

		}
		System.out.println(max);

	}

	@Override
	public void findEnglish(ArrayList<ShuXing> arrayList) {
		double max = 0;
		max = arrayList.get(0).getEnglish();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getEnglish() > max) {
				max = arrayList.get(i).getEnglish();
			}

		}
		System.out.println(max);

	}

	@Override
	public void findsum(ArrayList<ShuXing> arrayList) {
		double max = 0;
		max = arrayList.get(0).getsum();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getsum() > max) {
				max = arrayList.get(i).getsum();
			}

		}
		System.out.println(max);

	}

}
