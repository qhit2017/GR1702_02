/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月6日 下午7:26:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Test03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Property> arrayList = new ArrayList<Property>();

		CommodityPractice commodityPractice = new CommodityPractice();

		commodityPractice.menu();

		int key;
		boolean isQrue = true;
		while (isQrue) {

			System.out.println("\n请输入您的指令：");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("---请输入录入信息：---");
				System.out.println("格式为：");
				System.out.println("（编号,名称,价格,数量）");
				commodityPractice.add(arrayList, sc);
				break;
			case 2:
				commodityPractice.stock(arrayList, sc);
				break;
			case 3:
				commodityPractice.market(arrayList, sc);
				break;
			case 4:
				commodityPractice.info(arrayList);
				break;
			case 5:
				isQrue = false;
				break;

			default:
				System.out.println("\n您输入的指令有误！");
				break;
			}

		}
		System.out.println("\n退出系统");
	}

}
