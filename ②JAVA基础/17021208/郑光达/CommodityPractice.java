/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月6日 下午7:24:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Test03;

import java.util.ArrayList;
import java.util.Scanner;

public class CommodityPractice implements ICommodity {

	void menu() {
		System.out.println("---销售系统帮助中心---");
		System.out.println("[1]新增商品请输入1");
		System.out.println("[2]进货请输入2");
		System.out.println("[3]销售请输入3");
		System.out.println("[4]参看库存请输入4");
		System.out.println("[5]退出系统请输入5");
	}

	@Override
	public void add(ArrayList<Property> arrayList, Scanner sc) {
		String a = sc.next();

		String[] split = a.split(",");

		if (split.length != 4) {
			System.out.println("您输入的格式不正确,请重输！");
			System.out.println("格式为：");
			System.out.println("（编号,名称,价格,数量）");
		} else {
			Property property = new Property();
			property.setId(split[0]);
			property.setName(split[1]);
			property.setPrice(Double.parseDouble(split[2]));
			property.setNumber((int) Double.parseDouble(split[3]));

			arrayList.add(property);

			System.out.println(property.toString());
		}

	}

	@Override
	public void stock(ArrayList<Property> arrayList, Scanner sc) {

		System.out.println("请输入进货编号：");
		String a = sc.next();
		String b = arrayList.get(0).getId();

		for (int i = 0; i < arrayList.size(); i++) {
			if (a.equals(b)) {
				System.out.println("请输入进货数量");
				int b1 = sc.nextInt();
				int sum = 0;
				int a2 = arrayList.get(0).getNumber();
				sum = a2 + b1;
				arrayList.get(i).setNumber(sum);

				System.out.println("进货后数量:" + sum);
				System.out.println(arrayList.get(i).toString());

			} else {
				System.out.println("进货失败,没有该商品");
			}
		}
	}

	@Override
	public void market(ArrayList<Property> arrayList, Scanner sc) {
		System.out.println("请输入销售编号：");
		String a = sc.next();
		String b = arrayList.get(0).getId();

		for (int i = 0; i < arrayList.size(); i++) {
			if (a.equals(b)) {
				System.out.println("请输入销售数量");
				int b1 = sc.nextInt();
				int sum = 0;
				int a2 = arrayList.get(0).getNumber();
				if (a2 >= b1) {
					sum = a2 - b1;
					arrayList.get(i).setNumber(sum);

					System.out.println("销售后数量:" + sum);
					System.out.println(arrayList.get(i).toString());
				} else {
					System.out.println("销售失败,货物库存数量不足！");
				}

			} else {
				System.out.println("销售失败,没有该商品");
			}
		}

	}

	@Override
	public void info(ArrayList<Property> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.toString());
		}
		System.out.println("\n加载完毕！\n");

	}

}
