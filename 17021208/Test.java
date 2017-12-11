package com.homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 制作者：陈亮亮 制作时间：2017年12月7日上午8:33:22 邮箱：2507147605@qq.com
 */
public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<ShuXing> arrayList = new ArrayList<ShuXing>();

		ShiXianLei shiXianLei = new ShiXianLei();

		shiXianLei.zhumoun();

		boolean isQure = true;
		int key;
		while (isQure) {
			System.out.println("\n请输入您的指令：");
			key = sc.nextInt();

			switch (key) {
			case 1:
				System.out.println("请输入信息：");
				System.out.println("格式为：");
				System.out.println("名字,编号,语文成绩,数学成绩,英语成绩");
				shiXianLei.add(arrayList, sc);
				break;

			case 2:
				shiXianLei.info(arrayList);
				break;

			case 3:
				shiXianLei.zimoun();
				boolean isExit = true;
				int key1;
				while (isExit) {
					
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						shiXianLei.findsum(arrayList);
						break;
					case 2:
						shiXianLei.findchinese(arrayList);
						break;
					case 3:
						shiXianLei.findmath(arrayList);
						break;
					case 4:
						shiXianLei.findEnglish(arrayList);
						break;
					case 5:
						isExit = false;
						shiXianLei.zhumoun();
						break;

					default:
						System.out.println("您输入的指令有误！请重输");
						break;
					}

				}
				break;

			case 4:
				isQure = false;
				break;

			default:
				System.out.println("您输入的指令有误！请重输");
				break;
			}

		}
		System.out.println("退出成功");
	}

}
